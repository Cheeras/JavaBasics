package encapsulationConceptReiterate;

public class TestBank {

	public static void main(String[] args) {
		
		Bank b = new Bank("Pooja",5,"3343433","9900899009");
		System.out.println(b.getAdharCardNumber());
		System.out.println(b.getAge());
		
		b.openAccount();

		
	}

}
