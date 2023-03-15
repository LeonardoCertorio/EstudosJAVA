import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma string para verificar se ela é um palíndromo: ");
        String palavra = entrada.nextLine();

        String inverso = "";

        for( int i = palavra.length() - 1 ; i >= 0 ; i-- ) {

            inverso = inverso + palavra.charAt(i);

        }

        System.out.println("\nPalavra ao inverso: " + inverso + "\n");

        palavra = palavra.toLowerCase();
        inverso = inverso.toLowerCase();

        palavra = palavra.replaceAll("\\s+", "");
        inverso = inverso.replaceAll("\\s+", "");

        if( inverso.equals(palavra) ) {

            System.out.println("A string é um palíndromo!");

        } else {

            System.out.println("A string não é um palíndromo!");

        }

    }

}