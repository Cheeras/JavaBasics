package com.assignments;

public class MovieTicketPrice {
//Movie ticket pricing based on age group (child, adult, senior)
	
	public static void checkMovieTicketPrice(int age) {
		int ticketPrice;
		if(age <0) {
			System.out.println("Invalid age");
			return;
		}
		else if(age <= 5) {
			System.out.println(age + " Below age no movie ticket is Required");
		}else if(age > 5 && age <=13) {
			ticketPrice = 100;
			System.out.println("Age is "+ age +" Category : Child");
			System.out.println("Ticket Price is "+ticketPrice);
		} 
		else if(age >13 && age <= 59)
		{
			ticketPrice = 200;
			System.out.println("Age is "+ age +" Category : Adult");
			System.out.println("Ticket Price is "+ticketPrice);
		} else {
			ticketPrice = 150;
			System.out.println("Age is "+ age +" Category : Senior Citizen");
			System.out.println("Ticket Price is "+ticketPrice);
		}
	}
	public static void main(String[] args) {
		checkMovieTicketPrice(-2);
		checkMovieTicketPrice(3);// 5 Below age no movie ticket is Required
		checkMovieTicketPrice(20);//Movie ticket Price for the 20 years age is 500
		checkMovieTicketPrice(35);//Movie ticket Price for the 35 years age is 500
		checkMovieTicketPrice(63);////Movie ticket Price for the 63 years age is 400
		
		
	}

}
