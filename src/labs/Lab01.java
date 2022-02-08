package labs;

import java.util.Scanner;

public class Lab01 {

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
		 System.out.print("Please enter a positive integer: ");
		 int Number2 = inKey.nextInt();
		 	int num = Number1;
			double num1Pow = Math.pow(Number1, Number2);
			System.out.println(Number1 + " ^ " + Number2 + " = " + num1Pow + "\n");
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		 System.out.print("Please enter a positive integer: ");
		 int Number = inKey.nextInt();
		
		 double num2 = Math.sqrt(Number);
			System.out.println("The square root of " + Number + " is " + num2 + "\n");
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		 System.out.print("Please enter a side length: ");
		 int Number1 = inKey.nextInt();
		 System.out.print("Please enter a side length: ");
		 int Number2 = inKey.nextInt();
		
			double num1Pow = Math.pow(Number1, 2);

			double num2Pow = Math.pow(Number2, 2);
			System.out.println("Hypotenuse = " + (num1Pow + num2Pow) + "\n");
		
		

	}


	
	
	public static void problem04() {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	
		Scanner inKey = new Scanner(System.in);
		boolean zero = false;
		int input = 0;
		int total = 0;
		
		while(!zero) {
			
		System.out.print("Enter a Number");
		input = inKey.nextInt();
		
		total += input;
		
		if (input == 0) {
			zero = true;
			
		}
	
		}
		System.out.println( "This is your max " + max);
	}
}
		
		
	
	
	
	
	
	
	

