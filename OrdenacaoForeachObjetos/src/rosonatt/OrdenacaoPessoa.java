package rosonatt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoPessoa {
    public static void main(String[] args) {
        // Criando uma lista de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 22));
        pessoas.add(new Pessoa("Ana", 28));

        // Ordenando a lista de pessoas com base na idade
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return Integer.compare(p1.getIdade(), p2.getIdade()); // Ordenação crescente pela idade
            }
        });

        // Exibindo a lista ordenada usando forEach e uma expressão lambda
        System.out.println("Lista de pessoas ordenada por idade:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        // Outra maneira de ordenar (utilizando Lambda diretamente)
        pessoas.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

        // Exibindo novamente após a ordenação
        System.out.println("\nLista de pessoas ordenada por idade (usando sort com lambda):");
        pessoas.forEach(System.out::println);
    }
}

