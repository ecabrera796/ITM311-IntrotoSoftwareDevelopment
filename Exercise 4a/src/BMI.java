import java.text.DecimalFormat;
import java.util.Scanner;
public class BMI {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Please enter your weight in pounds and ounces (Ex: 190.5): ");
		double weight = sc.nextDouble();
		
		System.out.print("Please enter your height in inches: ");
		double height = sc.nextDouble();
		
		double bmi = weight / (height * height) * 703;
		DecimalFormat form = new DecimalFormat("0.0");
		String status;
		
		if(bmi > 30.0){
			status = "you are obese.";
		} else if(bmi >= 25.0 && bmi <= 29.9){
			status = "you are overweight.";
		} else if(bmi >= 18.5 && bmi <=  24.9){
			status = "you are normal.";
		} else{
			status = "you are underweight.";
		}
		
		System.out.println("Hello " + name + "! \n" +
						   "Based off of your weight (" + weight +
						   " lbs) and height (" + height + " in), \n" +
						   "I calculated that your BMI is +" +
						   form.format(bmi) + "\nMeaning " + status);
		
		
		
		sc.close();
	}
}