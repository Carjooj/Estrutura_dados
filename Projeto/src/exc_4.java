import javax.swing.*;

public class exc_4 {
    public static void main(String[] args) {
        int i = 0;
        double dbleitura[] = new double[3];

        while(i < 3){
            dbleitura[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "° lado do triângulo"));
            i++;
        }

        if (dbleitura[0] == dbleitura[1] && dbleitura[0] == dbleitura[2]){
            JOptionPane.showMessageDialog(null, "Esse Triangulo é equilátero");
        }
        else {
            JOptionPane.showMessageDialog(null, "Esse Triangulo não é equilátero");
        }
    }
}
