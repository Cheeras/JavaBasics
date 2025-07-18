package inheritanceConcept;


public class Audi extends Car {
	
	@Override
	public void start() {
		System.out.println("Audi -- start");
	}
	
	public void theftSafty() {
		System.out.println("Audi -- theftSafty");
	}

}
