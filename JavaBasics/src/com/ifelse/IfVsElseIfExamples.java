package com.ifelse;
	
	public class IfVsElseIfExamples {

	    public static void main(String[] args) {
	        discountBasedOnPurchase(8000);
	        permissionsBasedOnRole(true, false, true);
	        weatherAdvice(35);
	        emailValidation("admin@");
	        trafficSignal("Yellow");
	    }

	    // 1. Discount Example - if...else if
	    public static void discountBasedOnPurchase(double amount) {
	        System.out.println("\n🛍️ Discount Check:");

	        if (amount >= 10000) {
	            System.out.println("You get a 20% discount");
	        } else if (amount >= 5000) {
	            System.out.println("You get a 10% discount");
	        } else if (amount >= 2000) {
	            System.out.println("You get a 5% discount");
	        } else {
	            System.out.println("No discount");
	        }
	    }

	    // 2. Role Permissions - multiple if
	    public static void permissionsBasedOnRole(boolean canRead, boolean canWrite, boolean canDelete) {
	        System.out.println("\n🔐 Role Permissions:");

	        if (canRead) {
	            System.out.println("User can read files");
	        }
	        if (canWrite) {
	            System.out.println("User can write files");
	        }
	        if (canDelete) {
	            System.out.println("User can delete files");
	        }
	    }

	    // 3. Weather Advice - if...else if
	    public static void weatherAdvice(int temp) {
	        System.out.println("\n🌤️ Weather Advice:");

	        if (temp >= 40) {
	            System.out.println("Stay indoors, extreme heat!");
	        } else if (temp >= 30) {
	            System.out.println("Stay hydrated, it's hot");
	        } else if (temp >= 20) {
	            System.out.println("Nice weather");
	        } else {
	            System.out.println("It's cold outside");
	        }
	    }

	    // 4. Email Validation - multiple if
	    public static void emailValidation(String email) {
	        System.out.println("\n📧 Email Validation:");

	        if (!email.contains("@")) {
	            System.out.println("Missing '@' symbol");
	        }
	        if (!email.endsWith(".com")) {
	            System.out.println("Should end with .com");
	        }
	        if (email.length() < 5) {
	            System.out.println("Email too short");
	        }
	    }

	    // 5. Traffic Signal - if...else if
	    public static void trafficSignal(String signal) {
	        System.out.println("\n Traffic Signal:");

	        if (signal.equalsIgnoreCase("Red")) {
	            System.out.println("Stop");
	        } else if (signal.equalsIgnoreCase("Yellow")) {
	            System.out.println("Get ready");
	        } else if (signal.equalsIgnoreCase("Green")) {
	            System.out.println("Go");
	        } else {
	            System.out.println("Invalid signal");
	        }
	    }
	}