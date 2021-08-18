package com.ltts_Activity;

import java.util.Scanner;
import com.ltts_Activity.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Employee myobj=new Employee();
		System.out.println("enter name:");
		String nam=sc.nextLine();
		myobj.setName(nam);
        String n= myobj.getName();
		
		
		System.out.println("enter address:");
		String addr=sc.nextLine();
	    myobj.setAddress(addr);
	    String addrs=myobj.getAddress();
		
		
		System.out.println("enter mobile:");
		String m=sc.nextLine();
		myobj.setMobile(m);
	    String mob= myobj.getMobile();
		
	    System.out.println("Employee Details");
		System.out.println("Name:"+ n);
		System.out.println("Address:"+ addrs);
		System.out.println("Mobile:"+ mob);
		
	    }

}
