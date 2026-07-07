package encapsulationConceptReiterate;

public class TestCompany {

	public static void main(String[] args) {

		//Company c = new Company();//we can not create object of the Company class
		//becuase of private constructor(default) in Company class
		
		//Company class object i can not create but my requirement is 
		//i want to call the Company class non static method
		//how can i achieve this 
		//we can make the method as static 
		Company.getRevenue();
	}

}
