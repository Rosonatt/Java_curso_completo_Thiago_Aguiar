package rosonatt;

public class Pessoa {
    private String nome;
    private int idade;
    private String profissao;

    // Construtor
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Getter e Setter (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rosonatt", 29, "Engenheiro");
        System.out.println(pessoa.toString()); // Chamado implicitamente pelo System.out.println
    }
}
