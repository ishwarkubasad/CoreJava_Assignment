package Activity_Comparable;

import java.util.*;

public class Team_3 implements Comparable<Team_3> 
{
	String name;
    List<Player_3> playerList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public List<Player_3> getPlayerList() {
        Collections.sort(playerList);
        return playerList;
    }

    public void setPlayerList(List<Player_3> playerList) {
        this.playerList = playerList;
    }
    
    

    public Team_3(String name) {
        this.name = name;
    }

    void addPlayer(String name) {
        playerList.add(new Player_3(name));
    }

    @Override
    public int compareTo(Team_3 o) {
        return this.name.compareTo(o.getName());
    }

	
}

