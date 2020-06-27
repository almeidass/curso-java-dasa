package br.com.dasa.console;

public class Vendedor extends Mensalista {

    private double comissao;
    private double valorTotalVendas;

    public Vendedor(int matricula, String nome, double salarioBase, double comissao, double valorTotalVendas) {
        super(matricula, nome, "Vendedor", salarioBase);
        this.comissao = comissao;
        this.valorTotalVendas = valorTotalVendas;
    }

    @Override
    public void calcularSalario() {
        imprimirCabecalho();
        double comissao = this.calcularComissao();
        double salarioBruto = this.calcularSalarioBruto();
        double aliquotaIR = this.calcularAliquotaImpostoRenda(salarioBruto);
        double imposto = this.calcularDescontoSalario(salarioBruto);
        double salarioLiquido = calcularSalarioLiquido(salarioBruto);
        System.out.println("Total das Vendas..." + fmt.format(this.valorTotalVendas));
        System.out.println("Comissao %........." + this.comissao + "%");
        System.out.println("Valor da Comissao.." + fmt.format(comissao));
        System.out.println("Sálario Bruto......" + fmt.format(salarioBruto));
        System.out.println("Alíquota do IR....." + aliquotaIR + "%");
        System.out.println("Imposto............" + fmt.format(imposto));
        System.out.println("Salário Líquido...." + fmt.format(salarioLiquido));
    }
    
    public double calcularComissao() {
        return this.valorTotalVendas * (this.comissao / 100);
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase + this.calcularComissao();
    }
}
