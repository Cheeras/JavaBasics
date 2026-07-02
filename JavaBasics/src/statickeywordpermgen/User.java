package statickeywordpermgen;

public class User {

	String name;
	int age;
	String city;
	public static void main(String[] args) {
		User u1 = new User();
		u1.name = "Shankar";
		u1.age = 35;
		u1.city = "Vinukonda";
		
		User u2 = new User();
		u2.name = "Sreeni";
		u2.age = 40;
		u2.city = "Bangalore";
		
		User u3 = new User();
		u3.name = "Piyush";
		u3.age = 30;
		u3.city = "Pune";
		
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		u1=u2=u3;//how to solve this left to right or right to left
		//ans: Right to left
System.out.println("===========================");
		
		System.out.println("==================");
		
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		System.out.println("===========================");
		
		System.out.println("==================");
		
		u1=u2;//u1 will break the existing connection and start pointing to same u2 object location
		
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		System.out.println("==================");
		
		u2=u3;//u2 will break the existing connection and start pointing to u3 object location
	
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		//how many ref to u3 now we have 2 ref 
		//can we say in java we can have multiple ref with one object : Yes we can have any no of ref to one 
		//particular object
		
		u3=u1;
		
		System.out.println("==================");
		System.out.println(u1.name +" "+ u1.age +" "+ u1.city);
		System.out.println(u2.name +" "+ u2.age +" "+ u2.city);
		System.out.println(u3.name +" "+ u3.age +" "+ u3.city);
		
		
		
		
		

		
	}
}
