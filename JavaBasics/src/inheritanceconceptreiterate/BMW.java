package inheritanceconceptreiterate;

public class BMW extends Car {
	
	int speed = 200; 
	int price = 500;

	// Method overriding -- Poly(many)+Morphism(forms): RunTime (dynamic)
	// polymorphim
	// when we have method in parent class and the same method we have in child
	// class
	// 1. with the same method name
	// 2. with same number of parameters
	// 3. with same order of the parameters
	// 4. business logic/ number of lines in the method - doesn't matter
	// 5. with the same return type

	@Override // annotation//Override - annotation used for overriden methods
	// its always good practice to write @Override for the overriden methods
	public void start() {
		System.out.println("BMW start");
	}

	public void autoParking() {
		System.out.println("BMW -- Auto parking");
		applyBreak();//method chaining
		stop();//inheritance
		
	}
	// non static methods can not be overriden - it is called method hiding
//	public static void billing() {
//		System.out.println("BMW billing");
//	}

	// @Override//private method can not be overriden
	// this individual method of the BMW class
	// Private method can not be overriden but we can overload
	private void getInfo() {
		System.out.println("car getInfo method");
	}

	// final methods can not be overridden
	//what is purpose of the final key word
	//1.to provide constant values
	//2.to prevent method overriding also
//	public final void refuel() {
//		System.out.println("car refuel");
//	}
	
	public void speedTracking() {
		System.out.println("BMW -- SpeedTracking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW engine");
	}
	
	public void bmwLoading() {
		//here i want to call the Truck class heavyLoading() method
		//how can i call
		//there is not relation ship between BMW and Truck class
		Truck tr = new Truck();//BMW class is having the Truck class object
		//and able to access its methods:Composition
		tr.heavyLoading();//this is called composition
	}
	
	public void cruiceControl() {
		System.out.println("BMW cruiceControl");
	}

}
