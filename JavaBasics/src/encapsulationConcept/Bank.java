package encapsulationConcept;

public class Bank {

	private String name;
	private int age;//age should be age >=15
	private String aadharNumber;
	private String phone;
	
	
	
	public Bank() {}
	public Bank(String name, int age, String aadharNumber, String phone) {
		this.name = name;
		this.age = age;
		this.aadharNumber = aadharNumber;
		this.phone = phone;
	}

	//what is the use of getter method to get the value of the instance variable or class variable
	public String getName() {
		return name;
	}

	//What is the use of setter method to set value to instance variable with some validation
	//extra advantage of setter is update 
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	//extra advantage of setter is update the age value in future
	public void setAge(int age) {
		if (age >= 15) {
		this.age = age;
		}else {
			System.out.println("Age should be greater than 15 years");
			return;
		}
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//open account
	//business logic
	public void openAccount() {
		if(this.age>=15) {
			System.out.println("Opening the account");
		}else {
			System.out.println("age is less than 15");
		}
	}
	
	
	
}
