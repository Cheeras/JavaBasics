package com.interviewQuestions;

public class CricketPlayerData {

	public static void main(String[] args) {
		Object[] player1 = { "Virat Kohli", 36, "India", "05-Nov-1988", "Male", 138.5 };
		Object[] player2 = { "MS Dhoni", 43, "India", "05-Dec-1985", "Male", 98.5 };
		Object[] player3 = { "Pat Cummens", 28, "Australia", "15-Oct-1994", "Male", 129.5 };

		// Array of Object arrays
		Object[][] players = { player1, player2, player3 };

		// using traditional for loop
		System.out.println("Using traditional for loop:==");
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player " + (i + 1) + ":");
			for(int j=0;j<players[i].length;j++) {
				System.out.print(players[i][j] + " ");
			}
			System.out.println("\n---------------------------");
		}
		
		//Using the enhanced for loop or for each loop
		System.out.println("Using for each loop:==");
		int count=1;
		for(Object[] player : players) {
			System.out.println("Player " + count++ + ":");
			for(Object details: player) {
				System.out.print(details + " ");
			}
			System.out.println("\n---------------------------");
		}

	}

}
