package staticmethods;

public class CallByRef {
	
	String name;
	int age;
	
	
	public void m1(int a) {
		System.out.println(a);
	}
	public static void t1(CallByRef p1) {
		
		p1.m1(20);
		p1.name = "shankar";
		p1.age = 30;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
	}
	public static void main(String[] args) {
		CallByRef c = new CallByRef();
		c.m1(10);//call by value//argument
		System.out.println(c.name);
		System.out.println(c.age);
		CallByRef.t1(c);//call by referance
		
		c.name = "Naveen";
		c.age = 35;

		System.out.println(c.name);
		System.out.println(c.age);
		
		
		
	}

}
