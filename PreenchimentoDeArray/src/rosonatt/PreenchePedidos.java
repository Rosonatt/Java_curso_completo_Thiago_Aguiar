package rosonatt;

public class PreenchePedidos {

    public static Pedido[] preencherPedidos(Produto[] produtos, Cliente[] clientes) {
        Pedido[] pedidos = new Pedido[3]; // Criando um array de 3 pedidos

        // Preenchendo o array com pedidos, associando produtos e clientes
        pedidos[0] = new Pedido(1, produtos[0], clientes[0]); // Pedido 1
        pedidos[1] = new Pedido(2, produtos[1], clientes[1]); // Pedido 2
        pedidos[2] = new Pedido(3, produtos[2], clientes[2]); // Pedido 3

        return pedidos;
    }

    public static void imprimirPedidos(Pedido[] pedidos) {
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}
