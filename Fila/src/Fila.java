import javax.swing.*;

public class Fila {
    int tamanho;

    No primeiro;

    No fim;

    public Fila () {
        tamanho = 0;
        primeiro = null;
        fim = null;
    }

    boolean estaVazia () {
        return tamanho == 0;
    }

    void adicionar (Object info) {
        No no = new No(info);

        if (estaVazia()) {
            primeiro = no;
        }
        else {
            fim.ponteiro = no;
        }
        fim = no;
        tamanho++;
    }
 Object primeiroFila () {
        if (estaVazia()) {
            return  null;
        }
        else {
            return primeiro.info;
        }
    }

    Object finalFila () {
        if (estaVazia()) {
            return null;
        }
        else {
            return fim.info;
        }
    }

    Object retirar () {
        if (estaVazia()) {
            return null;
        }
        Object info = primeiro.info;
        primeiro = primeiro.ponteiro;
        tamanho--;
        return info;
    }

    String retornaFila() {
        String tarefas = "";
        No noAtual = primeiro;
        for (int i = 1; i <= tamanho; i++) {
            tarefas += noAtual.info + "\n";
            noAtual = noAtual.ponteiro;
        }
        return tarefas;
    }
}
