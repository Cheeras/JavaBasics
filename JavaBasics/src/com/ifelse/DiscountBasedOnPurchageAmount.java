package com.ifelse;

public class DiscountBasedOnPurchageAmount {

	
	
	public static void discountBasedOnPurchageAmount(double purchageAmount) {
		if(purchageAmount>=10000) {
			System.out.println("Apply 20% discount");
		}
		
		else if(purchageAmount>=5000) {
			System.out.println("Apply 10% discount");
		} else if(purchageAmount>=2000) {
			System.out.println("Apply 5% discount");
		} else {
			System.out.println("No Discount");
		}
	}
	
	public static void main(String[] args) {

		
		discountBasedOnPurchageAmount(5000);
	}
	
	

}
