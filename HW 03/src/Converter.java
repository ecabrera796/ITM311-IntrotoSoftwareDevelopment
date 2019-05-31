/* Erick Cabrera
 * September 10, 2016
 */

import java.util.Scanner;

public class Converter {
	public static void main(String args[]){
		
		//declare a new Scanner class object
		Scanner sc = new Scanner(System.in);
		
		//prompt user for seconds
		System.out.print("Please enter number in seconds: ");
		
		//declare local variable and read integer
		int seconds = sc.nextInt();
		
		//declare variable and calculate hours
		int hours = (seconds / 3600);
		
		//declare variable and calculate minutes
		int minutes = ((seconds % 3600) / 60);
		
		//declare variable and calculate seconds
		int sec = ((seconds % 3600) % 60);	
		
		//display conversion
		System.out.print(seconds + " seconds = " + hours + " hours " + minutes + " minutes "
						 + sec + " seconds");	
		
		sc.close();
		
	}
}
