package encapsulationConcept;

public class TestBank {

	public static void main(String[] args) {

		Bank b = new Bank("Pooja",21,"23987987987","98987987");
		//b.setAge(30);//Setter should be used for validation while setting up the age 
		System.out.println(b.getAge());
		b.openAccount();
		
		//Company c = new Company();
		
		Company.getRevenue();
		
		
	}

}
