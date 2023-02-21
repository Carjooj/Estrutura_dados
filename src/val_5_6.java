import javax.swing.*;

public class val_5_6 {
    public static void main(String[] args) {
        int i = 0;
        int n = 1;
        int intval = 0;
        double dbmais = 0;
        double dbsoma = 0;

        intval = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de valores que deseja ser lido para obter a média"));
        double dbn1[] = new double[intval];

        while (i < intval) {
            dbn1[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° valor"));

            i++;
        }

        while (n < intval) {
            dbn1[0] += dbn1[n];
            n++;
        }

        JOptionPane.showMessageDialog(null, "A soma dos valores é igual a " + dbn1[0]);

    }
}
