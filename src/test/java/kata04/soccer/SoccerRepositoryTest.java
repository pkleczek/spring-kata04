package kata04.soccer;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SoccerRepositoryTest {
    @Test
    public void readSoccerData() throws Exception {
        SoccerRepository repository = new SoccerRepository();
        Path soccerData = Paths.get(this.getClass().getResource("/data/football.dat").toURI());
        List<TeamStats> teams = repository.read(soccerData);

        assertThat(teams.size(), is(20));
    }
}
