package staticmethods;

public class TestMethod {
	
	public void getMail() {//non static method
		System.out.println("get Mail");
		
	}
	
	public static void sendMail() {//static method
		System.out.println("send Mail");//
	}
	
	//can we overload static method 
	
	public static void sendMail(int a) {//static method
		System.out.println("send Mail int");
	}
	
	public static void sendMail(int a,int b,int c) {
		System.out.println("send Mail int a int b int c");
	}
	
	//static method can be overloaded with non static method
	//it this true can i overload the main method - yes
	public void sendMail(String a) {
		System.out.println("send Mail String a");
	}
	
	//static method can be overloaded with non static method
	

	public static void main(String[] args) {

		//how to call the static method
		//1.By using the class name
		TestMethod.sendMail();
		//2.with in the same class use directly
		sendMail();
		
		//how to call the getMail method which is non static in nature
		//Can we access the non static method from static area
		//yes we can access only by using the object name dot method name
		//not directly using class name or use directly
		TestMethod obj = new TestMethod();
		obj.getMail();
		obj.sendMail();//warning -- not recommended 
		
	}

}
