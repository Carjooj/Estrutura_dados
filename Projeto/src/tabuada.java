import javax.swing.*;

public class tabuada {
    public static void main(String[] args) {
        int i = 0;
        int intn1 = 0;
        int intmult;

        intn1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para exibir a sua tabuada"));

        while (i < 11){
            intmult = intn1 * i;

            JOptionPane.showMessageDialog(null, intn1 + " X " + i + " = " + intmult);
            i++;
        }
    }
}
