package com.basics;

public class SwitchCaseRealTimeUseCases {

	public static void main(String[] args) {

		/*Real time usecases of the Switch case
		 * 1.Cross browser logic
		 * 2.Cross OS logic
		 * 3.Months 
		 * 4.Cross User or User permission
		 * 5.run test cases in different environment
		 * 6.time zones
		 * 7.Uber: Cases - Sedan,mini,SUV
		 * 8.HR: User roles
		 * 9.Localization: EN,FR,AR
		 * 10.category: Electronics,Fashion,Home Appliances*/
		
		
		//cross browser logic
		//Usage of switch statement in cross browser logic
		
		/*String browser = "chrome";
		switch(browser) {
		
		case "chrome":
			System.out.println("Chrome browser is launched");
			break;
		case "firefox":
			System.out.println("Firefox browser is launched");
			break;
		case "edge":
			System.out.println("edge browser is launched");
			break;
		case "ie":
			System.out.println("ie browser is launched");
			break;
		default:
			System.out.println("Please provide valid browser name "+browser);
			break;
		}*/
		
		//Cross OS Logic
		//String osname = System.getProperty("os.name").toLowerCase().trim();
		String osname ="Mac";
		switch(getOS(osname)) {
		case "windows":
			System.out.println("windows OS");
			break;
		case "mac":
			System.out.println("Mac OS");
			break;
		case "linux":
			System.out.println("Linux OS");
			break;
		default:
			throw new RuntimeException("Unsupported OS: " + osname);
		}
		
	}
	
	private static String getOS(String osname) {
		if(osname.contains("wind")) return "windows";
		else if(osname.contains("Mac")) return "mac";
		else if(osname.contains("nix") || osname.contains("nux")) return "linux";
		else return "other";
	}

}
