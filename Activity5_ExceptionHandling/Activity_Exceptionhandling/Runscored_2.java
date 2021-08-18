package Activity_Exceptionhandling;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Runscored_2 
{
	public static void main(String[] args) 
	{
		 try 
		 { 
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Enter the number of overs ");
			int overs=sc.nextInt();
			 
			 System.out.println("Enter the number of runs for each over");
			 int array[]= new int[overs];
			 for(int i=0;i<overs;i++)
			 {
				
				 int runs=sc.nextInt();
				 array[i]=runs;
			 }
			 
			 System.out.println("Enter the over number");
			 int over_no=sc.nextInt();
			 System.out.println("Runs scored in this over : "+ Array.get(array, over_no));
			 
		      sc.close();
		   }
		    
		   catch (Exception e) 
		   {
		      System.out.println(e);
		   }

}
}
