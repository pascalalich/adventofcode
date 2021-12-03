package de.itmadesimple.adventofcode.year2021;

import org.junit.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

public class Day2Puzzle2Test {

    @Test
    public void testEmpty() {
        String[] input = {};
        assertThat(runDay2(input)).isEqualTo(0);
    }

    @Test
    public void testOneForwardValue() {
        String[] input = {
                "forward 5"
        };
        assertThat(runDay2(input)).isEqualTo(0);
    }

    @Test
    public void testOneDownValue() {
        String[] input = {
                "down 3"
        };
        assertThat(runDay2(input)).isEqualTo(0);
    }

    @Test
    public void testOneDownOneForwardValue() {
        String[] input = {
                "down 3",
                "forward 5"
        };
        assertThat(runDay2(input)).isEqualTo(75);
    }

    @Test
    public void testValuesFromDoc() {
        String[] input = {
                "forward 5",
                "down 5",
                "forward 8",
                "up 3",
                "down 8",
                "forward 2"
        };
        assertThat(runDay2(input)).isEqualTo(900);
    }

    private Integer runDay2(String... inputValues) {
        Day2Puzzle2 puzzle = new Day2Puzzle2();
        return puzzle.solvePuzzle(Arrays.stream(inputValues).map(Command::parse).collect(toList()));
    }
}
