import javax.swing.*;

public class val_int_until_0 {
    public static void main(String[] args) {
        int intn1 = 1;

        while (intn1 != 0) {
             intn1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite valores inteiros (digite 0 para parar)"));
        }
    }
}
