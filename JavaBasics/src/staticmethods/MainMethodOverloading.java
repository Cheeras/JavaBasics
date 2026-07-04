package staticmethods;

public class MainMethodOverloading {


    public static void main(int a) {
		System.out.println("Hi JVM");
	}
    
    //can i overload the main method - Yes
    //Practically we will not overload
	public static void main(String[] args) {//JVM always looks for static method with main(String[] args)
		
		System.out.println(args.length);
		System.out.println("Hello JVM");
		main(10);
		
	}
	
	 public static void main(int[] a,int [] b) {
			System.out.println("Hi JVM int[] int[]");
	}
	
}
