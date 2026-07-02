package statickeywordpermgen;

public class Car {

	String name;
	int price;
	String modelNumber;
	static int wheels=4;//here is one bug find out what it is
	/**
	 * 
	 * wheels=4 is shared common accross the different object ref right , if any body want to change they 
	 * can change it to 5
	 * Let take scenario where 1 wheel cost around 1000$ dollors, in an application we have create 100 car objects
	 * 100*1000 = 100000 dollors are revenue loss for the company which should not be the case
	 * 
	 * this is serious revenue loss for the customer how will you fix problem
	 * the solution is making the wheels variable as final so that no body can able to change it
	 * 
	 * Try to understand the analogy in design point of view not just memorising 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {

			Car c1 = new Car();
			c1.name = "Maruthi";
			c1.price = 12;
			c1.modelNumber = "Shift Desire";

			Car c2 = new Car();
			c2.name = "Honda";
			c2.price = 15;
			c2.modelNumber = "AA3";

			Car c3 = new Car();
			c3.name = "Mahindra";
			c3.price = 25;
			c3.modelNumber = "Thar";
			
			//what is one observation from this code
			//wheels is 4 in all the car class, exactly 
			//suppose here we have 3 car object wheels will take 4 bytes which is equals to 12 bytes of memory
			//suppose in entire application we are creating 1000 objects 4*1000 = 4000 bytes are memory wasted 
			//unnecessary right 
			//since wheels are 4 common across all the car brand we can mark wheels as static 
			//instead of defining in car object we can create in common and reuse unneccesary 
			
			//where exactly the static variables stored in memory 
			//it is called CMA(common memory Allocation) or Permanent generation or MetaSpace
			
			//how to access the static variables 
			//we can access Class Name dot variable name
			//example Car.wheels 
			
			//1.using the class name
			System.out.println(Car.wheels);
			
			//2.Can i access directly with out using the class name with in the same class
			System.out.println(wheels);
			
			//3.can i access static var with object ref 
			//yes we can access
			System.out.println(c1.wheels);//but recommended way is using class name dot variable name
			
			System.out.println(c1.name +" "+c1.price+" "+c1.modelNumber+" "+Car.wheels);
			System.out.println(c2.name +" "+c2.price+" "+c2.modelNumber+" "+Car.wheels);
			System.out.println(c3.name +" "+c3.price+" "+c3.modelNumber+" "+Car.wheels);
			

			
	}

}
