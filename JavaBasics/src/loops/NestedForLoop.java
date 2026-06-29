package loops;

public class NestedForLoop {

	
	/*
	 * real time examples for rows and columns
	 * webtables
	 * excel data reading
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		//for - outerloop
			 //for -inner loop
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30 31 32 33 34 35
		//40 41 42 43 44 45
		//50 51 52 53 54 55
		
		for(int i=0;i<=5;i++) {
			for(int j =0; j<=5;j++) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		
		// 000 001 002 003 004 005
		// 110 111 112 113 114 115
		// 220 221 222 223 224 225
		// 330 331 332 333 334 335
		// 440 441 442 443 444 445
		// 550 551 552 553 554 555
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				for(int k=0;k<=5;k++) {
					System.out.print(i+""+j+""+k+"\t");
				}
				System.out.println();
			}
		}

	}

}
