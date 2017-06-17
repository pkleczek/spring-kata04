package kata04.unified;

import kata04.soccer.TeamStats;
import kata04.weather.WeatherMeasurement;

/**
 * Created by pkleczek on 12.12.16.
 */
public class Part3 {
    public static void main(String[] args) {
        TeamStats team = UnifiedKata.getSmallestDifference("/data/football.dat", TeamStats.EXTRACT, TeamStats.DIFF_COMPARATOR);
        WeatherMeasurement weather = UnifiedKata.getSmallestDifference("/data/weather.dat", WeatherMeasurement.EXTRACT, WeatherMeasurement.SPREAD_COMPARATOR);
        System.out.println(team.getName());
        System.out.println(weather.getDay());

    }
}
