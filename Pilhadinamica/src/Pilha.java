public class Pilha {
    int tamanho;
    No topo;

    public Pilha() {
        tamanho = 0;
        topo = null;
    }

    boolean estaVazia(){
        return tamanho == 0;
    }

    void empilhar(Object info){
        No no = new No(info);
        if (!estaVazia()) {
            no.ponteiro = topo;
        }
        topo = no;
        tamanho++;
    }

    Object top(){
        if (estaVazia()){
            return "Vazia";
        }
        return topo.info;
    }

    Object desempilhar(){
        if (estaVazia()) {
            return "Vazia";
        }
        Object info = topo.info;
        topo = topo.ponteiro;
        tamanho--;
        return info;
    }
}
