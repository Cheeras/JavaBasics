package inheritanceConcept;

public class TestMedical {

	public static void main(String[] args) {
		FortiesHospital fh = new FortiesHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.entServices();
		fh.medicalTraning();
		fh.pathologyServices();
		fh.nueroServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pediaServices();
		fh.physioServices();
		fh.covidVaccine();
		
		//can we create the object of Interface 
		//Ans: NO
		//USMedical us = new USMedical();
		
		//top casting
		//child class object can be referred by the parent class interface ref variable
		USMedical us = new FortiesHospital();
	
		//down casting
		//Down casting will not be allowed with interface
		//not at compile time
		//FortiesHospital fh = new USMedical(); 
		us.covidVaccine();
		System.out.println(USMedical.MIN_FEE);
		System.out.println(FortiesHospital.MIN_FEE);
		
		
		
		
	}

}
