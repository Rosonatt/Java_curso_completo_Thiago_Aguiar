package rosonatt;

public class Pedido {
    private int id;
    private Produto produto;
    private Cliente cliente;

    public Pedido(int id, Produto produto, Cliente cliente) {
        this.id = id;
        this.produto = produto;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", produto=" + produto +
                ", cliente=" + cliente +
                '}';
    }
}
