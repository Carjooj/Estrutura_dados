public class vetor_nomes {
    public static void main(String[] args) {
        String nomes[] = {"Clodowaldo", "Oswaldo", "Nelson", "Luana", "Helena", "Arthur"};
        String nomeauxiliares[] = new String[nomes.length];

        for (int i = nomes.length; i > 0; i--) {
            nomeauxiliares[nomes.length - i] = nomes[i - 1];
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomeauxiliares[i] + " ");
        }
    }
}
