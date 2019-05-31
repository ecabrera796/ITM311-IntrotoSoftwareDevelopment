
/* Programmer: Erick Cabrera, filename: Inventory.java */

import java.io.*;
// the class definition
public class Inventory 
{
  // declare a BufferedReader object	
  static BufferedReader kb = new
         BufferedReader(new InputStreamReader(System.in));

  public static void main(String args[]) throws IOException 
  {
	// declare the variables that are local to main()  
    int itemNum = 0, intLocate = 0;
    String strName = " ";
    char again = 'Y';
    // request and receive data from the user
    System.out.println("please enter your name");
    strName = kb.readLine();
    System.out.println("welcome " + strName);
     
    // enter a looping structure
    while (again == 'Y')
    {
     System.out.println("please enter the item number");
     itemNum = Integer.parseInt(kb.readLine());
     // enter a group of decision statements
     if (itemNum >= 1000 && itemNum <= 1999 && itemNum != 1621) intLocate = 1; 
     if (itemNum >= 2000 && itemNum <= 5000 && itemNum != 2175) intLocate = 2;
     if (itemNum >= 5001 && itemNum <= 9000) intLocate = 3;
     if (itemNum >= 9001 && itemNum <= 9999 && itemNum != 9876) intLocate = 4;
     if (itemNum == 1621 || itemNum == 2175 || itemNum == 9876) intLocate = 5;
    
     switch(intLocate)  
     {
      case 1: System.out.println("lower level"); break;
      case 2: System.out.println("main floor"); break; 
      case 3: System.out.println("upper level"); break;
      case 4: System.out.println("mezzanine"); break;
      case 5: System.out.println("item no longer available for sale"); break;
      default: System.out.println("invalid number"); break;
     }
      intLocate =0;
     System.out.println("locate another item (Y / N ) ?");
     again = kb.readLine().charAt(0);
     if (again == 'N') { System.exit(0); kb.close(); }
    }
  }
}