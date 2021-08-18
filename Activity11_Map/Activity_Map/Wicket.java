package Activity_Map;

public class Wicket {

    private String playerName;
    private Bowler bowler;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }

    public Wicket() {
    }

    public Wicket(String playerName, Bowler bowler) {
        this.playerName = playerName;
        this.bowler = bowler;
    }

}
