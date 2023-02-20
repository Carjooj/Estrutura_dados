import javax.swing.*;

public class val_5_6 {
    public static void main(String[] args) {
        int i = 0;
        double dbsoma = 0;
        double dbn1 = 0;
        double dbn2 = 0;
        double dbn3 = 0;

        while (i < 5) {
            dbn1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° valor"));

            dbn2 = dbn1;

            i++;
        }
    }
}
