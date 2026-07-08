package inheritanceconceptreiterate;

public class Audi extends Car{

	@Override
	public void start() {
		System.out.println("Audi -- start");
	}

	public void theftSafety() {
		System.out.println("Audi -- theftsafety");
	}
	
	public void speedTracking() {
		System.out.println("Audi -- SpeedTracking");
	}
}
