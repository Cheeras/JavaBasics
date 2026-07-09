package inheritanceconceptreiterate;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//Overriden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.speedTracking();
		BMW.billing();
		b.engine();
		b.bmwLoading();
		b.cruiceControl();
		System.out.println("BMW speed is " + b.speed);
		System.out.println("BMW price is " + b.price);
		
		System.out.println("-------------------");
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		System.out.println(c.speed);
		System.out.println("Car price is " + c.price);
		Car.billing();
		c.engine();
		c.cruiceControl();
		
		System.out.println("-------------------");
		Audi au =  new Audi();
		au.start();//Overriden
		au.stop();//Inherited
		au.refuel();//Inherited
		au.applyBreak();//Inherited
		au.theftSafety();//individual
		au.speedTracking();
		
		Vehicle v = new Vehicle();
		v.engine();
		v.cruiceControl();
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		
		//1.child class object can be referred by parent class ref variable 
		//this is called Top casting/Up casting
		//how we read it every BMW is car
		/*
		 * Note:
		 * We can access all the overridden and inherited methods only
		 * but can not access individual methods -- ref type check will be failed
		 * */
		Car c1 = new BMW(); // every BMW is car // BMS IS A car // IS A relation ship
		c1.start();
		c1.stop();
		c1.applyBreak();
		c1.engine();
		c1.refuel();
		BMW.billing();
		c1.cruiceControl();
		
		/*
		 * Note:
		 * We can access all the overridden and inherited methods only
		 * but can not access individual methods -- ref type check will be failed
		 * */
		Car c2 = new Audi(); //every Audi is car // AUDI IS A Car // IS A relation ship
		c2.start();
		c2.stop();
		c2.applyBreak();
		c2.engine();
		
		
		System.out.println("--------------");
		/*
		 * Note:
		 * We can access all the overridden and inherited methods only
		 * but can not access individual methods -- ref type check will be failed
		 * */
		//Grand Parent example
		//Vehicle is Grand parent of the BMW
		//BMW is Grand child of the Vehicle
		//Child class object can be referred by grand parent class ref variable: Top Casting/Up Casting
		Vehicle v2 = new BMW();//every BMW is vehicle// BMW IS a Vehicle // IS A relation ship
		v2.engine();
		
	
		
		//why auto parking is not able to call with c1 ref of the car class
		//ref type check will be applied over here
		//if it is passed then only it will able to call
		//when ever there in miss match java will not allowed to call the method
		
		//DOWN Casting
		//2.Parent class Object cab be referred by child class ref variable:Down Casting
		//BMW b1 = (BMW )new Car();//every car is not BMW //classCastException
		
		//BMW b3 = (BMW)new Vehicle();//but it will fail during runtime with ClassCastException
		//Every Vehicle is not BMW 
		
		
	}
}
