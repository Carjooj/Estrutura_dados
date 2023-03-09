public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar("Clodowaldo", "40028922");
        lista.adicionar("Nelson", "123456789");
        lista.adicionar("Oswaldo", "987654321");


        System.out.println(lista.buscaTelefone("Clodowaldo"));
    }
}
