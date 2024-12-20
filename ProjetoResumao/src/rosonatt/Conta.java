package rosonatt;

public class Conta {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String agencia;
    private double saldo;
    private Log logger;

    public Conta(String nome, String cpf, String email, String telefone, String agencia, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.agencia = agencia;
        this.saldo = saldoInicial;
        this.logger = new Log();
    }

    public boolean sacar(double valor) {
        if (saldo < valor) {
            logger.imprimir("Erro: Não foi possível sacar " + valor + " reais. Saldo atual: " + saldo + " reais.");
            return false;
        }
        saldo -= valor;
        logger.imprimir("Saque de " + valor + " reais realizado com sucesso. Saldo atual: " + saldo + " reais.");
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            logger.imprimir("Erro: Depósito de valor inválido: " + valor + " reais.");
            return false;
        }
        saldo += valor;
        logger.imprimir("Depósito de " + valor + " reais realizado com sucesso. Saldo atual: " + saldo + " reais.");
        return true;
    }

    public void exibirSaldo() {
        logger.imprimir("Saldo atual: " + saldo + " reais.");
    }

    @Override
    public String toString() {
        return "Conta de " + nome + " (" + agencia + ")\nCPF: " + cpf + "\nEmail: " + email +
                "\nTelefone: " + telefone + "\nSaldo atual: " + saldo + " reais.";
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}

