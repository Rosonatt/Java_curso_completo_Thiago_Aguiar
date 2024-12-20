package rosonatt;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Criação do Scanner para obter o número de termos de Fibonacci do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Instanciando a classe FibonacciCalculator para calcular a sequência
        FibonacciCalculator calculator = new FibonacciCalculator();

        // Exibindo os termos da sequência de Fibonacci
        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        calculator.calculateFibonacci(n);

        // Fechando o scanner
        scanner.close();
    }
}

class FibonacciCalculator {

    // Método para calcular a sequência de Fibonacci
    public void calculateFibonacci(int n) {
        // Inicializando as variáveis
        int a = 0, b = 1, c;

        // Caso o usuário queira ver os primeiros 0 ou 1 termos
        if (n <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0");
            System.out.println("1");
        } else {
            // Exibindo os primeiros dois termos
            System.out.println(a);
            System.out.println(b);

            // Usando um loop while para calcular os próximos termos
            int count = 2; // Começamos com os dois primeiros termos exibidos
            while (count < n) {
                c = a + b; // O próximo termo é a soma dos dois anteriores
                System.out.println(c);

                // Atualizando os valores de a e b para os dois últimos termos
                a = b;
                b = c;

                count++; // Incrementa o contador
            }
        }
    }
}
