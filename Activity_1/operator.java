package com.ltts;

import java.util.Scanner;

public class operator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		System.out.println("number entered is "+(num));
		int a=10, b=20,i,z=0;
	    System.out.println("a+b=" + (a+b));
	    System.out.println(a-b);
	    System.out.println(a/b);
	    System.out.println(a*b);
	    System.out.println(a%b);
	    if(a!=0 && a>0)
	    {
	    	System.out.println("a is positive number");
	    	
	    }
	    else
	    {
	    	System.out.println(a);
	    }
	    for(i=0;i<=3;i++)
	    {
	    	System.out.println(i);
	    }
	    while(z<3)
	    {
	    	System.out.println("program is in while loop");
	    	z=z+1;
	    }
		
	}
}
