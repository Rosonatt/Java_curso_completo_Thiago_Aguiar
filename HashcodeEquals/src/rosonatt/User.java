package rosonatt;

import java.util.Objects;

public class User {
    private String id;
    private String name;
    private String email;

    // Construtor
    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrita do método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se é o mesmo objeto
        if (obj == null || getClass() != obj.getClass()) return false; // Verifica classe

        User user = (User) obj;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    // Sobrescrita do método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email); // Gera o hash baseado nos atributos
    }

    // Sobrescrita do método toString (opcional, para facilitar debug)
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando dois objetos User
        User userA = new User("1", "Rosonatt", "rosonatt@example.com");
        User userB = new User("1", "Rosonatt", "rosonatt@example.com");

        // Comparando os objetos
        System.out.println("userA: " + userA); // Exibe userA
        System.out.println("userB: " + userB); // Exibe userB

        System.out.println("\nComparando userA e userB:");
        System.out.println("userA.equals(userB): " + userA.equals(userB)); // true, pois os valores são iguais
        System.out.println("userA.hashCode() == userB.hashCode(): " + (userA.hashCode() == userB.hashCode())); // true

        // Modificando userB para ser diferente de userA
        userB.setEmail("different@example.com");

        System.out.println("\nApós modificar userB:");
        System.out.println("userA.equals(userB): " + userA.equals(userB)); // false
        System.out.println("userA.hashCode() == userB.hashCode(): " + (userA.hashCode() == userB.hashCode())); // false
    }
}
