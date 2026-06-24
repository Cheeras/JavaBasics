package inheritanceConcept;

public interface USMedical extends WHO {
	//interface variables are static and final in nature
	int MIN_FEE = 10;//can we have same variable in child class
	//Yes we can have
	
	//interface allows only method declaration
	//only method proto type
	//abstract methods : a method with out method body
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();
	
	public int test(int a);
	public int test(int a, int b);
	
	
	
	//Can I have method body:Yes but it should be static 
	//this is also after java 8 onwards
	//can we have a method with body but with static method
	//1.static methods are allowed in interfaces
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	//2.can have a non static method with method body it should be
	// written with default keyword
	//Can we override the default method 
	//Yes but the method is public in child class
	default void medicalTest() {
	System.out.println("US Medical - default - medical Test");	
	}
	
}
