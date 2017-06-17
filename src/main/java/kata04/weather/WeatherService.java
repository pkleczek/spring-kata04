package kata04.weather;

import java.util.Comparator;
import java.util.List;

/**
 * Created by pkleczek on 11.12.16.
 */

public class WeatherService {
    public WeatherMeasurement findLowestSpread(List<WeatherMeasurement> weatherData) {
        Comparator<WeatherMeasurement> min = Comparator.comparingInt(WeatherMeasurement::getSpread);
        return weatherData.stream().min(min).get();
    }
}
