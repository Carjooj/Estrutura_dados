public class tabuada01 {
    public static void main(String[] args) {
        int i = 1;
        int n = 11;
        int intmult = 1;


        while (i < n){
           String strespaco = "   |   ";

            if (i * intmult > 9) {
                strespaco = "   |  " ;
            }

            if (i * intmult > 99) {
                strespaco = "   | ";
            }


            System.out.print(strespaco + i * intmult);

            if (i == 10) {
                i = 0;
                intmult++;
                System.out.print("  |");
                System.out.println("");

                if (intmult == 11) {
                    i = 50;
                }
            }

            i++;
        }
    }
}
