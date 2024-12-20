package rosonatt;

public class Main {
    public static void main(String[] args) {
        // Preenchendo os arrays
        Produto[] produtos = PreencheProdutos.preencherProdutos();
        Cliente[] clientes = PreencheClientes.preencherClientes();
        Pedido[] pedidos = PreenchePedidos.preencherPedidos(produtos, clientes);

        // Imprimindo os arrays preenchidos
        System.out.println("Produtos:");
        PreencheProdutos.imprimirProdutos(produtos);

        System.out.println("\nClientes:");
        PreencheClientes.imprimirClientes(clientes);

        System.out.println("\nPedidos:");
        PreenchePedidos.imprimirPedidos(pedidos);
    }
}
