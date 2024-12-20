package rosonatt;

public class Construtor {

    public static void main(String[] args) {
        // Criando objetos User utilizando o construtor
        User user1 = new User("Rosonatt", "h2oroso@gmail.com");
        User user2 = new User("Exemplo", "123@exemplo.com");

        // Exibindo informações dos usuários criados
        System.out.println("Usuários criados:");
        System.out.println(user1);
        System.out.println(user2);

        // Alterando informações de um usuário
        user2.setName("Roberto");
        user2.setEmail("roberto@examplo.com");

        // Exibindo informações após as alterações
        System.out.println("\nUsuário após alteração:");
        System.out.println(user2);
    }
}

