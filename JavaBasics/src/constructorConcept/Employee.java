package constructorConcept;

public class Employee {

	/*Constructor concept*/
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;

	//Constructor
	/*
	 * Constructor name should be same as class name, i can not give any other name
	 * is it looks like function? may be it is looks like function but it is not function
	 * constructor can not return anything, even void as well
	 * avoid writing the business logic in constructor
	 * Main purpose of the constructor is 
	 * 		Is to used initialize the class variables
	 * Constructor can be overloaded - Yes we can overload
	 * */
	
	public Employee() {//0 param constructor//default constructor
		
	}
	public static void main(String[] args) {

			Employee e1 = new Employee();
	}

}
