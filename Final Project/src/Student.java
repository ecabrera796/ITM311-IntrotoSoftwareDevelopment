import javax.swing.*;

public class Student {
    private double balance;
    private static final double MONTHLY_PAYMENT = 200;

    public Student(double initBal) {
        balance = initBal;
    }

    public void Payment() {
        balance -= MONTHLY_PAYMENT;
    }


    public void showBalance(){
        JOptionPane.showMessageDialog(null, "Balance: $" + balance);
    }
}