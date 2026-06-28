package loops;

public class Dowhileloop {

	public static void main(String[] args) {

		// do while loop
		/**
		 * only difference between While loop and do while loop before checking the
		 * condition loop body(do body) will execute once
		 **/
		// 1.print 1 to 10

		int i = 1;
		do {
			System.out.println(i);// how many time we are executing this statement at least once
			// if the condition is not satisfied then exit the loop
			i++;
		} while (i <= 10);

		// Best real time examples of the do while loop
		// wait for the element;
		System.out.println("-------------------");

		int p = 10;
		do {
			System.out.println(p);
			p--;// 9 8 7 6 5 4 3 2 1 0
			break;
		} while (p >= 0);
		// can we write break in do while loop
		System.out.println("-------------------");

		// print even numbers 1 to 100
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}
		}

		System.out.println("-------------------");

		// print even numbers 1 to 10
		for (int k = 1; k <= 10; k++) {
			k++;
			System.out.println(k);
		}
		System.out.println("-------------------");
		// print even numbers 1 to 10
		for (int k = 1; k <= 10; k++) {
			k++;
			System.out.println(k);
		}
	}

}
