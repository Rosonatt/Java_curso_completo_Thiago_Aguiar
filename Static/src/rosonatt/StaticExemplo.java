package rosonatt;

// Classe de exemplo para demonstrar o uso de "static"
public class StaticExemplo {

    // Atributo estático (compartilhado entre todas as instâncias)
    private static int instanceCount = 0;

    // Atributo de instância (específico para cada objeto)
    private String name;

    // Construtor
    public StaticExemplo(String name) {
        this.name = name;
        instanceCount++; // Incrementa a contagem sempre que um novo objeto é criado
    }

    // Método estático
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Método de instância
    public void display() {
        System.out.println("Instance Name: " + name);
    }

    // Método principal para testar o código
    public static void main(String[] args) {
        // Criando objetos da classe StaticExample
        StaticExemplo obj1 = new StaticExemplo("Object 1");
        StaticExemplo obj2 = new StaticExemplo("Object 2");

        // Chamando métodos de instância
        obj1.display();
        obj2.display();

        // Chamando método estático
        System.out.println("Total Instances Created: " + StaticExemplo.getInstanceCount());
    }
}
