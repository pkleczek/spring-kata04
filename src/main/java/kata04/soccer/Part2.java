package kata04.soccer;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by pkleczek on 12.12.16.
 */
public class Part2 {
    public static void main(String[] args) throws URISyntaxException {
        SoccerRepository repository = new SoccerRepository();
        SoccerService service = new SoccerService();
        Path soccerData = Paths.get(Part2.class.getResource("/data/football.dat").toURI());
        TeamStats team = service.findLowestDifference(repository.read(soccerData));
        System.out.printf("Team with lowest difference of %s is %s", team.getDifference(), team.getName());
    }
}
