/* Programmer: Erick Cabrera
 * Filename: GuessingGame.java
 */

// import a class for random numbers
import java.util.Random; 
import java.util.Scanner;

public class GuessGame 
{
	// method to generate a random number
	public static int RandomNumber()
	{
		// local variable to hold a random number
		int rNum = 0;
		// a random object is created
		Random rand = new Random(); 
		// a random number is generated
		rNum = rand.nextInt(20) + 1; 
		// random number is returned to main()
		return rNum;
	}

	public static void guessingGame(){
		int x = 0, guess = 0, response = 1;
		
		Scanner sc = new Scanner(System.in);
		//The while loop condition allows the user to 
		//continue and input another guess if necessary
 
			do{
				x = RandomNumber();
				System.out.println("I'm thinking of a number from 1-20. What is it?");
				guess = sc.nextInt();
				while(guess != x){
					// tell the user if they are too high or too low
					if (guess < x ){
						System.out.println("too low ");
						System.out.println("guess again:");
						guess = sc.nextInt();
					}
					else if (guess > x ){
						System.out.println("too high ");
						System.out.println("guess again:");
						guess = sc.nextInt();
					}
					
				}
			System.out.println("You guessed correctly!");
			System.out.println("Try again?"); 
			System.out.println("type (1 = yes, 2 = no)? ");
			//input user response
			response = sc.nextInt();
			}
			while (response == 1); 
			//end inner while loop 
			
			//end outer while loop 
			sc.close();
	}
	// the main() method
	public static void main(String args[])
	{
		guessingGame();
	}
} 