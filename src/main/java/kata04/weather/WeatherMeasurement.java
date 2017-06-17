package kata04.weather;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by pkleczek on 11.12.16.
 */
public class WeatherMeasurement {
    //PART 3
    public final static Comparator<WeatherMeasurement> SPREAD_COMPARATOR = Comparator.comparingInt(WeatherMeasurement::getSpread);
    public final static Function<String[], WeatherMeasurement> EXTRACT = new Function<String[], WeatherMeasurement>() {
        @Override
        public WeatherMeasurement apply(String[] row) {
            return new WeatherMeasurement(cleanRow(row[0]), cleanRow(row[1]), cleanRow(row[2]));
        }

        private int cleanRow(String s) {
            return Integer.parseInt(s.replaceAll("[*]", ""));
        }
    };

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
