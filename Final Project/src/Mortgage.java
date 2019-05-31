import javax.swing.*;

public class Mortgage {
    private double balance;
    private static final double MONTHLY_PAYMENT = 2000;

    public Mortgage(double initBal) {
        balance = initBal;
    }

    public void Payment() {
        balance -= MONTHLY_PAYMENT;
    }


    public void showBalance(){
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
    }

}