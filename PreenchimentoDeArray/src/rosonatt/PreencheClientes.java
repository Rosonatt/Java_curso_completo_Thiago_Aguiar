package rosonatt;

public class PreencheClientes {

    public static Cliente[] preencherClientes() {
        Cliente[] clientes = new Cliente[3]; // Criando um array de 3 clientes

        // Preenchendo o array com clientes específicos
        clientes[0] = new Cliente("Carlos", 30);
        clientes[1] = new Cliente("Ana", 25);
        clientes[2] = new Cliente("João", 40);

        return clientes;
    }

    public static void imprimirClientes(Cliente[] clientes) {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
