package rosonatt;

public class Calculadora {

    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado: soma três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecarregado: soma dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    // Método sobrecarregado: concatena duas Strings
    public String somar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Usando diferentes versões do método 'somar'
        int somaInteiros = calc.somar(10, 20);
        int somaTresInteiros = calc.somar(5, 15, 10);
        double somaDoubles = calc.somar(10.5, 20.3);
        String somaStrings = calc.somar("Olá, ", "mundo!");

        // Exibindo os resultados
        System.out.println("Soma de dois inteiros: " + somaInteiros);
        System.out.println("Soma de três inteiros: " + somaTresInteiros);
        System.out.println("Soma de dois números de ponto flutuante: " + somaDoubles);
        System.out.println("Concatenação de Strings: " + somaStrings);
    }
}

