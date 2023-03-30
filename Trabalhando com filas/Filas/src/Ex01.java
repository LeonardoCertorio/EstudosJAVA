public class Ex01 {

    /*Uso da fila*/
    /*Tentar usar ArrayList*/
    public static void main(String[] args) {

        fila fila = new fila(8);
        fila.enfilerar(1);
        fila.enfilerar(2);
        fila.enfilerar(3);
        fila.enfilerar(4);
        fila.enfilerar(5);
        fila.enfilerar(6);
        fila.enfilerar(7);
        fila.enfilerar(8);

        while (fila.tamanho() > 0) {
            System.out.println(fila.desenfilerar());
        }


        /*LinkedList<String> fila = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma sequência de até 5 dados: ");
        String sequencia = entrada.nextLine();

        System.out.println("Qual é sua ação desejada?\n" +
                "A- Adicionar elemento ao final da fila\n" +
                "B- Remover o elemento do início da fila\n" +
                "C- Verificar se a fila está vazia\n" +
                "D- Retornar o número de elementos da fila\n");
        String opcao = entrada.nextLine();



        int op = Integer.parseInt(opcao);

        if (op==1) {
            System.out.println("Digite o que será adicionado: ");
            String add = entrada.nextLine();
            fila.add(sequencia);
        } else if (op==2) {
                        ;
        } else {
            ;
        }

        System.out.println(fila);
    }

    private static String manipular(String seq) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é sua acção desejada?\n" +
                "A- Adicionar elemento ao final da fila\n" +
                "B- Remover o elemento do início da fila\n" +
                "C- Verificar se a fila está vazia\n" +
                "D- Retornar o número de elementos da fila\n");
        String opcao = entrada.nextLine();

        opcao.toLowerCase();

        if (opcao=='a') {
            enqueue();
        }*/
    }
}