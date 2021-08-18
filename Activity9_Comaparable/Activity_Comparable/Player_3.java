package Activity_Comparable;

public class Player_3 implements Comparable<Player_3> 
{
	private String name;

	public Player_3(){
		super();
	}
	public Player_3(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 @Override
	    public String toString() {
	        return name;
	    }
	 
	 
	@Override
	public int compareTo(Player_3 player) {
		// TODO Auto-generated method stub
		return this.name.compareTo(player.getName());
	}
}
