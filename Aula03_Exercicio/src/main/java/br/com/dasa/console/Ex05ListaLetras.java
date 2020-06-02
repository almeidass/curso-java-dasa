package br.com.dasa.console;

public class Ex05ListaLetras {
    
    public static void main(String[] args) {
        
        if (args.length == 1) {
            
            for (int i = 0; i < args[0].length(); i++) {
                System.out.println(args[0].charAt(i));
            }
          
        } else {
            System.out.println("ERRO: O programa espera uma palavra como argumento.");
        }   
    }   
}
