package Activity_Comparator;

import java.util.Comparator;

public class TeamComparator implements Comparator<Team> {

    @Override
    public int compare(Team o1, Team o2) {
        if (o1.getNoOfMatches() > o2.getNoOfMatches()) {
            return 1;
        } else if (o1.getNoOfMatches() < o2.getNoOfMatches()) {
            return -1;
        }
        return 0;
    }

}
