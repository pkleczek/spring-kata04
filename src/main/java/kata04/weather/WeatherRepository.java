package kata04.weather;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pkleczek on 11.12.16.
 */

public class WeatherRepository {
    public List<WeatherMeasurement> read(Path weatherData) {
        try {
            return Files.readAllLines(weatherData).stream()
                    .map(line -> line.trim().split("(\\s)+"))
                    .filter(row -> row[0].matches("\\d+"))
                    .map(row -> new WeatherMeasurement(cleanValue(row[0]), cleanValue(row[1]), cleanValue(row[2])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int cleanValue(String s) {
        return Integer.parseInt(s.replaceAll("[*]", ""));
    }
}