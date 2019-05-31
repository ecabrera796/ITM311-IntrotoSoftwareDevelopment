import java.io.IOException;
import java.util.Objects;

public class ATM {
    public static void main(String args[]) throws IOException {
        Checking chkgAcct = new Checking(3000.00);
        Savings svngAcct = new Savings(3000.00);
        Mortgage mLoan = new Mortgage(250000.00);
        Student sLoan = new Student(55000.00);
        Auto aLoan = new Auto(45000.00);
        Personal pLoan = new Personal(4000.00);
        String PIN = "";

        // set PIN
        PIN = Display.inputDialog("********* IIT BANK AND TRUST COMPANY *********" + "\n" +
        						  "                   Please set your 4-Digit PIN" + "\n" + 
        						  "                    (Between 0100 and 8888)");
        int checkPIN = Integer.parseInt(PIN);
        Boolean okPIN = checkPIN > 0100 && checkPIN < 8888;

        if(!okPIN) {
            PIN = Display.inputDialog("         The PIN is invalid. Please try again.");
            checkPIN = Integer.parseInt(PIN);
            okPIN = checkPIN > 100 && checkPIN < 8888;
        }
   
        Display.messageDialog("                PIN set. Thank you!");

        // Login
        String userPIN = Display.inputDialog("           Please enter your PIN to login.");
        Boolean okLogin = Objects.equals(userPIN, PIN);
        
        while(!okLogin){
            userPIN = Display.inputDialog("The PIN you entered was incorrect. Please try again.");
            okLogin = Objects.equals(userPIN, PIN);
        }

        // Account Access
        while (true) {
            String select = Display.inputDialog("Which account would you like to access?" + "\n" +
            									"c for Checking, s for Savings, or l for Loans");
            
            // Checking Account
        if (Objects.equals(select.toLowerCase(), "c")){
        String selection = Display.inputDialog("************CHECKING ACCOUNT************" + "\n" +
            								  "             What would you lke to do?" + "\n" + 
            								  "	    w to Write a check, b to show Balance");
            if (Objects.equals(selection.toLowerCase(), "w")) {
                String check = Display.inputDialog("Please type the amount of the check.");
                chkgAcct.Checks(Double.parseDouble(check));
                chkgAcct.showBalance();
            } else if (Objects.equals(selection.toLowerCase(), "b")) {
                chkgAcct.showBalance();
            } else {
                Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
            }
                        
            // Savings Account
            } else if (Objects.equals(select.toLowerCase(), "s")) {
                String selection = Display.inputDialog("************SAVINGS ACCOUNT************" + "\n" + 
						  							   "             What would you lke to do?" + "\n" + 
						  							   "d for Deposit, w for Withdraw, or b for Balance");
                if (Objects.equals(selection.toLowerCase(), "d")) {
                    String amnt = Display.inputDialog("How much would you like to deposit?");
                    svngAcct.deposit(Double.parseDouble(amnt));
                    svngAcct.displayBalance();
                } else if (Objects.equals(selection.toLowerCase(), "w")) {
                    String amount = Display.inputDialog("How much would you like to withraw?");
                    svngAcct.withdraw(Double.parseDouble(amount));
                    svngAcct.displayBalance();
                } else if (Objects.equals(selection.toLowerCase(), "b")) {
                    svngAcct.displayBalance();
                } else {
                    Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                }
                
                // Loans
            } else if (Objects.equals(select.toLowerCase(), "l")) {
                String loans = Display.inputDialog("        Which loan would you like to view?" + "\n" +
                		                           "   m for Mortgage, s for Student, a for Auto," + "\n" +
                		                           "                      or p for Personal");
                // Mortgage
              if (Objects.equals(loans.toLowerCase(), "m")) {
                String selection = Display.inputDialog("************MORTGAGE LOAN************" + "\n" +
                									   "             What would you lie to do?"+ "\n" +
                									   "        p for Payment or b for Balance");
                if (Objects.equals(selection.toLowerCase(), "p")) {
                    mLoan.Payment();
                    mLoan.showBalance();
                } else if (Objects.equals(selection.toLowerCase(), "b")) {
                    mLoan.showBalance();
                } else {
                    Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                }
                
                // Student
             } else if (Objects.equals(loans.toLowerCase(), "s")) {
                String selection =  Display.inputDialog("************STUDENT LOAN************" + "\n" +
                										"             What would you lie to do?"+ "\n" +
                										"        p for Payment or b for Balance");
                if (Objects.equals(selection.toLowerCase(), "p")) {
                    sLoan.Payment();
                    sLoan.showBalance();
                } else if (Objects.equals(selection.toLowerCase(), "b")) {
                    sLoan.showBalance();
                } else {
                    Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                }
                
                 // Auto
              } else if (Objects.equals(loans.toLowerCase(), "a")) {
                    String selection = Display.inputDialog("************AUTO LOAN*************" + "\n" +
														   "             What would you lie to do?"+ "\n" +
                    									   "        p for Payment or b for Balance");
                    if (Objects.equals(selection.toLowerCase(), "p")) {
                        aLoan.Payment();
                        aLoan.showBalance();
                    } else if (Objects.equals(selection.toLowerCase(), "b")) {
                        aLoan.showBalance();
                    } else {
                        Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                    }

                    // Personal
                } else if (Objects.equals(loans.toLowerCase(), "p")) {
                    String selection = Display.inputDialog("************PERSONAL LOAN*************" + "\n" +
                    									   "             What would you lie to do?"+ "\n" +
                    									   "        p for Payment or b for Balance");
                    if (Objects.equals(selection.toLowerCase(), "p")) {
                        pLoan.Payment();
                        pLoan.showBalance();
                    } else if (Objects.equals(selection.toLowerCase(), "b")) {
                        pLoan.showBalance();
                    } else {
                        Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                    }
                } else {
                    Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
                }
            } else {
                Display.messageDialog("I'm sorry. I did not recognize your selection. Please try again.");
            }
        }
    }
}