package br.com.dasa.console;

public class Vendedor extends Funcionario {

    private double comissao;
    private int valorTotalVendas;

    public Vendedor(double comissao, int valorTotalVendas, int matricula, String nome, String cargo, double salarioBruto) {
        super(matricula, nome, cargo, salarioBruto);
        this.comissao = comissao;
        this.valorTotalVendas = valorTotalVendas;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("+ Salario S/ Comissao: " + this.salarioBruto);
        System.out.println("= Valor total das vendas: " + this.valorTotalVendas);
        System.out.println("% Percentual da comissao: " + this.comissao);
        System.out.println("+ Valor da Comissao: " + this.calcularComissao());
        System.out.println("= Salario C/ Comissao: " + this.calcularSalarioComissao());
        System.out.println("- Percentual do IR: " + this.calcularTaxaImpostoRenda(this.calcularSalarioComissao()));
        System.out.println("= Salario Liquido: " + this.calcularSalarioLiquido(this.calcularSalarioComissao()));
    }

    public double calcularComissao() {
        return this.valorTotalVendas * (this.comissao / 100);
    }
    
    public double calcularSalarioComissao() {
        return this.salarioBruto + this.calcularComissao();
    }
}
