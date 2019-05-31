import javax.swing.*;

public class Checking {
    double balance;
    public Checking(double initBal){
        balance = initBal;
    }

    public void Checks(double amnt) {
        balance -= amnt;
    }

    ;
    public void showBalance(){
        JOptionPane.showMessageDialog(null, "Balance is: $" + balance);
    }
}
