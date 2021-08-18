package Activity_inheritance;

import java.util.Scanner;
import Activity_inheritance.Vehicle;

public class VehicleMain 
{
	public static void main(String[] args) 
	{
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Two Wheeler");
		System.out.println("2.Four Wheeler");
		System.out.println("Enter the vehicle type:");
		a = sc.nextInt();
		if (a==2) {
		Fourwheeler veh =  new Fourwheeler("Volvo","KA63J1231","Diesel", 350, 1500, "Harman", 5);
		veh.displayMake();
		veh.displayBasicInfo();
		veh.displayDetailInfo();
	}
		else if (a==1) {
			Twowheeler two = new Twowheeler("TVS", "KA63U9999", "Petrol", 24, 200, false);
			two.displayMake();
			two.displayBasicInfo();
			two.displayDetailInfo();
		}
}
}