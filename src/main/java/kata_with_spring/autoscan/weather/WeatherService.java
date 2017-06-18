package kata_with_spring.autoscan.weather;

import org.springframework.stereotype.Service;

import java.util.Comparator;

/**
 * Created by pkleczek on 11.12.16.
 */
@Service
public class WeatherService {
    private WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public WeatherMeasurement findLowestSpread() {
        Comparator<WeatherMeasurement> min = Comparator.comparingInt(WeatherMeasurement::getSpread);
        return weatherRepository.read().stream().min(min).get();
    }
}
