package kata_with_spring.java_config.soccer;

import java.util.Comparator;

/**
 * Created by pkleczek on 12.12.16.
 */

public class SoccerService {
    private SoccerRepository soccerRepository;

    public TeamStats findLowestDifference() {
        return soccerRepository.read().stream().min(Comparator.comparingInt(TeamStats::getDifference)).get();
    }

    public SoccerRepository getSoccerRepository() {
        return soccerRepository;
    }

    public void setSoccerRepository(SoccerRepository soccerRepository) {
        this.soccerRepository = soccerRepository;
    }
}
