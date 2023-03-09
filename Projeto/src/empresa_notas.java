import java.util.Scanner;

public class empresa_notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        double dbsoma = 0;
        double dbmedia;
        int inttamanho = 10;
        double dbnotas[] = new double[inttamanho];

        for (i = 0; i < dbnotas.length;i++){
            System.out.println("Digite a " + (i + 1) + "° nota");

            dbnotas[i] = in.nextDouble();

            dbsoma = dbnotas[i] + dbsoma;

        }

        dbmedia = dbsoma / dbnotas.length;
        System.out.println(dbmedia);

        for (double dbnota : dbnotas) {
            if (dbnota >= dbmedia) {
                System.out.println(dbnota);
            }

        }
    }
}
