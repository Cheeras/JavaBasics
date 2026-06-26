package typecasting;

public class TypeCastingConcept {

	public static void main(String[] args) {

		
		/**
		 * 
		 * byte-->short-->int-->long-->float-->double
		 * char-->int
		 * 
		 * **/
		
		byte b =10;//-128 to 127 // 256 
		short s = b;//Widening- converting lower data type into higher data type
		System.out.println(s);
		
		
		short s1 = 200;//200-256
		byte b1 = (byte)s1;//-56//Narrowing - converting Higher data type into Lower data type
		
		System.out.println(b1);
		
		short s2 = 20;
		byte b2 = (byte)s2;//-128 to 127 //Narrowing - Converting Higher data type into Lower data type
		System.out.println(b2);
		
		byte t1 = 30;
		int i = t1;
		System.out.println(i);//30
		
		int j = 1000;
		byte k = (byte)j;//Narrowing 1000-256
		System.out.println(k);//-24
		
		int p = 100;
		float f = p;//Widening 
		System.out.println(f);
		
		float f1 = 45.23f;
		int p1 = (int)f1;//narrowing - we will loose the decimal data 
		System.out.println(p1);
		
		int d = 10000;
		double dd = d;//Widening 
		System.out.println(dd);//10000.0
		
		char ch = 'a';
		int d1 = ch;
		System.out.println(d1);//97--> a ASSCII Value
		
		byte b3 = 97;
		char ch1 = (char)b3;//narrowing 
		System.out.println(ch1);
		
		int d4 = 1200;
		char ch3 = (char)d4;//1200 // Narrowing
		System.out.println(ch3);//Ұ
		
	}

}
