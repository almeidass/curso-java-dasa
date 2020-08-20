package br.com.dasa.console;

public class Ex09ExibeArgumento {

    public static void main(String[] args) {

        switch (args.length) {

            case 1:
                System.out.println(args[0]);
                break;
            case 2:
                int vezes = Integer.parseInt(args[1]);

                for (int i = 0; i < vezes; i++) {
                    System.out.println(args[0]);
                }
                break;
            default:
                System.out.println("ERRO: O programa espera um ou dois argumentos.");
        }

    }

}
