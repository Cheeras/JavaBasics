package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {

		//creating the child class ref and child class object 
		BMW b = new BMW();
		b.start();//Overriden
		b.stop();//Inherited
		b.reFuel();//Inherited
		b.autoParking();//Individual
		BMW.billing();
		b.getInfo();
		System.out.println("BMW speed is "+b.speed);
		System.out.println("---------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.reFuel();
		Car.billing();
		c.getInfo();
		System.out.println("Car speed is "+b.speed);
		
		System.out.println("----------------");
		
		Audi au = new Audi();
		au.start();
		au.stop();
		au.reFuel();
		au.applyBreak();
	}

}
