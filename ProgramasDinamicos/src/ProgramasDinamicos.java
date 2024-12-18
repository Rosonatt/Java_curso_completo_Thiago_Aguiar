import java.util.Random;

public class ProgramasDinamicos {
    public static  void main (String[] args){
      calc (10, 5); // argumentos


    }

    static void calc(int x, int y){

        //static void > declaração padrão(falaremos depoi sobre isso, mas precisa!)
        // sum  >nome da função(poderia ser qualquer coisa, geralmente se usa verbos)
        //( )> parenteses usamos para definir o que chegara naquela função (parametros)
        //(tipo da variavel  + nome da variavel)
        // {} > bloco de codigo que sera executado


        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x / y);
        System.out.println(x * y);

    }
}
