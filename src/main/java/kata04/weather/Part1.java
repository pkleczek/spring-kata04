package kata04.weather;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by pkleczek on 11.12.16.
 */
public class Part1 {
    public static void main(String[] args) throws URISyntaxException {
        WeatherRepository weatherRepository = new WeatherRepository();
        WeatherService weatherService = new WeatherService();

        Path weatherData = Paths.get(Part1.class.getResource("/data/weather.dat").toURI());

        List<WeatherMeasurement> weatherMeasurements = weatherRepository.read(weatherData);
        WeatherMeasurement lowestSpread = weatherService.findLowestSpread(weatherMeasurements);

        System.out.printf("Lowest spread was on day %s equal %s", lowestSpread.getDay(), lowestSpread.getSpread());
    }
}
