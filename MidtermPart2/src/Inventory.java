import java.util.Scanner;
 //Erick Cabrera, Programmer
 public class Inventory 
 {
  static Scanner sc = new Scanner(System.in);
  static int sumItems;
  static double average;
  
  public static void main(String args[])
  {
	   // begin local variable declaration / initialization zone
	   char answer = 'Y';
	   // call a method
	   displayMenu();
   
   while(answer == 'Y' || answer == 'y') 
   { 
	//call methods
    averageCost();
    computeTax(sumItems, average);
	   
    // begin code block to display results
    System.out.println("***************************");
    // end code block to display results
    
    // begin code block to perform additional program run 
    System.out.println("run again(Y or N)?");
    answer = sc.next().charAt(0);
    // end code block to perform additional program run 
   }
    System.out.println("***************************");
   }// end main() method 
  
   static void displayMenu()
   {
	   // begin program menu
	   System.out.println("");
	   System.out.println("");
	   System.out.println("*******************************");
	   System.out.println("     Inventory Valuation       ");
	   System.out.println("  (Weighted Average Method)    ");
	   System.out.println("*******************************");
	   System.out.println(""); 
	   System.out.println("");
	   System.out.println("----------- M E N U -----------");
	   System.out.println("");
	   // end program menu
	   
   }//end method
   
   static double averageCost()
   {
	   double cost = 0.0, totValue = 0.0;
	   int number = 0,  quantity = 0;
	   String item = "";
	   
	    // begin code block for inventory evaluation
	    System.out.println("number of item types in the inventory ->");
	    number = sc.nextInt();
	   
	    for(int i = 1; i <= number; i++)
	    {
	     System.out.println("enter the item's description");
	     item = sc.next();
	     System.out.println("item description: " + item);
	     System.out.println("enter item quantity");
	     quantity = sc.nextInt();
	     sumItems += quantity;
	     System.out.println("enter item cost");
	     cost = sc.nextDouble();
	     totValue += cost * quantity;
	    }
	    average = totValue / sumItems;
	    System.out.printf("average cost: $%.2f\n", average);
	    // end code block for inventory evaluation
	    
	   return average;
   }//end method
   
   static void computeTax(int sumItems, double average){
	   double tax =  average * .06;	
	   System.out.printf("at a level of " + sumItems + " units, the inventory tax is $%.2f\n", tax);
   }
  }// end class