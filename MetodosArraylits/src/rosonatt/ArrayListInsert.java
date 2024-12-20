package rosonatt;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInsert {
    public static void main(String[] args) {
        // Criando um ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Lista Original: " + numeros);

        // Adicionando um elemento na posição 1
        numeros.add(1, 15); // Adiciona 15 na posição 1
        System.out.println("Lista após inserção na posição 1: " + numeros);

        // Adicionando todos os elementos de uma outra lista
        ArrayList<Integer> maisNumeros = new ArrayList<>(Arrays.asList(40, 50, 60));
        numeros.addAll(maisNumeros);
        System.out.println("Lista após adicionar mais elementos: " + numeros);
    }
}
