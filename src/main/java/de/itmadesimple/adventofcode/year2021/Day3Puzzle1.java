package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

public class Day3Puzzle1 extends AdventOfCodePuzzle<Measurement> {

    Integer solvePuzzle(List<Measurement> inputValues) {
        if (inputValues.isEmpty()) {
            return 0;
        }
        Measurement gammaRate = Measurement.getGammaRate(inputValues);
        Measurement epsilonRate = gammaRate.inverse();
        return gammaRate.getIntValue() * epsilonRate.getIntValue();
    }

    @Override
    protected Function<String, Measurement> parseFunction() {
        return Measurement::parse;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Day3, Puzzle 1: ");
        Integer result = new Day3Puzzle1().solvePuzzle(Path.of("target/classes/input/day3.txt"));
        System.out.println(result); // 845186
    }
}