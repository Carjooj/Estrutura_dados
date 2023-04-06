import javax.swing.*;

public class Main {
    static int op = 0;
    static Fila fila = new Fila();

    public static void main(String[] args) {

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção"
            + "\n 1 - Enfileirar"
            + "\n 2 - Início"
            + "\n 3 - Desenfileirar"
            + "\n 4 - Imprimir"
            + "\n 0 - Sair")
            );

            switch (op) {
                case 1:
                    String tarefas = JOptionPane.showInputDialog(null, "Digite o que você deseja enfileirar");
                    fila.adicionar(tarefas);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, fila.primeiroFila());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, fila.retirar());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, fila.retornaFila());
                    break;
                default:
                    JOptionPane.showMessageDialog(null,  "Opção inválida");

            }
        }
        while (op != 0);

        }
    }