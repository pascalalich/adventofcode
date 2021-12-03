package de.itmadesimple.adventofcode.year2021;

import org.junit.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class Day3Puzzle1Test {

    @Test
    public void testEmpty() {
        String[] input = {};
        assertThat(runDay3(input)).isEqualTo(0);
    }

    @Test
    public void testOneOneBitValue() {
        String[] input = {
                "0"
        };
        assertThat(runDay3(input)).isEqualTo(0);
    }

    @Test
    public void testOneTwoBitValue() {
        String[] input = {
                "10",
        };
        assertThat(runDay3(input)).isEqualTo(2);
    }

    @Test
    public void testThreeThreeBitValues() {
        String[] input = {
                "101",
                "011",
                "101"
        };
        assertThat(runDay3(input)).isEqualTo(10);
    }

    @Test
    public void testValuesFromDoc() {
        String[] input = {
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010"
        };
        assertThat(runDay3(input)).isEqualTo(198);
    }

    private Integer runDay3(String... inputValues) {
        Day3Puzzle1 puzzle = new Day3Puzzle1();
        return puzzle.solvePuzzle(Arrays.stream(inputValues).map(Measurement::parse).collect(toList()));
    }
}
