package com.basics;

public class Broswer {

	
	public void click(String element) {
		System.out.println("Click on the element : "+ element);
	}
	
	public void sentKeys(String element, String value) {
		System.out.println();
	}
	
	public String getTitle() {
		return "google";
	}
	
	//WAF : launchBroswer(String broswerName)
	//broswerName: chrome, Firefox, safari, edge
	//return: print: success message and return boolean(true/false)
	
	public boolean launchBroswer(String broswerName) {
		
		System.out.println("broswer name : " + broswerName);
		boolean flag = true;
		switch(broswerName.toLowerCase().trim()) {
			case "chrome":
				System.out.println("Launch google chrome");
				break;
			case "firefox":
				System.out.println("Launch firefox");
				break;
			case "edge":
				System.out.println("Launch edge broswer");
				break;
			case "safari":
				System.out.println("Launch safari broswer");
			    break;
			default:
				System.out.println("Please pass the right broswer name : " + broswerName);
				flag = false;
				break;
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		Broswer obj = new Broswer();
		boolean b = obj.launchBroswer("internetexplorar");
		System.out.println(b);
		
		if(b) {
			System.out.println("Enter the URL.");
		}
		
		
	}
}
