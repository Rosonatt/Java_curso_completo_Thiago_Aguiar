package rosonatt;

public class Conta {
    private double balance;
    private String nome;
    private String agencia;
    private Log logger;

    // Construtor da Conta
    public Conta(String nome, String agencia, double saldoInicial) {
        this.nome = nome;
        this.agencia = agencia;
        this.balance = saldoInicial;
        this.logger = new Log();  // Inicializa o log
    }

    // Método para sacar valores
    public boolean sacar(double valor) {
        if (balance < valor) {
            logger.imprimir("Erro: Não foi possível sacar " + valor + " reais. Seu saldo atual é de " + balance + " reais.");
            return false;
        }
        balance -= valor;  // Subtrai o valor do saldo
        logger.imprimir("Saque de " + valor + " reais realizado com sucesso. Sua conta agora é de " + balance + " reais.");
        return true;
    }

    // Método para depositar valores
    public boolean depositar(double valor) {
        if (valor <= 0) {
            logger.imprimir("Erro: Depósito de valor inválido: " + valor + " reais.");
            return false;
        }
        balance += valor;  // Incrementa o saldo da conta
        logger.imprimir("Depósito de " + valor + " reais realizado com sucesso. Sua conta agora é de " + balance + " reais.");
        return true;
    }

    // Sobrescrita do método toString() para formatar a saída do extrato
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
        Conta conta = new Conta("Seu Barriga", "001", 0);  // Inicializa com saldo 0

        // Testando depósitos
        conta.depositar(100);  // Depósito de 100
        conta.depositar(50);   // Depósito de 50
        conta.depositar(100);  // Depósito de 100

        // Testando saques
        conta.sacar(200);  // Tenta sacar 200
        conta.sacar(150);  // Tenta sacar 150

        // Imprime o extrato da conta no final
        System.out.println(conta);
    }
}

// Classe Log para imprimir mensagens de log
class Log {

    // Método para imprimir mensagens no console
    public void imprimir(String mensagem) {
        System.out.println("Log: " + mensagem);
    }
}
