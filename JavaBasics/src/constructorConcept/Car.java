package constructorConcept;

public class Car {

	String name;
	String color;
	double price;
	String model;
	String chasisNumber;
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String color, double price, String model) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	public Car(String name, String color, double price, String model, String chasisNumber) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW",50.44);
		Car c2 = new Car("BMW","Red",80.44,"x3");
		Car c3 = new Car("Audi","Green",75.44,"q3","12SDFSDE34343FS");
		
		System.out.println(c1.name +" "+c1.color+" "+c1.price +" "+c1.model + " "+c1.chasisNumber );
		System.out.println(c2.name +" "+c2.color+" "+c2.price +" "+c2.model + " "+c2.chasisNumber );
		System.out.println(c3.name +" "+c3.color+" "+c3.price +" "+c3.model + " "+c3.chasisNumber );
	}

}
