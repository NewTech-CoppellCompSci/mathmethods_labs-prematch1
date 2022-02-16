package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		 System.out.print("Please enter a positive integer: ");
		 int Number1 = inKey.nextInt();
		 System.out.print("Please enter a larger positive integer: ");
		 int Number2 = inKey.nextInt();
		
		 int scope = Number1;
			int min = Number2;

			for (int i = 0; i < Number2; i++) {
				int num = (int) (Math.random() * scope + min);
				System.out.println(num);
				
			}
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		 System.out.print("Please enter a positive integer: ");
		 int r = inKey.nextInt();
		 System.out.print("Please enter a positive integer: ");
		 int h = inKey.nextInt();
		
		 System.out.println(Math.PI * (r * r) * h);
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		 System.out.print("x1 ?");
		 int Cord1 = inKey.nextInt();
		 System.out.print("x2 ?");
		 int Cord2 = inKey.nextInt();
		 System.out.print("y2 ?");
		 int Cord3 = inKey.nextInt();
		 System.out.print("y2 ?");
		 int Cord4 = inKey.nextInt();
		 
		
		
		double num1Pow = Math.pow(Cord1 + Cord2, 2);
		double num2Pow = Math.pow(Cord3 + Cord4, 2);
	
		double num2 = Math.sqrt(num1Pow + num2Pow);
		
		System.out.println(num2);
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		 System.out.print("a-Value?");
		 int A = inKey.nextInt();
		 System.out.print("b-Value?");
		 int B = inKey.nextInt();
		 System.out.print("c-Value?");
		 int C = inKey.nextInt();
		 
		 double B2 = Math.pow(B, 2);
		int FourAC = 4 * A * C;
		double TwoA = 2 * A;
		double sqrt1 = Math.sqrt(B2 - FourAC);
		int B3 = -B;
		double B4 = B3 + sqrt1;
		double T3 =  B4 / TwoA;
		
		 double A2 = Math.pow(B, 2);
			int FourAC2 = 4 * A * C;
			double TwoA2 = 2 * A;
			double sqrt2 = Math.sqrt(A2 - FourAC2);
			int A3 = -B;
			double A4 = A3 - sqrt1;
			double T2 =  A4 / TwoA2;
		
			System.out.println("x = " + T2 + " or  x = " + T3);
	}
	
	

	
}
