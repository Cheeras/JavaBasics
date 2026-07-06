package constructorConceptreiterate;

public class Employee {
	
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
	
	//constructor
	//name of the constructor - should be same as class name but function can be anything
	//return type - should not have any return type not even void as well - it may or may not have return type
	//it looks like function - but it not function - 
	//avoid writing the business login - we must write business login in side function
	//main purpose of the constructor is - 
	//Constructors used to initialize the instance variable - we can also initialize the instance variable
	//can i overload ? yes we can overload - functions/method also can be overloaded
	//constructor will be automatically called when you are creating the object of the class- function can not be 
	//called automatically - we need call using object ref name if it is non static - for static methods we will call
	//classname.method name
	//constructor will help to restrict the creation of the object
	
//	public void Employee() {//This method has a constructor name
	//don't create function name like Constructor 
	//is it valid it is still valid but not recommended to write like this
	
	//Constructor is created in Class loader in memory space but not heap 
//		
//	}
	
//	public Employee() {//this is default constructor//0 param constructor
//		System.out.println("default constructor");
//	}
//
//	//can we overload the constructor yes
//	public Employee(int a) {// 1 param constructor
//		System.out.println("1 param constructor "+a);
//	}
//	
//	public Employee(double d) {// 1 param constructor
//		System.out.println("1 param constructor "+d);
//	}
	
	public Employee(String name,int age) {
		//this.global = local
		this.name = name;
		this.age = age;
		
	}
	
	public Employee(String name,int age,double salary,char gender) {
		//this.global = local
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	
	
	public Employee(String name, int age, char gender, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}

	public Employee(String name, int age, double salary, char gender, String dob, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isPerm = isPerm;
	}

	//can i say all these constructors are overloaded
	
	
	public static void main(String[] args) {
		Employee e = new Employee("Priya",30);
		System.out.println(e.name +" "+e.age+" "+e.salary+" "+e.gender+" "+e.isPerm);
		
		
		Employee e1 = new Employee("Charu",30,40,'F');
		System.out.println(e1.name +" "+e1.age+" "+e1.salary+" "+e1.gender+" "+e1.isPerm);
		
		Employee e3 = new Employee("Naveen",25,23.22,'m',"20-02-2000",true);
		System.out.println(e1.name +" "+e1.age+" "+e1.salary+" "+e1.gender+" "+e1.isPerm);
		
		e.salary = 25.77;
		
		

				
		
		
		
		
		
	}


	

}
