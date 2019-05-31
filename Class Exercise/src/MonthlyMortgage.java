import java.util.Scanner;

public class MonthlyMortgage
{
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[ ])
   {
      //declare the local variables and initialize them
        double purchasePrice = 0.0;
        double perCentDP = 0.0;
        double loanAmt = 0.0;
        double rate = 0.0;
        double pmt = 0.0;
        int term = 0;
        char answer ='Y';
        
        
        while (answer == 'Y' | answer == 'y'){
        
        System.out.println("Hello! Please insert your purchase price: ");
        	purchasePrice = sc.nextDouble();
    	System.out.println("Now insert your down payment percent: ");
    		perCentDP = sc.nextDouble();
    	System.out.println("Next, insert your term in years: ");
    		term = sc.nextInt();
    	System.out.println("Almost done! We just need your interest rate: ");
    		rate = sc.nextDouble();
    	System.out.println("Lastly, insert your loan amount: ");
    		loanAmt = sc.nextDouble();

    	pmt = loanAmt * (rate/12) / (1 - Math.pow(1 + rate/12, -term*12));
    	
    	System.out.println("Based off your information, your monthly mortgage payment is: " +
    					   "\n" + pmt);
    	System.out.println("Would you like to calculate another mortgage?");
    	System.out.println("Y = yes, N = no");
    	answer = sc.next().charAt(0);
  	}
  }
}
    
