package estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
        // Criar uma fila de números inteiros
        Queue<Integer> fila = new LinkedList<>();

        // Adicionar elementos à fila
        fila.offer(10);
        fila.offer(20);
        fila.offer(30);

        // Acessar e remover elementos da fila (FIFO)
        System.out.println("Elemento removido da fila: " + fila.poll()); // Saída: 10
        System.out.println("Elemento removido da fila: " + fila.poll()); // Saída: 20

        // Acessar o elemento da fila sem removê-lo
        System.out.println("Próximo elemento na fila: " + fila.peek()); // Saída: 30

        // Verificar se a fila está vazia
        boolean vazia = fila.isEmpty();
        System.out.println("A fila está vazia? " + vazia); // Saída: false
    }
}
