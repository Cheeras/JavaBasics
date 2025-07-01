package encapsulationConcept;

public class Employee {
	
	/*
	 * What is mean by the encapsulation
	 * Hiding the data members via private keyword and accessing through
	 * public layer
	 * 
	 * */
	//Private class variables(instance variables)
	//is it really mandatory to write setter and getter methods
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	
	
	public Employee(String name, int age, double salary, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}
	
	//public methods: getter and setters
	//These getter and setters should be public
	//Every private variables we should create one setter and one getter
	
	//is writting the setter is mandatory 
	//no
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

}
