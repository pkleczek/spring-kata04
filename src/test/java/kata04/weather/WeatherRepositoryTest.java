package kata04.weather;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeatherRepositoryTest {
    @Test
    public void readTemperatureData() throws Exception {
        WeatherRepository repository = new WeatherRepository();
        Path weatherData = Paths.get(this.getClass().getResource("/data/weather.dat").toURI());
        List<WeatherMeasurement> weather = repository.read(weatherData);

        assertThat(weather.size(), is(30));
    }
}
