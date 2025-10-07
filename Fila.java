public class Fila {
    private int[] elementos;
    private int frente;
    private int tras;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        frente = 0;
        tras = -1;
    }

    public void enqueue(int valor) {
        if (tras == capacidade - 1) {
            System.out.println("Fila cheia! Não é possível inserir " + valor);
        } else {
            tras++;
            elementos[tras] = valor;
            System.out.println("Inserido: " + valor);
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Nada para remover.");
            return -1;
        } else {
            int valor = elementos[frente];
            frente++;
            return valor;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia!");
            return -1;
        } else {
            return elementos[frente];
        }
    }

    public boolean isEmpty() {
        return frente > tras;
    }
}
