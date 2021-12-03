package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Day1Puzzle2 extends AdventOfCodePuzzle<Integer> {

    Integer solvePuzzle(List<Integer> inputValues) {
        if (inputValues.size() < 4) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < inputValues.size() - 2; i++) {
            int sum1 = inputValues.get(i - 1) + inputValues.get(i) + inputValues.get(i + 1);
            int sum2 = inputValues.get(i) + inputValues.get(i + 1) + inputValues.get(i + 2);
            if (sum2 > sum1) {
                count++;
            }
        }
        return count;
    }

    @Override
    protected Integer parse(String line) {
        return Integer.parseInt(line);
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Day1, Puzzle 2: ");
        Integer result = new Day1Puzzle2().solvePuzzle(Path.of("target/classes/input/day1.txt"));
        System.out.println(result); // 1858
    }
}