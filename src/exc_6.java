import javax.swing.*;

public class exc_6 {
    public static void main(String[] args) {
        while (1 == 1) {
            int i = 0;
            int n = 0;
            double dbvalores[] = new double[3];

            while (i < 3) {
                dbvalores[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° valor"));
                if (dbvalores[i] < 0) {
                    n++;
                }
                i++;
            }
            JOptionPane.showMessageDialog(null, n + " valores são negativos");
        }

    }
}