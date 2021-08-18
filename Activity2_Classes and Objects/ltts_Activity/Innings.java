package com.ltts_Activity;

public class Innings {
	private String teamname;
	private String innings;
	private String score;
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInnings() {
		return innings;
	}
	public void setInnings(String innings) {
		this.innings = innings;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public void displayinningsdetails(String teamname, String innings, String score)
	{
		System.out.println("Teamname:"+teamname);
		System.out.println("Innings:"+innings);
		System.out.println("Score:"+score);
	}
	
	
	

}
