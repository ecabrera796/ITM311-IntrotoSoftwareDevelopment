// Program to calculate Simple Interest.      
// Programmer: Erick Cabrera, File Name: Interest.java
// the packages
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

// the class definition

public class Interest 
{
 // the global variables are declared
 static double earnings = 0, principal = 0, rate = 0, time = 0, total = 0;

 // introduce a DecimalFormat object
 static DecimalFormat twoPlace = new DecimalFormat("0.00");
 
 // the method to obtain data
 public static void getData()
 {
   // local variables declared and assigned initial values
   String firstNum = "", secondNum = "", thirdNum = "";
   // local variables updated via prompt boxes
   firstNum = JOptionPane.showInputDialog("Enter the Principal");
   secondNum = JOptionPane.showInputDialog("Enter Rate, as a %");
   thirdNum = JOptionPane.showInputDialog("Enter Time, in years");
   
   // update the global variables
   principal = Double.parseDouble(firstNum); 
   rate = Double.parseDouble(secondNum);
   time = Double.parseDouble(thirdNum);
 }
 
 // method that calculates accumulated interest earnings
 public static void calcAccumulated(){
	  // calculate interest earnings
	  earnings = principal * rate / 100 * time;
	  
	  //calculate accumulated amount
	  total = earnings + principal;
 }
 
 // method that shows accumulated interest earnings
 public static void showAccumulated(){
	// display the result in a message box
	JOptionPane.showMessageDialog(null, "interest earnings: $" + 
								  twoPlace.format(earnings) + "\n" +
								  "accumulated amount: $" + 
								  twoPlace.format(total),"Result",
								  JOptionPane.PLAIN_MESSAGE);

 }
	
 // the main() method	
 public static void main(String args[])
 {
  // call the getData() method
  getData();
  
  //call the calcAccumulated() method
  calcAccumulated();
  
  // call the showAccumulated() method
  showAccumulated();
             
  System.exit(0);
 }
}