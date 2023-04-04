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
        return primeiro.info;
    }

    Object retirar () {
        if (estaVazia()) {
            return "Vazia";
        }
        Object info = primeiro.info;
        primeiro = primeiro.ponteiro;
        tamanho--;
        return info;
    }
}
