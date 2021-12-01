package de.itmadesimple.adventofcode.year2021;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class Day1Puzzle2Test {

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
    public void testThreeValues() {
        Integer[] input = {
            123, 130, 129
        };
        assertThat(runDay1(input)).isEqualTo(0);
    }

    @Test
    public void testFourValuesIncrease() {
        Integer[] input = {
            123, 130, 129, 125
        };
        assertThat(runDay1(input)).isEqualTo(1);
    }

    @Test
    public void testFourValuesDecrease() {
        Integer[] input = {
            123, 130, 129, 122
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
        assertThat(runDay1(input)).isEqualTo(5);
    }

    private Integer runDay1(Integer... inputValues) {
        return Day1Puzzle2.countDepthMeasurementIncreases(asList(inputValues));
    }
}
