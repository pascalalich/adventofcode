package de.itmadesimple.adventofcode.year2021;

import java.util.BitSet;
import java.util.List;

public class Measurement {

    private final BitSet bits;
    private final int length;

    private Measurement(BitSet bits, int length) {
        this.bits = bits;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean isSet(int bitIndex) {
        if (bitIndex < 0 || bitIndex >= length) {
            throw new IllegalArgumentException("Invalid bitIndex for length " + length);
        }
        return bits.get(bitIndex);
    }

    public int getIntValue() {
        return Integer.parseInt(toString(), 2);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            b.append(bits.get(i) ? "1" : "0");
        }
        return b.toString();
    }

    public static Measurement parse(String line) {
        BitSet bitSet = new BitSet(line.length());
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '1') {
                bitSet.set(i);
            }
        }
        return new Measurement(bitSet, line.length());
    }

    public static Measurement getGammaRate(List<Measurement> measurements) {
        int[] numberOfBitsOne = new int[measurements.get(0).getLength()];
        for (Measurement measurement : measurements) {
            for (int i = 0; i < measurement.getLength(); i++) {
                if (measurement.isSet(i)) {
                    numberOfBitsOne[i]++;
                }
            }
        }
        BitSet gammaBits = new BitSet(numberOfBitsOne.length);
        for (int i = 0; i < numberOfBitsOne.length; i++) {
            gammaBits.set(i, (numberOfBitsOne[i] > measurements.size() / 2));
            // TODO what about same number of 0's and 1's?
        }
        return new Measurement(gammaBits, numberOfBitsOne.length);
    }

    public Measurement inverse() {
        BitSet inversed = (BitSet) bits.clone();
        inversed.flip(0, length);
        return new Measurement(inversed, length);
    }
}
