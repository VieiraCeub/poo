package estruturas;

import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {
        // Criar uma pilha de strings
        Stack<String> pilha = new Stack<>();

        // Empilhar elementos na pilha
        pilha.push("Primeiro");
        pilha.push("Segundo");
        pilha.push("Terceiro");

        // Acessar e desempilhar elementos da pilha (LIFO)
        System.out.println("Elemento desempilhado: " + pilha.pop()); // Saída: "Terceiro"
        System.out.println("Elemento no topo da pilha: " + pilha.peek()); // Saída: "Segundo"
    }
}

