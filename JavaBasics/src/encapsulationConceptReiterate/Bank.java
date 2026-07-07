package encapsulationConceptReiterate;

public class Bank {

	private String name;
	private int age;// age>=15
	private String adharCardNumber;// no calculation that is it is String
	private String phone;// no calculation on the phone number

	
	
	public Bank(String name, int age, String adharCardNumber, String phone) {
		this.name = name;
		if (age >= 15) {
			this.age = age;
		}
		this.adharCardNumber = adharCardNumber;
		this.phone = phone;
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
		if (age >= 15) {
			this.age = age;
		}
	}

	public String getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(String adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//business logic to open account
	public void openAccount() {
		if(this.age>=15) {
			System.out.println("opening the Bank account");
		}else {
			System.out.println("age is less than 15");
		}
	}
}
