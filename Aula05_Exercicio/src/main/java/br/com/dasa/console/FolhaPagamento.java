package br.com.dasa.console;

public class FolhaPagamento {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(15, 2000, 12345, "Leonardo Almeida", "Vendedor", 1000);

        vendedor.calcularSalario();

    }

}
