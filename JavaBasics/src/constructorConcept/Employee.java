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
	 * 		Is to used initialize the class(instance) variables with the help of local variables
	 * using this keyword
	 * Constructor can be overloaded - Yes we can overload
	 * */
	
/*	public Employee() {//0 param constructor//default constructor
		
	}
	
	public Employee(int a) {
		
	}
	
	public Employee(double d) {
		
	}*/
	
	public Employee(String name, int age) {
		//global = local
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {

			Employee e1 = new Employee("Priya",30);
			System.out.println(e1.name +" "+ e1.age);
	}

}
