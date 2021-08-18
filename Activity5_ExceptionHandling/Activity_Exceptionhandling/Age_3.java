package Activity_Exceptionhandling;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Age_3
{
	public static void main(String[] args) 
	{
		 try 
		 { 
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Enter the player name  ");
			String player=sc.nextLine();
			 
			 System.out.println("Enter the player age ");
			 int age =sc.nextInt();
			 
			 if(age<19)
			 {
				 throw new Exception();
			 }
			 else
			 {
				 System.out.println("Player name: "+player); 
				 System.out.println("player age: "+age);
			 }
		      sc.close();
		   }
		    
		   catch (Exception e) 
		   {
		      System.out.println(e);
		   }

}
}