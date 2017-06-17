package kata04.soccer;

import java.util.Comparator;
import java.util.List;

/**
 * Created by pkleczek on 12.12.16.
 */

public class SoccerService {
    public TeamStats findLowestDifference(List<TeamStats> stats) {
        return stats.stream().min(Comparator.comparingInt(TeamStats::getDifference)).get();
    }
}
