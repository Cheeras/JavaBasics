package encapsulationConceptReiterate;

public class LoginPage {

	private String username;
	private String password;
	
    //can i create unnecessary object 
	//no
	//first time we have to supply username and password
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("enter username "+getUsername());
		System.out.println("enter password "+getPassword());
		System.out.println("click on the login button");
		System.out.println("user is logged in");
	}

}
