import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase para que os espaços sejam removidos: ");
        String frase = entrada.nextLine();

        String resultado = frase.replaceAll("\\s+","");

        System.out.println(resultado);

    }

}
