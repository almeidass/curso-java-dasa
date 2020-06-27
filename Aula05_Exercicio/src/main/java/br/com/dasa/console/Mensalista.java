package br.com.dasa.console;

public class Mensalista extends Funcionario {

    public Mensalista(int matricula, String nome, String cargo, double salarioBase) {
        super(matricula, nome, cargo, salarioBase);
    }

    @Override
    protected void calcularSalario() {
        imprimirCabecalho();
        double salarioBruto = calcularSalarioBruto();
        double aliquotaIR = calcularAliquotaImpostoRenda(this.salarioBase);
        double imposto = calcularDescontoSalario(this.salarioBase);
        double salarioLiquido = calcularSalarioLiquido(this.salarioBase);
        System.out.println("Sálario Bruto......" + fmt.format(salarioBruto));
        System.out.println("Alíquota do IR....." + aliquotaIR + "%");
        System.out.println("Imposto............" + fmt.format(imposto));
        System.out.println("Salário Líquido...." + fmt.format(salarioLiquido));
    }

    @Override
    protected double calcularSalarioBruto() {
        return this.salarioBase;
    }
}
