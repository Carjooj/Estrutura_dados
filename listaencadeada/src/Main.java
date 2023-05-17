/*
Implemente uma função que receba uma lista e retorne a soma dos valores dos seus elementos.

Escreva uma função que receba duas listas e retorne uma nova lista que contenha todos os elementos das listas originais, intercalados.

Crie uma função que inverta a ordem dos elementos de uma lista.

Escreva um programa que leia uma lista de números inteiros e retorne uma nova lista com apenas os números pares.
 */





public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar(1f);
        lista.adicionar(1f);
        lista.adicionar(1f);
        lista.adicionar(1f);
        lista.adicionar(1f);
        lista.adicionar(1f);

        System.out.println(somaLista(lista));
    }

    public static Object somaLista(Lista lista) {
        float soma = 0;
        for (int i = 0; i < lista.tamanho / 2; i++) {
            soma = soma + lista.inicio.proximo.info + lista.inicio.info;
        }
        return soma;
    }
}
