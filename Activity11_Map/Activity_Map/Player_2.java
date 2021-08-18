package Activity_Map;

public class Player_2 {
	String bowlerName;
	int wicketCount;
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	 public Player_2() {
	    }

	    public Player_2(String bowlerName, int wicketCount) {
	        this.bowlerName = bowlerName;
	        this.wicketCount = wicketCount;
	    }

}
