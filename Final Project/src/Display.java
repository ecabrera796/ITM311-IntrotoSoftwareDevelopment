import javax.swing.*;

public class Display {

    public static String inputDialog(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    public static void messageDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

}