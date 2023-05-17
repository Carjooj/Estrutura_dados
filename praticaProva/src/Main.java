public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(fibo(i));

        }
    }
    public static double fatorial(double v1) {
        if (v1 == 1) {
            return 1;
        }
        else {
            v1 = v1 * fatorial(v1 - 1);
        }
        return v1;
    }

    public static int fibo(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            n = fibo(n - 1) + fibo(n - 2);
        }
        return n;
    }
}