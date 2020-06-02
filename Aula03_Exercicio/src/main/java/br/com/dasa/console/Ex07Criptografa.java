package br.com.dasa.console;

public class Ex07Criptografa {
    
    public static void main(String[] args) {
        
        if (args.length == 1) {
            
            for (int i = 0; i < args[0].length(); i++) {
                
                char c = (char) (args[0].charAt(i) + 7);
                
                System.out.print(c);
                
            }
            
            System.out.println("");
            
        } else {
            System.out.println("ERRO: O programa espera uma palavra como argumento.");
        }
        
    }
    
}
