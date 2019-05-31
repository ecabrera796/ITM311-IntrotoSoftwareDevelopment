import javax.swing.*;

public class Personal {
    private double balance;
    private static final double MONTHLY_PAYMENT = 1000;

    public Personal(double initBal) {
        balance = initBal;
    }

    public void Payment() {
        balance -= MONTHLY_PAYMENT;
    }

    public void showBalance(){
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
    }

}