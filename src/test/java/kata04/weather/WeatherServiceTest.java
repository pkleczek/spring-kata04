package kata04.weather;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WeatherServiceTest {

    @Test
    public void findLowestSpread() {
        // given
        List<WeatherMeasurement> weatherData = Arrays.asList(new WeatherMeasurement(1, 20, 30), new WeatherMeasurement(2, 20, 21));

        //when
        WeatherService weatherService = new WeatherService();
        WeatherMeasurement lowestSpread = weatherService.findLowestSpread(weatherData);

        //then
        Assert.assertEquals(weatherData.get(1), lowestSpread);
    }
}
