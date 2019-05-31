/* Erick Cabrera
 * September 9, 2016
 * Java program that asks for demographic information
 */

import java.util.Scanner;

public class Demograph {
	public static void main(String args[])	
	{
	  //declare a Scanner class object
	  Scanner sc = new Scanner(System.in);
	  
	  //prompt user for their name
	  System.out.println("Please enter your name:");
		
	  //declare a local variable and read the string
	  String name = sc.nextLine();
	  
	  //prompt user for location
	  System.out.println("Which city, state, and country do you currently reside in?");
	  
	  //declare a local variable and read the string
	  String location = sc.nextLine();
	  
	  //prompt user for number of courses they are taking
	  System.out.println("How many courses are you currently taking?");
	  
	  //declare a local variable and read the integer
	  int courses = sc.nextInt();
	  
	  //prompt user for number of credit hours they are taking
	  System.out.println("How many credit hours are you currently taking?");
	  
	  //declare local variable and read the amount
	  double credits = sc.nextDouble();
	  
	  //Ask user if they like Java or not
	  String YN;
	while(true){
	  System.out.println("Do you enjoy JAVA? (Y for yes, N for no)");
	  
	  //declare local variable and read the string
	  YN = sc.next();
	  
	  //if YN = Y or N continue, else prompt user to answer again
	  if(YN.equalsIgnoreCase("Y") || YN.equalsIgnoreCase("N")){
		  System.out.println("Thank you for your time " + name + "!");
		break;
	  }
	  else{
		  System.out.println("Please answer Y for yes or N for no");
	  }
	}
	  
	  //List user their answers
	  System.out.println("Here is what we got based off your answers:" + "\n");
	  
	  System.out.print("Student Name: " + name + "\n" + "Location: " + location + "\n" +
			  		   "Courses: " + courses + "\n" + "Credit Hours: " + credits + "\n"
			  		   + "Do you enjoy JAVA? " + YN);
	 
	  sc.close();
	}
}