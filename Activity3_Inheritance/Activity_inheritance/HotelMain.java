package Activity_inheritance;

import java.util.Scanner;

import Activity_inheritance.*;

public class HotelMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DeluxRoom droom;
		DeluxeACRoom dacroom;
		SuiteACRoom suacroom;
		
		
		int ch;
		do {
		System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:droom=new DeluxRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   droom.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   droom.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String c=sc.nextLine();
			   if(c.equals("yes")) {
				   droom.setHasTV(true);
			   }
			   else {
				   droom.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String d=sc.nextLine();
			   if(d.equals("yes")) {
				   droom.setHasWifi(true);
			   }
			   else {
				   droom.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+droom.calculateTariff());
		       break;
		
		case 2: dacroom=new DeluxeACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   dacroom.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   dacroom.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String e=sc.nextLine();
			   if(e.equals("yes")) {
				   dacroom.setHasTV(true);
			   }
			   else {
				   dacroom.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String f=sc.nextLine();
			   if(f.equals("yes")) {
				   dacroom.setHasWifi(true);
			   }
			   else {
				   dacroom.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+dacroom.calculateTariff());
		       break;
		case 3: suacroom=new SuiteACRoom();
			   System.out.println("Hotel Name:");
			   sc.nextLine();
			   suacroom.setHotelName(sc.nextLine());
			   System.out.println("Room Square Feet Area:");
			   suacroom.setNumberOfSqFeet(sc.nextInt());
			   System.out.println("Room has Tv(yes/no):");
			   sc.nextLine();
			   String g=sc.nextLine();
			   if(g.equals("yes")) {
				   suacroom.setHasTV(true);
			   }
			   else {
				   suacroom.setHasTV(false);
			   }
			   System.out.println("Room has Wifi(yes/no):");
			   String h=sc.nextLine();
			   if(h.equals("yes")) {
				   suacroom.setHasWifi(true);
			   }
			   else {
				   suacroom.setHasWifi(false);
			   }
			   System.out.println("Room Tarrif per day is:"+suacroom.calculateTariff());
		       break;
		      
		
		}
		
		}while(ch==1||ch==2||ch==3);
	}

}