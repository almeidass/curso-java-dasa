package br.com.dasa.console;

public class Ex04ListaNome {
    
    public static void main(String[] args) {
        
        if (args.length == 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " - " + args[0]);
            }
        } else {
            System.out.println("Erro: O programa espera um argumento.");
        }
        
    }
    
}
