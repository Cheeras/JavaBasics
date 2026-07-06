package constructorConceptreiterate;

public class Car {
	
	String name;
	String color;
	double price;
	String model;
	String choiceNumber;
	
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

	public Car(String name, String color, double price, String model, String choiceNumber) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.choiceNumber = choiceNumber;
	}

	

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", model=" + model + ", choiceNumber="
				+ choiceNumber + "]";
	}

	public static void main(String[] args) {

		Car c = new Car("BMW",50.44);
		
		System.out.println(c);
		Car c1 = new Car("BMW X1","Red");
		System.out.println(c1);
		Car c3 = new Car("BMW","Black",80.33,"X3");
		System.out.println(c3);
		Car c4 = new Car("Audi","Green",75.44,"q3","YUT7867888HJ");
		System.out.println(c4);
	}

}
