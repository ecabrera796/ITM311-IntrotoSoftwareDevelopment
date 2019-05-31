import javax.swing.*;

public class Savings {
    private double balance;

    public Savings(double initBal){
        balance = initBal;
    }

    public void deposit(double amnt){
        balance += amnt;
    }
    public void withdraw(double amnt){
        balance -= amnt;
    }
   // public void showBalance(){
      //  System.out.println("Your current account balance is: $" + balance);
    //}
    public void displayBalance(){
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
    }
}