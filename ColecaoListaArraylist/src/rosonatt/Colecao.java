package rosonatt;

import java.util.ArrayList;
import java.util.List;

public class Colecao { // O nome do arquivo deve ser Colecao.java para corresponder à classe pública

    public static void main(String[] args) {
        // Lista de usuários
        List<User> userList = new ArrayList<>();
        userList.add(new User("Rosonatt", "h2oroso@gmail.com"));
        userList.add(new User("Roberto", "Beto@examplo.com"));
        userList.add(new User("Carlos", "charlos@examplo.com"));

        // Exibindo usuários
        System.out.println("Lista de Usuários:");
        for (User user : userList) {
            System.out.println(user);
        }

        // Lista de logins
        List<Login> loginList = new ArrayList<>();
        loginList.add(new Login("Rosonatt123", "password123"));
        loginList.add(new Login("Beto1236", "securepass"));
        loginList.add(new Login("carloslie0987", "mypassword"));

        // Exibindo logins
        System.out.println("\nLista de Logins:");
        for (Login login : loginList) {
            System.out.println(login);
        }

        // Associando usuários aos logins
        System.out.println("\nUsuários e seus logins:");
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            Login login = loginList.get(i);
            System.out.println(user.getName() + " usa o login: " + login.getUsername());
        }
    }
}
