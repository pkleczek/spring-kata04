package kata_with_spring.java_config.weather;

/**
 * Created by pkleczek on 11.12.16.
 */
public class WeatherMeasurement {
    private int day, min, max;

    public WeatherMeasurement(int day, int min, int max) {
        this.day = day;
        this.min = min;
        this.max = max;
    }

    public int getDay() {
        return day;
    }

    public int getSpread() {
        return Math.abs(min - max);
    }
}
