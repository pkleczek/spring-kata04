package kata_with_spring.java_config.weather;

import java.util.Comparator;

/**
 * Created by pkleczek on 11.12.16.
 */

public class WeatherService {
    private WeatherRepository weatherRepository;

    public WeatherMeasurement findLowestSpread() {
        Comparator<WeatherMeasurement> min = Comparator.comparingInt(WeatherMeasurement::getSpread);
        return weatherRepository.read().stream().min(min).get();
    }

    public WeatherRepository getWeatherRepository() {
        return weatherRepository;
    }

    public void setWeatherRepository(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }
}
