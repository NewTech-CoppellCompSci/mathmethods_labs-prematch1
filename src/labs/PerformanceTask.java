package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
	Scanner inKey = new Scanner(System.in);
	 System.out.print("Enter Launch Velocity");
	 int Velocity = inKey.nextInt();
	 System.out.print("Enter Launch Angle");
	 int Angle = inKey.nextInt();
	 
	int x = Velocity;
	int y = Angle;
	double Time2 = Math.pow(5, 2);
	 
	Math.cos(Math.toRadians(Angle));
	Math.sin(Math.toRadians(Angle));
	
	System.out.println("Time: 5s");
	System.out.println("pos x: " + Math.sin(Angle) * 5 * Velocity);
	System.out.println("pos y: " + Math.cos(Angle) * 5 * Velocity * 9.8 * Time2);
	 }
	}
	
	

