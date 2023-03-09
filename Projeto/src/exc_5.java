import javax.swing.*;

public class exc_5 {
    public static void main(String[] args) {
            double dbn1 = 0;
            double dbn2 = 0;

            dbn1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor"));
            dbn2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um outro valor"));

            if (dbn1 > dbn2) {
                JOptionPane.showMessageDialog(null, dbn1 + " é o maior valor");

            } else if (dbn2 > dbn1) {
                JOptionPane.showMessageDialog(null, dbn2 + " é o maior valor");

            } else {
                JOptionPane.showMessageDialog(null, "Os valores são iguais");
            }
        }
    }

