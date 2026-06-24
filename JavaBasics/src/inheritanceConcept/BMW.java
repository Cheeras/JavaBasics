package inheritanceConcept;

public class BMW extends Car {

	
	/*
	 * Method Overriding - This is called polymorphism(Poly means many Morphism is  called forms  
	 *    
	 * When we have a method in parent class and the same method in child class
	 * 1.With the same name
	 * 2.With the same number of parameters
	 * 3.with the same sequence of parameters
	 * 4.With the same return type
	 * 5.Business logic/number of lines in the method - does not matter 
	 * 6.Static methods can not be overridden
	 * 
	 * */
	@Override
	public void start() {
		System.out.println("BMW Start");
	}
	
	public void autoParking() {
		System.out.println("BMW AutoParking");
	}
	@Override
	public void applyBreak() {
		System.out.println("BMW applyBreak");
	}
	//this is called method hiding 
	//Both Parent and child has exactly same static method is called method hiding
	public static void billing() {
		System.out.println("BMW --- Billing");
	}
}
