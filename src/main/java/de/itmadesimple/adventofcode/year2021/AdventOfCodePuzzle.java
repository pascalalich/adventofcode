package de.itmadesimple.adventofcode.year2021;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

/**
 * @param <T> the input type (a parsed line from input file)
 */
public abstract class AdventOfCodePuzzle<T> {

    public final Integer solvePuzzle(Path inputPath) throws IOException {
        return solvePuzzle(loadInputFromFile(inputPath));
    }

    abstract Integer solvePuzzle(List<T> inputValues);

    private List<T> loadInputFromFile(Path inputPath) throws IOException {
        return Files.lines(inputPath)
                .map(parseFunction())
                .filter(Objects::nonNull)
                .collect(toList());
    }

    protected abstract Function<String, T> parseFunction();

}
