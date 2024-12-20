package rosonatt;

import java.util.Scanner;

public class ArrayBidimensional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array bidimensional para armazenar 2x3 números
        int[][] matrix = new int[2][3];

        // Solicitando ao usuário que insira valores na matriz
        System.out.println("Digite os valores para uma matriz 2x3:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Valor para posição [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Exibindo os valores armazenados na matriz
        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exemplo: Somando todos os elementos da matriz
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + totalSum);
    }
}

