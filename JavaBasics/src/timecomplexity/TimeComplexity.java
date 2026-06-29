package timecomplexity;

public class TimeComplexity {

	public static void main(String[] args) {
		//Time complexity Big O() -- Big oh()
		 int i = 1;
		 System.out.println(i);//O(1)
		 
		 //for loop
		 for(int k = 0 ;k<=10;k++) {
			 System.out.println(k);
		 }
		 //int k = 0 
		 //how many time int k = 0 only one time
		 //1+n+n+n
		 //3n+1 -- Linear equation
		 //O(n) -- BigO(n) -- where n is number of inputs
		 
		 //O(n) 
		 //As the input size increases, the number of operations increase proportionally (linearly)
		 
		 //while
		 int l=1;
		 while(l<=10) {
			 System.out.println(l);
			 l++;
		 }
		//1+n+n+n
		 //1+3n
		 //linear equation O(n)
		 ///=========
		 //m*n
		 for(int m=0;m<=5;m++) {
			 for(int n=0;n<=5;n++) {
				 System.out.println(m+""+n);
			 }
			 System.out.println();
		 }
		 
		 //outer loop
		 //(1+n+n+n)(1+n+n+n)
		 //(1+3n)(1+3n)
		 //9n^2+5n+1
		 //what kind of equation 
		 //it is quadratic equation
		 //O(n^2)
		 System.out.println("=================");
		 //m*n*0
		 for(int p=0;p<=5;p++) {
			 for(int q=0;q<=5;q++) {
				 for(int r=0;r<=5;r++) {
					 System.out.print(p+""+q+""+r+"\t");
				 }
				 System.out.println();
			 }
		 }
		 //(1+n+n)(1+n+n+n)(1+n+n+n)
		 //(1+2n)(1+3n)(1+3n)
		 //(1+2n)(9n^2+5n+1)
		 //18n^3+10n^2+2n+9n^2+5n+1
		 //18n^3+19n^2+7n+1
		 //n(18n^2+19n+7)+1
		 //n(18n^2+19n)
		 //n^2(18n+19)
		 //n^2(18n)
		 //18n^3
		 //n^3
		 //O(n^3) == cubic equation = worst time complexity
	}

}
