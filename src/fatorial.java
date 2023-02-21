import javax.swing.*;

public class fatorial {
    public static void main(String[] args) {
        int fat = 1;
        int intn1 = 0;
        int intresultado = 0;

        intn1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro para obter o seu fatorial"));
        intresultado = intn1;

        while (intn1 >= 1) {
            fat *= intn1;
            intn1--;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + intresultado + " é igual a " + fat);

    }
}
