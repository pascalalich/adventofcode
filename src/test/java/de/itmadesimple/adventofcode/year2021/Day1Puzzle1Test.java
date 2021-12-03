package de.itmadesimple.adventofcode.year2021;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class Day1Puzzle1Test {

    @Test
    public void testEmpty() {
        Integer[] input = {};
        assertThat(runDay1(input)).isEqualTo(0);
    }

    @Test
    public void testOneValue() {
        Integer[] input = {
                123
        };
        assertThat(runDay1(input)).isEqualTo(0);
    }

    @Test
    public void testValuesFromDoc() {
        Integer[] input = {
                199,
                200,
                208,
                210,
                200,
                207,
                240,
                269,
                260,
                263
        };
        assertThat(runDay1(input)).isEqualTo(7);
    }

    private Integer runDay1(Integer... inputValues) {
        return new Day1Puzzle1().solvePuzzle(asList(inputValues));
    }
}
