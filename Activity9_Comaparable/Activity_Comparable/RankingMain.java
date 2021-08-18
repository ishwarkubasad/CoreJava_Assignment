package comparable.PlayerRanking;

import java.util.*;   
import java.util.Scanner;

public class RankingMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Ranking> player=new ArrayList<Ranking>();  
		
		System.out.println("Please provide the number of  players ");
		int NoOfPlayer = sc.nextInt();
        
        for(int i=0;i<NoOfPlayer;i++)
		{
			System.out.println("Enter the name of the player "+(i+1));
			String PlayerName = sc.nextLine();
			
			System.out.println("Enter the score of the player "+(i+1));
			int PlayerScore = sc.nextInt();
			
			player.add(new Ranking(PlayerName, PlayerScore));
		}
		
		
		Collections.sort(player);  
		
		for(Ranking R:player)
		{  	 		
			System.out.println(R.name+" "+R.score); 	
		}
		sc.close();
	}
}


  
