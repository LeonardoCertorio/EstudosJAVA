import java.util.Scanner;
import java.util.Set;

public class Ex8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma string para que sejam excluídas as vogais: ");
        String frase = entrada.nextLine().toLowerCase();

        String SemA = frase.replace("a", "");
        String SemE = SemA.replace("e", "");
        String SemI = SemE.replace("i", "");
        String SemO = SemI.replace("o", "");
        String SemU = SemO.replace("u", "");

        System.out.println(SemU);

    }

}
