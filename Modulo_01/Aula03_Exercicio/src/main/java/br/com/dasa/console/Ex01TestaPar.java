package br.com.dasa.console;

public class Ex01TestaPar {

    public static void main(String[] args) {

        if (args.length == 1) {
            int num = 0;
            boolean eUmNumero = false;

            try {
                num = Integer.parseInt(args[0]);
                eUmNumero = true;
            } catch (NumberFormatException e) {
            }

            if (eUmNumero) {
                if (num == 0) {
                    System.out.println("O número " + num + " é neutro.");
                } else if (num % 2 == 0) {
                    System.out.println("O número " + num + " é par.");
                } else {
                    System.out.println("O número " + num + " é impar.");
                }
            } else {
                System.out.println("Erro: O programa espera um número como argumento.");
            }

        } else {
            System.out.println("Erro: O programa espera um número como argumento.");
        }
    }
}
