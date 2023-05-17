public class Lista {
    No inicio;
    No fim;
    int tamanho;

    Lista(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    void adicionar(float info){
        No no = new No(info);
        if (estaVazia()){
            inicio = no;
        }
        else {
            fim.proximo = no;
        }
        fim = no;
        tamanho++;
    }

    boolean estaVazia() {
        return tamanho == 0;
    }
    void imprimirLista(){
        No no = inicio;
        for (int i = 0; i < tamanho; i++) {
            System.out.println(no.info);
            no = no.proximo;
        }
    }

    Object retornarInfo(int indice){
        No no = inicio;
        for (int i = 1; i < indice; i++) {
            no = no.proximo;
        }
        return no.info;
    }

    /*String buscaTelefone(String nome){
        No no = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (no.nome.equals(nome)) {
                return no.tel;
            }
            no = no.proximo;
        }
        return "Não localizado";
    }*/
}
