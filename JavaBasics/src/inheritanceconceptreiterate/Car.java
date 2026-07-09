package inheritanceconceptreiterate;
/*
 * Very important
 * what is mean by inheritance
 * Inherit some thing for parents 
 * */
//final class - to prevent inheritance
//means we can not create child class for the class
public class Car extends Vehicle {
	
	int speed =100;
	int price = 70;
	
	public void start() {
		System.out.println("car start");
	}
	
	public void stop() {
		System.out.println("car stop");
	}
	
	//final methods can not be overridden
	public final void refuel() {
		System.out.println("car refuel");
	}
	
	public void applyBreak() {
		System.out.println("car applyBreak");
	}
	
	public static void billing() {
		System.out.println("car billing");
	}
	
	private void getInfo() {
		System.out.println("car getInfo method");
	}
	
	@Override
	public void engine() {
		System.out.println("Car engine");
	}

	@Override
	public void cruiceControl() {
		System.out.println("Car cruiceControl");
	}
}
