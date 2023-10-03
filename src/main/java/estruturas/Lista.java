package estruturas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = new ArrayList<>();

        // Adicionar elementos à lista
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessar elementos da lista
        System.out.println("Elemento na posição 0: " + numeros.get(0)); // Saída: 10
        System.out.println("Elemento na posição 1: " + numeros.get(1)); // Saída: 20

        // Iterar através dos elementos da lista
        System.out.println("Elementos da lista:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + numeros.size()); // Saída: 3

        // Remover um elemento da lista
        numeros.remove(1); // Remove o elemento na posição 1 (20)

        // Verificar se a lista contém um elemento
        boolean contemElemento = numeros.contains(20);
        System.out.println("A lista contém o número 20? " + contemElemento); // Saída: false
    }
}