package kata_with_spring.autoscan.soccer;

import org.springframework.stereotype.Service;

import java.util.Comparator;

/**
 * Created by pkleczek on 12.12.16.
 */

@Service
public class SoccerService {
    private SoccerRepository soccerRepository;

    public TeamStats findLowestDifference() {
        return soccerRepository.read().stream().min(Comparator.comparingInt(TeamStats::getDifference)).get();
    }

    public SoccerService(SoccerRepository soccerRepository) {
        this.soccerRepository = soccerRepository;
    }
}
