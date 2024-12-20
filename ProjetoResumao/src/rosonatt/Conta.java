package rosonatt;

import java.util.Scanner;

public class Conta {
    private double balance;
    private String nome;
    private String agencia;
    private Log logger;


    public Conta(String nome, String agencia, double saldoInicial) {
        this.nome = nome;
        this.agencia = agencia;
        this.balance = saldoInicial;
        this.logger = new Log();  
    }


    public boolean sacar(double valor) {
        if (balance < valor) {
            logger.imprimir("Erro: Não foi possível sacar " + valor + " reais. Seu saldo atual é de " + balance + " reais.");
            return false;
        }
        balance -= valor;
        logger.imprimir("Saque de " + valor + " reais realizado com sucesso. Sua conta agora é de " + balance + " reais.");
        return true;
    }


    public boolean depositar(double valor) {
        if (valor <= 0) {
            logger.imprimir("Erro: Depósito de valor inválido: " + valor + " reais.");
            return false;
        }
        balance += valor;
        logger.imprimir("Depósito de " + valor + " reais realizado com sucesso. Sua conta agora é de " + balance + " reais.");
        return true;
    }

    public void exibirSaldo() {
        logger.imprimir("Saldo atual: " + balance + " reais.");
    }

    @Override
    public String toString() {
        return "Conta de " + nome + " (" + agencia + ") - Saldo atual: " + balance + " reais.";
    }

    public double getBalance() {
        return balance;
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta("Seu Barriga", "001", 0);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            if (opcao == 4) {
                System.out.println("Encerrando o sistema. Obrigado por usar o banco!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println(conta);
        scanner.close();
    }
}

class Log {

    public void imprimir(String mensagem) {
        System.out.println("Log: " + mensagem);
    }
}
