package rosonatt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Exemplo de array de números a serem ordenados
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Exibindo o array antes da ordenação
        System.out.println("Array antes da ordenação: " + Arrays.toString(numbers));

        // Aplicando o algoritmo Bubble Sort
        bubbleSort(numbers);

        // Exibindo o array após a ordenação
        System.out.println("Array após a ordenação: " + Arrays.toString(numbers));
    }

    // Função de ordenação Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Passa por todo o array
        for (int i = 0; i < n - 1; i++) {
            // Últimos elementos já estão ordenados
            for (int j = 0; j < n - i - 1; j++) {
                // Troca os elementos caso estejam na ordem errada
                if (array[j] > array[j + 1]) {
                    // Troca de posição
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
