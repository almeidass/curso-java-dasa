package br.com.dasa.console;

public class Ex10Naturais {

    public static void main(String[] args) {

        if (args.length == 1 || args.length == 2) {

            int ultimoNumeroLista = Integer.parseInt(args[0]);
            int intervaloSequencia = 1;

            intervaloSequencia = (args.length > 1) ? Integer.parseInt(args[1]) : intervaloSequencia;

            if (ultimoNumeroLista >= intervaloSequencia) {

                for (int i = 1; i <= ultimoNumeroLista; i += intervaloSequencia) {

                    if (i + intervaloSequencia <= ultimoNumeroLista) {
                        System.out.print(i + " - ");
                    } else {
                        System.out.print(i);
                    }

                }

            } else {
                System.out.println("ERRO: O intervalo é maior que o ultimo numero da lista.");
            }

        } else {
            System.out.println("ERRO: O Programa espera um ou dois argumentos.");
        }

    }

}
