public class Principal {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro elemento da fila: " + fila.peek());

        System.out.println("\nRemovendo elementos:");
        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }
    }
}