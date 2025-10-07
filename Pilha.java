public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            System.out.println("Não é possivel inserir pois a pilha esta cheia " + valor);
        } else {
            topo++;
            elementos[topo] = valor;
            System.out.println("Inserido: " + valor);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Nada para remover.");
            return -1;
        } else {
            int valor = elementos[topo];
            topo--;
            return valor;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}
