package rosonatt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando alguns objetos Produto
        Produto p1 = new Produto("Laptop", 2500.00);
        Produto p2 = new Produto("Smartphone", 1500.00);
        Produto p3 = new Produto("Tablet", 1000.00);

        // Criando alguns objetos Cliente
        Cliente c1 = new Cliente("Carlos", 30);
        Cliente c2 = new Cliente("Ana", 25);

        // Criando alguns objetos Pedido
        Pedido ped1 = new Pedido(1, p1, c1);
        Pedido ped2 = new Pedido(2, p2, c2);
        Pedido ped3 = new Pedido(3, p3, c1);

        // Arrays de Produtos
        Produto[] produtosArray1 = {p1, p2, p3};
        Produto[] produtosArray2 = {p1, p2, p3};
        Produto[] produtosArray3 = {p2, p3, p1};

        // Arrays de Pedidos
        Pedido[] pedidosArray1 = {ped1, ped2, ped3};
        Pedido[] pedidosArray2 = {ped1, ped2, ped3};
        Pedido[] pedidosArray3 = {ped2, ped3, ped1};

        // Comparando arrays de Produtos
        System.out.println("Comparação de arrays de Produtos:");
        System.out.println("Produtos Array1 == Produtos Array2: " + Arrays.equals(produtosArray1, produtosArray2)); // true
        System.out.println("Produtos Array1 == Produtos Array3: " + Arrays.equals(produtosArray1, produtosArray3)); // false

        // Comparando arrays de Pedidos
        System.out.println("\nComparação de arrays de Pedidos:");
        System.out.println("Pedidos Array1 == Pedidos Array2: " + Arrays.equals(pedidosArray1, pedidosArray2)); // true
        System.out.println("Pedidos Array1 == Pedidos Array3: " + Arrays.equals(pedidosArray1, pedidosArray3)); // false

        // Comparando objetos individuais (exemplo de comparação personalizada)
        System.out.println("\nComparando objetos de Produto diretamente:");
        System.out.println("Produto p1 == Produto p2: " + p1.equals(p2)); // false
        System.out.println("Produto p1 == Produto p1: " + p1.equals(p1)); // true
    }
}
