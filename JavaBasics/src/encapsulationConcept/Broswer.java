package encapsulationConcept;

public class Broswer {
	
	
	//Give me only required one launchBroswer to user
	//for the user just give me one method to launch broswer
	//user is does not bother for the RAMsize,brosweupdate,verifystorage and broswerPolicy
	

	public void launchBroswer() {
		System.out.println("launching the broswer");
		checkRamSize();
		checkBroswerUpdates();
		checkBroswerPolicy();
		verifyStorage();
		System.out.println("Chrome is launched");
	}
	
	private void checkRamSize() {
		System.out.println("checking RAM Size");
	}

	private void checkBroswerUpdates() {
		System.out.println("Checking the broswer updates");
	}
	
	private void verifyStorage() {
		System.out.println("Verifing storage");
	}

	private void checkBroswerPolicy() {
		System.out.println("Checking the broswer Policy");
	}
}
