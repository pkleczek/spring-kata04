package kata04.unified;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by pkleczek on 12.12.16.
 */

public class UnifiedKata {
/*
    public <T> T getSmallestDifference(String fileName, Function<String[], T> mapper, Comparator<T> comparator) {
        List<String> lines = readLines(fileName);
        List<T> data = extractData(lines, mapper);
        return findSmallestDifference(data, comparator);
    }


    public List<String> readLines(String fileName) {
        try {
            Path path = Paths.get(this.getClass().getResource(fileName).toURI());
            return Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> List<T> extractData(List<String> data, Function<String[], T> mapper) {
        return data.stream()
                .map(line -> line.trim().split("(\\s)+"))
                .filter(row -> row[0].matches("\\d+\\.?"))
                .map(mapper).collect(Collectors.toList());
    }

    public <T> T findSmallestDifference(List<T> data, Comparator<T> comparator) {
        return data.stream().min(comparator).get();
    }*/


    public static <T> T getSmallestDifference(String fileName, Function<String[], T> mapper, Comparator<T> comparator) {
        List<String> lines = readLines(fileName);
        List<T> data = extractData(lines, mapper);
        return findSmallestDifference(data, comparator);
    }


    private static List<String> readLines(String fileName) {
        try {
            Path path = Paths.get(UnifiedKata.class.getResource(fileName).toURI());
            return Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static <T> List<T> extractData(List<String> data, Function<String[], T> mapper) {
        return data.stream()
                .map(line -> line.trim().split("(\\s)+"))
                .filter(row -> row[0].matches("\\d+\\.?"))
                .map(mapper).collect(Collectors.toList());
    }

    private static <T> T findSmallestDifference(List<T> data, Comparator<T> comparator) {
        return data.stream().min(comparator).get();
    }
}
