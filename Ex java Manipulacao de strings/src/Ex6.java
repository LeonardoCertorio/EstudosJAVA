import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase para que as palavras dela sejam convertidas para letras maiúsculas: ");
        var frase = entrada.nextLine().toUpperCase();

        System.out.println(frase);

    }

}
