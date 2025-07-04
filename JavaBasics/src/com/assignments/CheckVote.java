package com.assignments;

public class CheckVote {

	
	public static void checkVoteEligility(int age) {
		
		if(age>=18) {
			System.out.println("Eligible for vote");
		}else if (age <= 0) {
            System.out.println("Not eligible to vote. Must be at least 18.");
        }else {
			System.out.println("Not eligible for vote");
		}
	}
	public static void main(String[] args) {

		checkVoteEligility(20);
		checkVoteEligility(-17);
		checkVoteEligility(0);
	}

}
