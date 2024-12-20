package rosonatt;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeContas {
    private Set<Conta> contas;

    public GerenciadorDeContas() {
        this.contas = new HashSet<>();
    }

    public boolean adicionarConta(Conta conta) {
        for (Conta c : contas) {
            if (c.getCpf().equals(conta.getCpf()) || c.getEmail().equals(conta.getEmail()) ||
                    c.getTelefone().equals(conta.getTelefone())) {
                return false;
            }
        }
        contas.add(conta);
        return true;
    }

    public Conta buscarContaPorCpf(String cpf) {
        for (Conta c : contas) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }
}

