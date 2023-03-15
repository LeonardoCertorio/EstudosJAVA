import java.util.Scanner;

public class Ex3 {

    public static void main(String[] agrs) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase para que cada letra seja convertida para maiúsculas: ");
        var frase = entrada.nextLine().toUpperCase();

        System.out.println(frase);

    }
}
