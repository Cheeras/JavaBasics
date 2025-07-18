package inheritanceConcept;
//final class - to prevent inheritance
public  class Car {
	
	int speed = 100;
	
	public void start() {
		System.out.println("Car -- Start");
	}
	public void stop() {
		System.out.println("Car -- Stop");
	}
	//final methods can not be overridden
	//The purpose of final key word is to provide constants
	// and to prevent method overriding
	public final void reFuel() {
		System.out.println("Car -- reFuel");
	}
	
	public void applyBreak() {
		System.out.println("Car -- applyBreak");
	}
	
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	private void getCarInfo() {
		System.out.println("Car -- getCarInfo");
	}
	
	public void getInfo() {
		getCarInfo();
	}

}
