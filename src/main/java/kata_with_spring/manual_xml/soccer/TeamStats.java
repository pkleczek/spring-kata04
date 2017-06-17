package kata_with_spring.manual_xml.soccer;

/**
 * Created by pkleczek on 12.12.16.
 */

public class TeamStats {
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
