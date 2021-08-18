package Activity_inheritance;

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	public void displayMake() {
		System.out.println(make);
	}
	public void displayBasicInfo() 
	{
		System.out.println("---Basic Information--");
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Capacity: "+fuelCapacity);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("CC: "+cc);
	}
	public void displayDetailInfo()
	{
		
		
	}
}

class Twowheeler extends Vehicle{
	private boolean kickstartavailable ;

	public Twowheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickstartavailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickstartavailable = kickstartavailable;
	}
	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available: "+kickstartavailable);
	}
}

class Fourwheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	public Fourwheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo() 
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("Number of Doors: "+numberOfDoors);
	}
	
}