package functionsinjava;

public class Employee {

	// method overloading: Polymorphism = Poly(many) + morphism(different forms)
	// with in the same if you multiple methods with the
	// 1.with the same method name
	// 2.with the different no of parameters
	// 3.with the different sequence of the parameters(if the no of parameters are
	// same)
	// 4.return type does not matter here

	// will be used for same functionality (login, search ,payment)

	public int test() { // 0 param
		System.out.println("test 1 method");
		return 100;
	}

	public double test(int a) { // 1 param
		System.out.println("test 2 method");
		return 33.56;

	}

	public void test(double d) {// 1 param

	}

	public void test(int a, String b) {// 2 parameters

	}

	public void test(String a, int b) {// 2 param

	}

	public void test(String a, String b) {// 2 param

	}

	// login - with single sign on
	public void login() {

	}

	public void login(String username, String pwd) {

	}

	public void login(String username, String pwd, int otp) {

	}

	// search
	public void search() {

	}

	// search
	public void search(String name) {

	}

	// search with name and color
	public void search(String name, String color) {

	}

	// search with name, color and price
	public void search(String name, String color, String price) {

	}

	// payment
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	// uber car booking
	public void carBooking(String source, String destination) {

	}

	public void carBooking(String source, String destination, String carType) {

	}

	public void carBooking(String source, String destination,String carType,int nofpass) {

	}
	
	public double calculateTax(int totalIncome,int bonus, int stockProfit) {
		System.out.println("Calculate tax");
		 double  tax = ((totalIncome*30)/100)+((bonus*5)/100 + (stockProfit*2)/100);
		 return tax;
	}
	
	public double calculateTax(int totalIncome,int bonus) {
		System.out.println("Calculate tax");
		 double  tax = ((totalIncome*30)/100)+((bonus*5)/100);
		 return tax;
	}
	

	public static void main(String[] args) {

		Employee e = new Employee();
		e.test();
		e.test(70);
		
		double tax = e.calculateTax(1000, 500,300);
		System.out.println(tax);

	}

}
