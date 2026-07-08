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
		System.out.println(b.speed);
		
		System.out.println("-------------------");
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		System.out.println(c.speed);
		Car.billing();
		
		System.out.println("-------------------");
		Audi au =  new Audi();
		au.start();//Overriden
		au.stop();//Inherited
		au.refuel();//Inherited
		au.applyBreak();//Inherited
		au.theftSafety();//individual
		au.speedTracking();
	}

}
