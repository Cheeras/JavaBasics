package classandobjects;

public class Employee {

	//class: category/template/blue print
	//object: physical entity
	//class variables : global variables/template variables
	String name;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	public static void main(String[] args) {
		
		//create the object : using "new" keyword
		
		//new Employee();//this is the object of employee//instance of the class
		//new is keyword
		//obj is object reference name
		
		Employee obj = new Employee();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isPerm);
		System.out.println(obj.gender);
		
		System.out.println("-----------------------");
		
		obj.name = "shankar";
		obj.age = 30;
		obj.salary = 90;
		obj.isPerm = true;
		obj.gender = 'F';
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isPerm);
		System.out.println(obj.gender);
		
		Employee e1 = new Employee();
		//how many photo copies of name,age,salary,isPerm and gender one photo copy for obj and e1
		e1.name="Ravi";
		e1.age = 35;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.isPerm+" "+e1.gender);
		
		new Employee().name ="Tom";
		new Employee().age = 30;
		System.out.println("===++++=====");
		System.out.println(new Employee().name);
		System.out.println("===++++=====");
		Employee e2 = new Employee();
		e2 = null;
		e2.name = "Dilip";
		System.out.println(e2.name);
		
		//how to call garbase collector
		System.gc();//it is not gurrenties that gc will be activated
		//still gc will wait for the JVM approval
		
		//JVM is resposible for allocating and deallocating the memory
		//if you are keep creating the objects in heap memory after some time heap memory could be full we will
		//get Out of memory error
		//JVM will call the garbage collector and ask to clean some object
		//which objects from GC will destory
		//garbage collector will destroy the object will null reference and objects with no reference
		
		
		
		
		
	}

}
