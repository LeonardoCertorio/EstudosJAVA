import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase para que seja feita uma contagem das palavras inclusas na mesma: ");
        String frase = entrada.nextLine();

        char espaco = ' ';
        int ContagemPalavras = 0;

        for (int i = 0 ; i < frase.length() ; i++) {

            if (frase.charAt(i) == espaco) {
                ContagemPalavras++;

            }

        }

        int palavras = ContagemPalavras + 1;

        System.out.println("A frase possui " + palavras + " palavras!" );

    }

}
