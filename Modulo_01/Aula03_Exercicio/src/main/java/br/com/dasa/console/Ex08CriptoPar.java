package br.com.dasa.console;

public class Ex08CriptoPar {

    public static void main(String[] args) {

        if (args.length == 1) {

            for (int i = 0; i < args[0].length(); i++) {

                if ((int) args[0].charAt(i) % 2 == 0) {
                    char caracterCriptografado   = (char) ((int) args[0].charAt(i) + 1);
                    System.out.print(caracterCriptografado);
                } else {
                    System.out.print(args[0].charAt(i));
                }

            }
            
        } else {
            System.out.println("ERRO: O programa espera uma palavra como argumento.");
        }
    }
}
