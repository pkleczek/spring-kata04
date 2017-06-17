package kata04.soccer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pkleczek on 12.12.16.
 */
public class SoccerRepository {

    public List<TeamStats> read(Path soccerData) {
        try {
            return Files.readAllLines(soccerData).stream()
                    .map(line -> line.trim().split("(\\s)+"))
                    .filter(row -> row[0].matches("\\d+\\."))
                    .map(row -> new TeamStats(row[1], Integer.parseInt(row[6]), Integer.parseInt(row[8])))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
