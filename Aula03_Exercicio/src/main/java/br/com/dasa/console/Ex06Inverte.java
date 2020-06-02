package br.com.dasa.console;

public class Ex06Inverte {

    public static void main(String[] args) {
        
        if (args.length == 1) {
            
            for (int i = args[0].length() - 1; i >= 0; i--) {
                System.out.print(args[0].charAt(i));
            }
                        
        } else {
            System.out.println("ERRO: O programa espera uma palavra como argumento.");
        }
        
    }
    
}
