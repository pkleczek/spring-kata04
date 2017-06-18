package kata_with_spring.autoscan.weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pkleczek on 11.12.16.
 */
@Repository
public class WeatherRepository {
    @Value("#{environment['weather.location']}")
    private Path weatherData;

    public List<WeatherMeasurement> read() {
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

    public Path getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Path weatherData) {
        this.weatherData = weatherData;
    }

    private static int cleanValue(String s) {
        return Integer.parseInt(s.replaceAll("[*]", ""));
    }
}
