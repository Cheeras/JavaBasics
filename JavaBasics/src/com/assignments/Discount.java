package com.assignments;

public class Discount {
//Discount calculator based on purchase amount

	public static void discountOnPurchaseAmount(float purchaseAmount) {
	    float discountRate = 0f;
	    float discountAmount, finalAmount;

	    if (purchaseAmount <= 0) {
	        System.out.println("Invalid purchase amount: ₹" + purchaseAmount);
	        return;
	    } else if (purchaseAmount <= 1000) {
	        discountRate = 5;
	    } else if (purchaseAmount <= 2000) {
	        discountRate = 10;
	    } else if (purchaseAmount <= 5000) {
	        discountRate = 15;
	    } else {
	        discountRate = 20;
	    }

	    discountAmount = (discountRate * purchaseAmount) / 100;
	    finalAmount = purchaseAmount - discountAmount;

	    System.out.println(discountRate + "% Discount applicable");
	    System.out.println("Purchase Amount before discount is ₹" + purchaseAmount);
	    System.out.println("Discount Amount is ₹" + discountAmount);
	    System.out.println("Final Amount after discount is ₹" + finalAmount);
	}


	public static void main(String[] args) {
		
		discountOnPurchaseAmount(1000);//5 percent
		discountOnPurchaseAmount(10000);//20 percent
		discountOnPurchaseAmount(0);//Invalid Purchage amount
		discountOnPurchaseAmount(-10000);//Invalid purchage amount
		discountOnPurchaseAmount(2500);//15 percent discount
		discountOnPurchaseAmount(5100);// 20 percent discount

	}

}
