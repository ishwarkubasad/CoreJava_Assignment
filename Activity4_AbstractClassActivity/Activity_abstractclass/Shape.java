package Activity_abstractclass;
import Activity_abstractclass.*;

public abstract class Shape {
	int value;
	
	public abstract void calculateArea(int value);

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}