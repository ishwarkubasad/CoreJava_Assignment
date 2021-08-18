package Activity_inheritance;
import Activity_inheritance.*;
public class DeluxRoom extends HotelRoom{
	protected int ratePerSqFeet;
	
	public DeluxRoom() {
		// TODO Auto-generated constructor stub
		super();
		this.ratePerSqFeet = 10;
	}

	public DeluxRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi,int ratePerSqFeet) {
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public int calculateTariff() {
			
			return getRatePerSqFeet()*super.getNumberOfSqFeet();
		}
		
	
}