package loops;

public class NestedLoopAssignment {

	public static void main(String[] args) {

		// 000 001 002 003 004 005
		// 110 111 112 113 114 115
		// 220 221 222 223 224 225
		// 330 331 332 333 334 335
		// 440 441 442 443 444 445
		// 550 551 552 553 554 555
		
		//for - outer most
			//for 
				//for
		
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
