package inheritanceConcept;

public class FortiesHospital implements USMedical, UKMedical, IndiaMedical {

	
	static final int MIN_FEE = 50;
	@Override
	public void physioServices() {
		System.out.println("Forties Hospital - physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("Forties Hospital - oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("Forties Hospital - dentalServices");
	}

	@Override
	public void entServices() {
		System.out.println("Forties Hospital - entServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("Forties Hospital - pediaServices");

	}

	@Override
	public void dermaServices() {
		System.out.println("Forties Hospital - dermaServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("Forties Hospital - cardioServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("Forties Hospital - orthogyServices");
	}

	@Override
	public void nueroServices() {
		System.out.println("Forties Hospital - nuerolServices");
	}

	// individual
	public void medicalTraning() {
		System.out.println("Forties Hospital - medicalTraning");
	}

	// individual - all tests - blood test
	public void pathologyServices() {
		System.out.println("Forties Hospital - pathologyServices");
	}

	// Common method for all the 3 countries
	@Override
	public void emergencyServices() {
		System.out.println("Forties Hospital - emergencyServices");
	}

	@Override
	public void medicalTest() {
		System.out.println("US Medical - default - medical Test");
	}

	//WHO interface
	@Override
	public void covidVaccine() {
		System.out.println("Forties Hospital - CovidVaccine");
		
	}

	@Override
	public int test(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int test(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
