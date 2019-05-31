/* Erick Cabrera
 * September 8, 2016
 */

import java.util.Scanner;

public class Power {
	public static void main(String args[])
	{
		//declare a new Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//prompt user for current
		System.out.println("Please enter the current (I): ");
		
		//declare local variable and read double
		double current = sc.nextDouble();
		
		//prompt user for resistance
		System.out.println("Please enter the resistance (R): ");
		
		//declare a local variable and read double
		double resistance = sc.nextDouble();
		
		//declare variable for power
		double power;
		
		//calculate power
		power = Math.pow(current, 2) * resistance;
		
		//display power
		System.out.print("Power dissipated: " + power + " watts");
		
	sc.close();
				
	}
}
