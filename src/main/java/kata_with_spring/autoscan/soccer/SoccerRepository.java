package kata_with_spring.autoscan.soccer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SoccerRepository {

    @Value("#{environment['football.location']}")
    private Path soccerData;

    public List<TeamStats> read() {
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
