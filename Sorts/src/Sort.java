public class Sort {
    private int[] vetor;

    public Sort() {}

    public Sort(int[] vetor) {
        this.vetor = vetor;
    }

    public void selectionSort(int[] vetor) {
        int n = vetor.length;

        // Percorrendo o vetor/array
        for (int i = 0; i < n - 1; i++) {
            // Encontrando o menor elemento no array/vetor desordenado
            int indiceMenor = i;
            for (int j = i; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // trocando o menor elemento com o primeiro elemento do array/vetor desordenado
            for (int k : vetor) {
                System.out.print(" " + k);
            }
            System.out.println(" ");
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
    }

    public void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > atual) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = atual;
            for (int k = 0; k < vetor.length; k++) {
                System.out.print(" " + vetor[k]);
            }
            System.out.println("");
        }
    }

    public void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean alterou = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    alterou = true;
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    for (int valor : vetor) {
                        System.out.print(" " + valor);
                    }
                    System.out.println("");
                }

            }
            if (!alterou) {
                return;
            } else {
                alterou = false;
            }
        }
    }
}


