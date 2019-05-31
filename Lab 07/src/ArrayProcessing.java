/********************************************************************
 Program Name: ArrayProcessing.java
 Programmer's Name: Erick Cabrera
 Program Description: Manipulation of three arrays
 ********************************************************************/

 // include any necessary packages / libraries
 import java.text.DecimalFormat;

 // the class file
 public class ArrayProcessing
 {
  // declare the global variables for the array indices
  public static final int index = 10;
  public static int count = 0;

  // declare the three arrays
  public static double[] priceArray = 
  { 5.73, 11.77, 13.41, 14.25, 19.64, 
  8.37, 9.19, 19.44, 18.53, 12.04 };

  public static int[] quantityArray = 
  { 3, 9, 7, 8, 10, 12, 3, 6, 3, 5 };

  public static double[] amountArray = 
  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  
  public static char[]  statusArray = {'A' , 'B'};

  // declare a decimal formatting object
  static DecimalFormat df = new DecimalFormat("###,###.##");

  // the main() method is defined
  public static void main(String[] args)
  {
   // call the method named process()
   process(priceArray, quantityArray);
   
   // call the method named display()
   display(priceArray, quantityArray);
  }

  // define the method named process()
  static void process(double[] priceA, int[] quantityA)
  {
	// global arrays restored
	priceArray = priceA;
	quantityArray = quantityA;
    

	// looping structure to perform the multiplication 
	for(count = 0; count < index; count++)
	{
      	// body statement(s) for the looping structure
		amountArray[count] = priceArray[count] * quantityArray[count];
	}
  }

  // define the method named display()
  static void display(double[] prices, int[] quantities)
  {
	// global arrays restored
	priceArray = prices;
	quantityArray = quantities;

	// output displayed
	for(int i = 0; i < index; i++)
	{
       // body statement(s) for the looping structure
		System.out.println(priceArray[i] + " * " + quantityArray[i]
						 + " = " + df.format(amountArray[i]));
     }
	for(int j = 0; j < index; j++){
		if(amountArray[j] > 100){
			System.out.println(statusArray[0]);
		} else {
			System.out.println(statusArray[1]);
	    }
	}		System.out.print(" ");
  }
}//end the class 
