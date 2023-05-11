public class TesteSort {
    public static void main(String[] args) {
        int vetor[] = {7, 9, 5, 6, 7, 2, 5, 1, 4, 2};

/*
        menorMaior(vetor);*/
        bubbleSort(vetor);
        System.out.println(" ");

    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean alterou = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    alterou = true;
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }

            }
            if (!alterou) {
                return;
            }
            else {
                alterou = false;
            }
        }
        for (int elemento : vetor) {
            System.out.print(" " + elemento);

        }
    }

    public static void menorMaior(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = Integer.MAX_VALUE;
            int indice = 0;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < menor ) {
                    menor = vetor[j];
                    indice = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = menor;
            vetor[indice] = temp;
            }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
        }

    }
