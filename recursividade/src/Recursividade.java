public class Recursividade {
    public static void main(String[] args) {
        System.out.println(multi(5 , 5));

    }
    /*public static double multi(double v1, double v2){
        double resul = 0;
        for (int i = 1; i <= v1; i++) {
            resul = resul + v2;
        }
        return resul;
    }*/

    //Função recursiva
    public static double multi(double v1, double v2){
        double resul = 0;
        resul = resul + v2;
        if (v2 == 1){
            return v1;
        }
        else {
            return v1 + multi(v1,v2-1);
        }

    }
}
