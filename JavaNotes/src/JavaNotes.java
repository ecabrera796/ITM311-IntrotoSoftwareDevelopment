/* Erick Cabrera
 * August 31, 2016
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class JavaNotes 
{
	//Here is that math problem written in the Java language.
	
	public static void main(String args[]) 
	{
	  //Call in Decimal library
	  DecimalFormat twoPlace = new DecimalFormat("0.00");
	  //First, knowing that the area of a circle is 
	  double A = 62.80, r = 0, C = 0, S = 0;
	  //compute the radius r
	  r = Math.sqrt(A / 3.1416); 
	  //compute the circumference C 
	  C  =  2 * 3.1416 * r;
	  //compute the surface area
	  S = 4 * 3.1416 * (r * r);
	  //display the circumference and surface area
	  JOptionPane.showMessageDialog(null, "the circumference: " + twoPlace.format(C) + " and " + "the surface area: " + twoPlace.format(S), "Result", JOptionPane.PLAIN_MESSAGE);
	}
}
