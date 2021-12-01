package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Day1Puzzle1 {

    public static List<Integer> loadInputFromFile(Path inputPath) throws IOException {
        return Files.lines(inputPath).map(Integer::parseInt).collect(toList());
    }

    public static Integer countDepthMeasurementIncreases(List<Integer> inputValues) {
        if (inputValues.size() < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < inputValues.size(); i++) {
            if (inputValues.get(i) > inputValues.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Day1: ");
        Integer result = countDepthMeasurementIncreases(loadInputFromFile(Path.of("target/classes/input/day1puzzle1.txt")));
        System.out.println(result);
    }
}