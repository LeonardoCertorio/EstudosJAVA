import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase para que todas as letras 'a' sejam substituídas pela letra 'x': ");
        String frase = entrada.nextLine();

        frase = frase.toLowerCase();

        String AporX = frase.replaceAll("a", "x");

        System.out.println(AporX);

    }

}
