package Activity_inheritance;
import Activity_inheritance.*;

public class DeluxeACRoom extends DeluxRoom {

	public DeluxeACRoom() {
		super();
		setRatePerSqFeet(12);
	}

	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, 12);
	}
	
	public int calculateTariff() {
		
		return getRatePerSqFeet()*super.getNumberOfSqFeet();
	}

}