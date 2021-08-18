package com.ltts_Activity;

import java.util.Scanner;
import com.ltts_Activity.Employee5;

public class EmployeeMain5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		e.setName("Ravi");
		e.setAddress("Pune");
		e.setMobile("9998887771");
		
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());
		
		System.out.println("Verify and Update the details:\r\n");
		
		System.out.println("Menu"+"1. Update Employee name\r\n"
				+ "    2. Update Employee Address\r\n"
				+ "    3. Update Employee mobile\r\n"
				+ "    4. All information correct/Exit");
	   
		
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Current name: "+e.getName()+"\nEnter new name:");
			String update = sc.nextLine();
			e.setName(sc.nextLine());
			
			System.out.println("Name: "+e.getName());
			System.out.println("Address: "+e.getAddress());
			System.out.println("Mobile: "+e.getMobile());
			
		
		}
		if(choice == 2)
		{
			System.out.println("Current address: "+e.getAddress()+"\nEnter new address:");
			String update = sc.nextLine();
			e.setAddress(sc.nextLine());
			
			System.out.println("Name: "+e.getName());
			System.out.println("Address: "+e.getAddress());
			System.out.println("Mobile: "+e.getMobile());
		}
		if(choice == 3)
		{
			System.out.println("Current mobile: "+e.getMobile()+"\nEnter new mobile:");
			String update = sc.nextLine();
			e.setMobile(sc.nextLine());
			
			System.out.println("Name: "+e.getName());
			System.out.println("Address: "+e.getAddress());
			System.out.println("Mobile: "+e.getMobile());
		}
		if(choice == 4)
		{
			System.out.println("The details are: ");
			System.out.println("Name: "+e.getName());
			System.out.println("Address: "+e.getAddress());
			System.out.println("Mobile: "+e.getMobile());
		}
		}
	}

