public class fibonacci {
    public static void main(String[] args) {
         int i = 1;
         int a = 1;
         int b = 1;
         int intsoma = 0;

         while (i < 17) {
             intsoma = a + b;

             a = b;

             b = intsoma;

             System.out.println(intsoma);

             i++;
         }
    }
}
