public class asteristico {
    public static void main(String[] args) {
        int i = 1;
        int n = 2;

        while (i < n) {
            System.out.print("*");

            if (n - i == 1) {
                i = 0;
                n++;
                System.out.println("");
                if (n == 7){
                    i = 50;
                }
            }


            i++;
        }
    }
}
