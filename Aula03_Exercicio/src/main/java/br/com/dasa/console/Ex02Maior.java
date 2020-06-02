package br.com.dasa.console;

public class Ex02Maior {

    public static void main(String[] args) {

        if (args.length == 2) {

            int num1 = 0;
            int num2 = 0;
            boolean eUmNumero = false;

            try {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[1]);
                eUmNumero = true;
            } catch (NumberFormatException e) {
            }
            
            if (eUmNumero) {
                if (num1 == num2) {
                    System.out.println("Os dois números são iguais, NUM1: " + num1 + ", NUM2: " + num2);
                } else if (num1 > num2) {
                    System.out.println("O NUM1: " + num1 + " é maior que o NUM2: " + num2);
                } else {
                    System.out.println("O NUM2: " + num2 + " é maior que o NUM1: " + num1);
                }
            } else {
                System.out.println("Erro: O programa espera números como argumento.");
            }
            
        } else {
            System.out.println("Erro: O programa espera dois números como argumentos.");
        }
    }
}
