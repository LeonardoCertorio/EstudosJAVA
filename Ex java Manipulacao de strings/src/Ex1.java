import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra para que ela seja reescrita de forma inversa: ");
        String palavra = entrada.nextLine();

        String inverso = "";

        for( int i = palavra.length() - 1 ; i >= 0 ; i-- ) {

            inverso = inverso + palavra.charAt(i);

        }

        System.out.println(inverso);

    }

}