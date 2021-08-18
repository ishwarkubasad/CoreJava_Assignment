package Activity_Listinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_1
{
	public static void main(String args[])
    {
        List<String> playerList = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the player details ");
        System.out.println("Enter player name ");
		String playerName=sc.nextLine();
        playerList.add(playerName);
        
        System.out.println("Enter player age ");
		String playerAge=sc.nextLine();
        playerList.add(playerAge);
        
        System.out.println("Enter the country ");
		String playerCountry=sc.nextLine();
        playerList.add(playerCountry);
        
        System.out.println("Player Details");
        for(int i=0;i<3;i++)
        {
        	System.out.println(playerList.get(i));					
        }					
        
        System.out.println("Enter Skill");
		String playerSkill=sc.nextLine();
		
		System.out.println("Enter the position to add the skill");
		int position_add = sc.nextInt();
        playerList.set(position_add,playerSkill);
        					
        System.out.println("Player Details");
        for(int i=0;i<3;i++)
        {
        	System.out.println(playerList.get(i));					
        }				
        
        System.out.println("Enter the position of the detail to be removed ");
		int position_remove = sc.nextInt();
        playerList.remove(position_remove);
       
        System.out.println("Player Details");
        for(int i=0;i<2;i++)
        {
        	System.out.println(playerList.get(i));					
        }

        sc.close();
    }
}

