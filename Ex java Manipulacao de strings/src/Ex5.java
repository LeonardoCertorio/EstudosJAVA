import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite duas strings para que resulte na concatenação das duas: ");
        String s1 = entrada.nextLine();
        String s2 = entrada.nextLine();

        System.out.println(s1 + " " + s2);
    }
}
