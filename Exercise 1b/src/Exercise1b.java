import java.util.Scanner;
import java.lang.Math;
class Exercise1b
{
	//program that calculates different mathematical functions

public static void main(String args[])	
{
  //declare a Scanner class object
  Scanner sc = new Scanner(System.in);
	
  //prompt user for their name
  System.out.println("please enter your name");
	
  //declare a local variable and read the integer
  String name = sc.nextLine();
	
  //display the name back to the user
  System.out.println("hello " + name);
	
  //prompt user for w
  System.out.println("please enter a number for w");
  
  //declare a local variable and read the number for w
  float numW = sc.nextFloat();
  
  //prompt user for x
  System.out.println("please enter a number for x");
  
  //declare a local variable and read the number for x
  float numX = sc.nextFloat();
  
  //prompt user for y
  System.out.println("please enter a number for y");
  
  //declare a local variable and read the number for y
  float numY = sc.nextFloat();
	
  //display the sum of x and y to user
  System.out.println("the sum of x and y is: " + (numX + numY));
  
  //display the subtraction of y from x
  System.out.println("the subtration of y from x is: " + (numX - numY));
  
  //calculate product of x and y
  float xy = numX * numY;
  
  //assign product of x and y to variable w
  numW = xy;
  
  //display quotient of x by y
  System.out.println("the quotient of x by y is: " + (numX / numY));
  
  //calculate modulus of x and y
  float modxy = numX % numY;
  
  //display modulus of x and y
  System.out.println("the modulus of x and y is: " + modxy);
  
  //assign modulus of x and y to variable w
  numW = modxy;
  
  //calculate quotient of y by x
  float qyx = numY / numX;
  
  //display quotient of y by x
  System.out.println("the quotient of y by x is: " + (numY / numX));
  
  //assign quotient of y by x to variable z
  float z = 0;
  z = qyx;
  
  //calculate result of raising x by y
  double result = Math.pow(numX, numY);
  
  //display result of raising x by y
  System.out.println("the result of raising x by y is: " + result);
 
  sc.close();
}
} 
