package com.ltts_Activity;
import java.util.Scanner;

import com.ltts_Activity.Customer;
public class CustomerMain {
	public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
		
		Employee myobj=new Employee();
		System.out.println("enter the details:");
		
		String s1= sc.nextLine();
		String words[]=s1.split("\\s");
	 
		
		String nam1=words[0];
		myobj.setName(nam1);
        String n= myobj.getName();
		
		
		
		String addr1=words[1];
	    myobj.setAddress(addr1);
	    String addrs=myobj.getAddress();
		
		
		
		String m=words[2];
		myobj.setMobile(m);
	    String mob= myobj.getMobile();
		
	    
		System.out.println("Name:"+ n);
		System.out.println("Address:"+ addrs);
		System.out.println("Mobile:"+ mob);
	    
	    }
		
	}


