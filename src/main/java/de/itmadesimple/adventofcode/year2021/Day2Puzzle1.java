package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

public class Day2Puzzle1 extends AdventOfCodePuzzle<Command> {

    Integer solvePuzzle(List<Command> inputValues) {
        int horizontal = 0;
        int depth = 0;
        for (Command command : inputValues) {
            switch (command.getDirection()) {
                case FORWARD:
                    horizontal += command.getDistance();
                    break;
                case DOWN:
                    depth += command.getDistance();
                    break;
                case UP:
                    depth -= command.getDistance();
                    break;
            }
        }
        return horizontal * depth;
    }

    @Override
    protected Function<String, Command> parseFunction() {
        return Command::parse;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Day2, Puzzle 1: ");
        Integer result = new Day2Puzzle1().solvePuzzle(Path.of("target/classes/input/day2.txt"));
        System.out.println(result); // 2120749
    }
}