public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("oswaldo");
        fila.adicionar("clodowaldo");
        fila.adicionar("nelson");
        fila.adicionar("pulga");
        fila.adicionar("babs");

        System.out.println(fila.retirar());

        fila.adicionar("add");

        System.out.println(fila.primeiroFila());

        System.out.println(fila.retirar());

        System.out.println(fila.primeiroFila());
    }
}