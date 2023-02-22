
public class asteristico2 {
    public static void main(String[] args) {
        int i = 1;
        int n = 2;
        int l = 2;
        int intespaco = 0;
        int intespacol = 6;
        int intespaconeg = 1;

        while (i < n) {

            while (intespaco < intespacol){
                System.out.print(" ");
                intespaco++;
            }


            System.out.print("*");

            if (n - i == 1) {
                i = 0;
                n += l;
                intespaco = 0;
                intespacol -= intespaconeg;
                System.out.println("");

                if (n == 12){
                    l = -2;
                    intespacol = 1;
                    intespaconeg = -1;
                }
            }


            i++;
        }
    }
}
