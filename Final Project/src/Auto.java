import javax.swing.*;

public class Auto {
    private double balance;
    private static final double MONTHLY_PAYMENT = 500;

    public Auto(double initBal) {
        balance = initBal;
    }

    public void Payment() {
        balance -= MONTHLY_PAYMENT;
    }
    
    public void showBalance(){
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
    }

}