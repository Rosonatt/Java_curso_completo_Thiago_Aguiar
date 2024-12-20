package rosonatt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaBanco {
    private GerenciadorDeContas gerenciador;

    public SistemaBanco() {
        this.gerenciador = new GerenciadorDeContas();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                System.out.println("Encerrando o sistema. Obrigado!");
                break;
            }

            switch (opcao) {
                case 1:
                    criarConta(scanner);
                    break;
                case 2:
                    fazerLogin(scanner);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private void criarConta(Scanner scanner) {
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o email:");
        String email = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();

        Conta conta = new Conta(nome, cpf, email, telefone, agencia, saldoInicial);

        if (gerenciador.adicionarConta(conta)) {
            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Erro: Já existe uma conta com os mesmos dados.");
        }
    }

    private void fazerLogin(Scanner scanner) {
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        Conta conta = gerenciador.buscarContaPorCpf(cpf);

        if (conta == null) {
            System.out.println("Erro: Conta não encontrada!");
            return;
        }

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Gerar comprovante");
            System.out.println("5 - Logout");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) {
                System.out.println("Logout realizado com sucesso!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depósito:");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para saque:");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    gerarComprovante(conta);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void gerarComprovante(Conta conta) {
        try (FileWriter writer = new FileWriter("comprovante.txt")) {
            writer.write(conta.toString());
            System.out.println("Comprovante gerado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gerar o comprovante.");
        }
    }

    public static void main(String[] args) {
        SistemaBanco sistema = new SistemaBanco();
        sistema.iniciar();
    }
}
