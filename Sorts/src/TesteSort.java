public class TesteSort {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int vetor[] = {4, 6, 1, 7, 4, 8};
        int vetor1[] = {4, 6, 1, 7, 4, 8};
        int vetor2[] = {4, 6, 1, 7, 4, 8};
        System.out.println("Selection Sort:");
        sort.selectionSort(vetor);

        System.out.println("");
        System.out.println("Insertion Sort:");
        sort.insertionSort(vetor1);

        System.out.println("");
        System.out.println("Bubble Sort:");
        sort.bubbleSort(vetor2);
    }
}
