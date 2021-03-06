package Activity_Comparable;

class Ranking implements Comparable<Ranking>
{ 
	String  name;
	int 	score;
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getScore() 
	{
		return score;
	}
	public void setScore(int score) 
	{
		this.score = score;
	}
	public Ranking(String name, int score)
	{
		super();
		this.name = name;
		this.score = score;
	}

	public int compareTo(Ranking R)
	{  
		if(score==R.score)  
		return 0;  
		else if(score<R.score)  
		return 1;  
		else  
		return -1;  
	}  	
}
