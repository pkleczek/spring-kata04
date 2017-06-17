package kata04.unified;

import kata04.soccer.TeamStats;
import kata04.weather.WeatherMeasurement;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UnifiedKataTest {


    /*@Test
    public void itShouldOpenFile() throws Exception {
        UnifiedKata kata = new UnifiedKata();

        List<String> footballLines = kata.readLines("/data/football.dat");
        List<String> weatherLines = kata.readLines("/data/weather.dat");

        assertThat(footballLines.size(), is(22));
        assertThat(weatherLines.size(), is(33));
    }

    @Test
    public void itShouldExtractData() throws Exception {
        UnifiedKata kata = new UnifiedKata();

        List<String> footballLines = kata.readLines("/data/football.dat");
        List<TeamStats> footballStats = kata.extractData(footballLines, UnifiedKata.EXTRACT);

        List<String> weatherLines = kata.readLines("/data/weather.dat");
        List<WeatherMeasurement> weatherMeasurements = kata.extractData(weatherLines, UnifiedKata.EXTRACT);

        assertThat(footballStats.size(), is(20));
        assertThat(weatherMeasurements.size(), is(30));
    }

    @Test
    public void itShouldFindLowestDifference() throws Exception {
        UnifiedKata kata = new UnifiedKata();

        List<String> footballLines = kata.readLines("/data/football.dat");
        List<TeamStats> footballStats = kata.extractData(footballLines, UnifiedKata.EXTRACT);

        List<String> weatherLines = kata.readLines("/data/weather.dat");
        List<WeatherMeasurement> weatherMeasurements = kata.extractData(weatherLines, UnifiedKata.EXTRACT);

        TeamStats team = kata.findSmallestDifference(footballStats, TeamStats.DIFF_COMPARATOR);
        WeatherMeasurement weather = kata.findSmallestDifference(weatherMeasurements, WeatherMeasurement.SPREAD_COMPARATOR);

        assertThat(team.getName(), is("Aston_Villa"));
        assertThat(weather.getDay(), is(14));
    }*/

    @Test
    public void testFindSmallestDifference() {

        TeamStats team = UnifiedKata.getSmallestDifference("/data/football.dat", TeamStats.EXTRACT, TeamStats.DIFF_COMPARATOR);
        assertThat(team.getName(), is("Aston_Villa"));

        WeatherMeasurement weather = UnifiedKata.getSmallestDifference("/data/weather.dat", WeatherMeasurement.EXTRACT, WeatherMeasurement.SPREAD_COMPARATOR);
        assertThat(weather.getDay(), is(14));

    }

}