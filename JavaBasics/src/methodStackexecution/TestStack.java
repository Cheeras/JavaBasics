package methodStackexecution;

public class TestStack {
	
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
	  // m1();//Exception in thread "main" java.lang.StackOverflowError
	   //how to avoid stackoverFlow error
	   //Never create circular any circular chain while calling the methods
	   
    }
   //since all these are non static methods we need to create object of this class
   //to call these methods
   //memory allocation is happening in stack memory
	public static void main(String[] args) {

		TestStack obj = new TestStack();
		obj.m1();
	}

}
