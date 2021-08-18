package com.ltts;

import java.util.Scanner;

public class arraytry {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []arr=new int[3];
		System.out.println("enter array values");
		for(int i=0; i<3;i++)
		{
		arr[i]=sc.nextInt();
		
	    }
		for(int j=0;j<3;j++)
		{
		System.out.println(arr[j]);
	
		}
	}
}
