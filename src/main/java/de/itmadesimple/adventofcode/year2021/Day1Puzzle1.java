package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

public class Day1Puzzle1 extends AdventOfCodePuzzle<Integer> {

    Integer solvePuzzle(List<Integer> inputValues) {
        if (inputValues.size() < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < inputValues.size(); i++) {
            if (inputValues.get(i) > inputValues.get(i - 1)) {
                count++;
            }
        }
        return count;
    }

    @Override
    protected Function<String, Integer> parseFunction() {
        return Integer::parseInt;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Day1, Puzzle 2: ");
        Integer result = new Day1Puzzle1().solvePuzzle(Path.of("target/classes/input/day1.txt"));
        System.out.println(result); // 1832
    }
}