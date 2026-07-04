package staticmethods;

public class MethodChaining {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		MethodChaining.t1();
		//t1();
	}
	public void m4() {
		System.out.println("m4 method");
	}
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");//
		t3();
	}
	
	public static void t3() {
		System.out.println("t3 method");
		MethodChaining mc = new MethodChaining();
		mc.m4();
	}
	
	//1. static -- static //directly/ClassName
	//2. non static -- non static //directly calling (no object is required)
	//3. non static - static // //directly/ClassNamed
	//4. static - non static //create the object and then call it
	public static void main(String[] args) {
		
		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		MethodChaining.t1();
		
	}

}
