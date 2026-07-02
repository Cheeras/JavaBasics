package statickeywordpermgen;

public class Employee {

	String name;
	int age;
	double salary;
	String city;

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.name = "Chirag";
		e1.age = 30;
		e1.salary = 40;
		e1.city = "Delhi";

		Employee e2 = new Employee();

		e2.name = "Rahul";
		e2.age = 39;
		e2.salary = 50;
		e2.city = "Dallas";

		Employee e3 = new Employee();

		e3.name = "Dilip";
		e3.age = 33;
		e3.salary = 60;
		e3.city = "Hyderabad";

		Employee e4 = new Employee();

		e4.name = "Shankar";
		e4.age = 26;
		e4.salary = 32;
		e4.city = "Pune";
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.city);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.city);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.city);
		
		System.out.println("========================");
		
		e1=e2;
		//First break object ref to e1 
		//start pointing e1 ref to e2 object
		
		
		System.out.println("========================");
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.city);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.city);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.city);
		
		e2=e3;
		//First break object ref to e2 
		//start pointing e2 ref to e3 object
		
		System.out.println("========================");
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.city);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.city);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.city);
		
		e3=e4;
		
		System.out.println("========================");
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.city);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.city);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.city);
		
		e4=e1;
		
		System.out.println("========================");
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.city);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.city);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.city);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.city);
		
		

	}

}
