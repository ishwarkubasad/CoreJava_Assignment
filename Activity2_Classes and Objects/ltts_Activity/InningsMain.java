package com.ltts_Activity;

import java.util.Scanner;
import com.ltts_Activity.Innings;


public class InningsMain {
	public static void main(String[] args) 
	{
		Innings cric=new Innings();
		System.out.println("Enter the team name:");
		Scanner sc1 =new Scanner(System.in);
		String t=sc1.nextLine();
		cric.setTeamname(t);
		
		System.out.println("Enter the innings:");
		String i=sc1.nextLine();
		cric.setTeamname(i);
		
		System.out.println("Enter the Score:");
		String s=sc1.nextLine();
		cric.setScore(s);
		
		cric.displayinningsdetails(t, i, s);	
		
	}

}
