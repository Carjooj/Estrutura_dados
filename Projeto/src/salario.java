public class salario {
    public static void main(String[] args) {
        double dbsalarios[] = {1500, 1800, 2000, 5000, 6000, 10000, 4500};


        for (int i = 0; i < dbsalarios.length; i++){
            dbsalarios[i] = dbsalarios[i] + 200;
            System.out.println(dbsalarios[i]);
        }
    }
}
