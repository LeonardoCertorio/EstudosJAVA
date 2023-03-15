import java.util.Scanner;
import java.util.Set;

public class Ex2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite uma frase para que seja contada as vogais: ");

        var frase = entrada.nextLine().toLowerCase();
        var qntvogais = 0;
        var vogais = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0 ; i < frase.length() ; i++) {

            var c = frase.charAt(i);

            if (vogais.contains(c)) {
                qntvogais++;

            }

        }

        System.out.println("A frase possuí " + qntvogais + " vogais!");

    }

}
