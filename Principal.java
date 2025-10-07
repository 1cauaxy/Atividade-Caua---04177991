public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("\nRemovendo elementos:");
        while (!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
        }
    }
}
