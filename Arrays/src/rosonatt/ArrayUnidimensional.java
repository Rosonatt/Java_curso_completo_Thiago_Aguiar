package rosonatt;

import java.util.Scanner;

public class ArrayUnidimensional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array para armazenar 5 números
        int[] numbers = new int[5];

        // Solicitando ao usuário que insira valores no array
        System.out.println("Digite 5 números:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Exibindo os valores armazenados no array
        System.out.println("\nNúmeros inseridos:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Exemplo: Calculando a soma dos números no array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nA soma dos números é: " + sum);
    }
}

