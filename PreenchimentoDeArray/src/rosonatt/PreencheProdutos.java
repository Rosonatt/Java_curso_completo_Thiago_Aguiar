package rosonatt;

public class PreencheProdutos {

    public static Produto[] preencherProdutos() {
        Produto[] produtos = new Produto[5]; // Criando um array de 5 produtos

        // Preenchendo o array com produtos específicos
        produtos[0] = new Produto("Laptop", 2500.00);
        produtos[1] = new Produto("Smartphone", 1500.00);
        produtos[2] = new Produto("Tablet", 1000.00);
        produtos[3] = new Produto("Fone de Ouvido", 300.00);
        produtos[4] = new Produto("Câmera Digital", 1200.00);

        return produtos;
    }

    public static void imprimirProdutos(Produto[] produtos) {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
