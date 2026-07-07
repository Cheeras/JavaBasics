package encapsulationConceptReiterate;

public class Employee {
	
	//what is encapsulation 
	//protecting data members via private keyword
	//giving the access via public layer
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	
	//constructor
	public Employee(String name, int age, double salary, boolean isPerm) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}
	
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
