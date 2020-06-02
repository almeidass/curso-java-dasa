package br.com.dasa.console;

public class Ex03ListaArgs {

    public static void main(String[] args) {

        if (args.length > 0) {

            for (int i = 0; i < args.length; i++) {
                System.out.println(i + " - " + args[i]);
            }

        } else {
            System.out.println("Erro: O programa espera pelo menos um argumento.");
        }
    }
}
