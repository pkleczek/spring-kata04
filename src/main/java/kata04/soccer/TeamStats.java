package kata04.soccer;

import java.util.Comparator;
import java.util.function.Function;

/**
 * Created by pkleczek on 12.12.16.
 */

public class TeamStats {
    //PART3
    public final static Comparator<TeamStats> DIFF_COMPARATOR = Comparator.comparingInt(TeamStats::getDifference);
    public final static Function<String[], TeamStats> EXTRACT = row -> new TeamStats(row[1], Integer.parseInt(row[6]), Integer.parseInt(row[8]));

    private String name;
    private int goalsFor;
    private int goalsAgainst;

    public TeamStats(String name, int goalsFor, int goalsAgainst) {
        this.name = name;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public int getDifference() {
        return Math.abs(goalsFor - goalsAgainst);
    }

    public String getName() {
        return name;
    }
}
