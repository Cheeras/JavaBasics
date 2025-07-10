package com.assignments;

public class LoginChecker {

	public static void loginChecker(String userName,String password) {
		if(userName.isBlank() || password.isBlank()) {
			System.out.println("Username and password can not be blank");
			return;
		}
		if(userName.equalsIgnoreCase("cheeras") && password.equalsIgnoreCase("cheeras123")) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Login failed either username or password did not match");
		}
	}
	
	//Check if a username and password match (simple login check)
	public static void main(String[] args) {
		loginChecker(null, null);
		loginChecker("", "");
		loginChecker(" ", " ");
		loginChecker("CHEERAS","cheeras123");

		
		
	}

}
