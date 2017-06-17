package kata04.soccer;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SoccerServiceTest {
    @Test
    public void getSmallestDifferenceTeam() throws Exception {
        SoccerService service = new SoccerService();

        List<TeamStats> stats = Arrays.asList(new TeamStats("A", 10, 1), new TeamStats("B", 20, 40));
        TeamStats team = service.findLowestDifference(stats);

        assertEquals(stats.get(0), team);
    }
}
