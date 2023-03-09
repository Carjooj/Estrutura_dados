import javax.swing.*;

public class exc_7 {
    public static void main(String[] args) {
        while (1 == 1) {
            int intidade = 0;

            intidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));

            if (intidade < 16) {
                JOptionPane.showMessageDialog(null, "Você não pode votar");

            } else if (intidade == 16 || intidade == 17 || intidade > 70) {
                JOptionPane.showMessageDialog(null, "O seu voto é facultativo");

            } else {
                JOptionPane.showMessageDialog(null, "O seu voto é obrigatório");
            }
        }
    }
}
