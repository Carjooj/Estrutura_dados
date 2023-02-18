import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        double dbsoma = 0;
        double dbleitura[] = new double[3];

        while(i < 3){
            dbleitura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° valor"));
            i++;
        }

        dbsoma = dbleitura[0] + dbleitura[1] + dbleitura[2];

        JOptionPane.showMessageDialog(null, "A soma dos três valores é igual a " + dbsoma);

    }
}