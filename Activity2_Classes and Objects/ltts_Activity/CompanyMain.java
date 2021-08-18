package com.ltts_Activity;

import com.ltts_Activity.Company;

import java.util.Scanner;


public class CompanyMain {
	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		Company c = new Company();

		c.setName(sc.nextLine());
		
		String emp = sc.nextLine();
		String[] namesList = emp.split(",");
		
		String lead = sc.nextLine();
		c.setTeamlead(lead);
		
		for(int i = 0; i <= 4; i++)
		{
			if(lead.equals(namesList[i]))
			{
				flag = 1;
				break;
			}
			else
			{
				flag = 0;
			}
		}
		if(flag == 0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			System.out.println("\n"+"Name: "+c.getName());
			System.out.println("Emploees: "+emp);
			System.out.println("Lead "+c.getTeamlead());
		}
	}}

