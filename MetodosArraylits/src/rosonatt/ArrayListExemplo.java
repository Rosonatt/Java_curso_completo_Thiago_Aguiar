package rosonatt;

import java.util.ArrayList;

public class ArrayListExemplo {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Exibindo a lista
        System.out.println("Lista Inicial: " + lista);

        // Acessando elementos
        String fruta = lista.get(1); // "Banana"
        System.out.println("Fruta na posição 1: " + fruta);

        // Removendo um elemento
        lista.remove("Banana");
        System.out.println("Lista após remoção: " + lista);

        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Verificando se a lista contém um elemento
        boolean temLaranja = lista.contains("Laranja");
        System.out.println("A lista contém Laranja? " + temLaranja);
    }
}

