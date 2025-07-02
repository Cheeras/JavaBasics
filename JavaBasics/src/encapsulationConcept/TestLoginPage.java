package encapsulationConcept;

public class TestLoginPage {

	public static void main(String[] args) {

		//Login
		//Post - Create Credentials
		LoginPage lp = new LoginPage("cheeras","asdf123");
		
		//Get - 
		//lp.doLogin(lp.getUserName(), lp.getPassWord());
		lp.doLogin();
		System.out.println(lp.getUserName()+" "+ lp.getPassWord());
		lp.setPassWord("Cheerala@1987");
		System.out.println(lp.getUserName()+" "+ lp.getPassWord());
		System.out.println("==============================");
		LoginPage lp2 = new LoginPage("piyush@gmail.com","piyush@123");
		lp2.doLogin();
		System.out.println(lp2.getUserName()+" "+ lp2.getPassWord());
		lp2.setPassWord("Piyush@1990");
		System.out.println(lp2.getUserName()+" "+ lp2.getPassWord());
	}
}
