package inheritanceConcept;

public class BMW extends Car {
	
	
	int speed = 200;

	//Method overriding: poly(many)+Morphism(forms): Runtime(dynamic) 
	//compiler is not taking decision to call the method 
	/*
	 * Best Definition of method overriding
	 * When we have  a method in parent class and 
	 * the same method in child class
	 * 1.with the same name
	 * 2.with same no of parameters
	 * 3.with the same sequence of parameter
	 * 4.Business Logic/number of lines in the method -- does not matter
	 * 5.with the same return type
	 * 
	 * */
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- Auto Parking");
	}
	
	@Override
	public void applyBreak() {
		System.out.println("BMW -- applyBreak");
	}
	
	//Private methods can not be overridden
	//Static and Private methods are can not be overridden
	private void getCarInfo() {
		System.out.println("BMW -- getCarInfo");
	}
	
	public void getInfo() {
		getCarInfo();
	}
	
	
	
	/* final method can not be overriden
	 * public final void reFuel() { System.out.println("Car -- reFuel"); }
	 */
	//static methods can not be overridden
	//According Java documentation this is called Method hiding
//	public static void billing() {
//		System.out.println("BMW -- billing");
//	}

	
	
}
