import java.util.Scanner;

public class ComparandoStrings {

    public static  void main (String[] args){
        String password =  "123456"; //0010
        System.out.println("Digite a sua senha : ");

        Scanner  scanner  =  new Scanner(System.in);
        String pass = scanner.nextLine(); // 0100

        // == n compara o conteudo, ele compara a referencia do objeto
        System.out.println(password.equals(pass));

            //usando o  == ao inves do equals

        //String  x =  ("123456"); // 00010
        //String y = ("123456"); //00010
        //System.out.println(x == y);

    }
}
