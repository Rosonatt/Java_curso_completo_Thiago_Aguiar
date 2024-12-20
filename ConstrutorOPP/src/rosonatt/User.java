package rosonatt;

public class User {

    private String name;
    private String email;

    // Construtor para inicializar nome e email
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters e Setters
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

    // Sobrescrevendo o método toString para exibir informações do usuário
    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "'}";
    }
}

