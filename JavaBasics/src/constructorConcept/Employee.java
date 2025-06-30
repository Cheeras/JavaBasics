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
		//this.global = local
		this.name = name;
		this.age = age;
	}
	
	public Employee(String name, int age, double salary,char gender) {
		//this.Global = local
				this.name = name;
				this.age = age;
				this.salary = salary;
				this.gender = gender;
	}
	public Employee(String name, int age, char gender, String dob) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}
	//Can we overload the constructor 
	//answer is yes 
	public Employee(String name,int age,double salary,char gender,String dob,boolean isPrem) {
		//this.Global = local
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isPerm = isPerm;
	}
	public static void main(String[] args) {

			Employee e1 = new Employee("Priya",30);
			System.out.println(e1.name +" "+ e1.age + " " +e1.salary +" "+e1.gender +" "+e1.dob +" "+e1.isPerm);
			
			Employee e2 = new Employee("Jeyadev",25,45.46d,'M');
			System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.gender+" "+e2.dob+" "+e2.isPerm);
			
					
	}

}
