package Activity_Exceptionhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Winner_4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> teams= new ArrayList<String>(); 
		Scanner sc= new Scanner(System.in);
		
        teams.add("Sunrisers Hyderabad");  
        teams.add("Delhi Capital");  
        teams.add("Royal Challengers Bangalore");  
        teams.add("Kolkata Knight Riders"); 
        teams.add("Mumbai Indians"); 
        teams.add("Chennai Super Kings");
        teams.add("Kings XI Punjab");  
        teams.add("Rajasthan Royals");
     try 
     {
        System.out.println("Enter the expected winner team of IPL Season 13");
        String winner=sc.nextLine();
        for(int i=0;i<teams.size();i++)
        {
      	if(teams.contains(winner))
      	{
      		continue;
      	}
      	else
      	{
      		throw new Exception();
      	}
        }
        System.out.println("Enter the expected runner team of IPL Season 13");
        String runner=sc.nextLine();
        for( int i=0;i<teams.size();i++)
          {
        	if(teams.contains(winner)||teams.contains(runner))
        	{
        		if(teams.get(i).equals(winner))
        		{
        			System.out.println("Expected IPL Season 13 winner: "+teams.get(i));
        		}
        		if(teams.get(i).equals(runner))
        		{
        			System.out.println("Expected IPL Season 13 runner: "+teams.get(i));
        		}
        	}
        	else
	        {
	        	throw new Exception();
	        }
          }	
        }
        catch (Exception e) 
		   {
		      System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
		   }
        sc.close();
	}
}


