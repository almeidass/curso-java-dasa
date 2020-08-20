package br.com.dasa.console;

public class Horista extends Funcionario{
    
    private double valorHora;
    private double totalHoras;
    
    public Horista(int matricula, String nome, String cargo, double salarioBase, double valorHora, double totalHoras) {
        super(matricula, nome, cargo, salarioBase);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }
    
    @Override
    protected void calcularSalario() {
        imprimirCabecalho();
        double salarioBruto = this.calcularSalarioBruto();
        double aliquotaIR = this.calcularAliquotaImpostoRenda(salarioBruto);
        double imposto = this.calcularDescontoSalario(salarioBruto);
        double salarioLiquido = calcularSalarioLiquido(salarioBruto);
        System.out.println("Valor Hora........." + fmt.format(this.valorHora));
        System.out.println("Total de Horas....." + this.totalHoras);
        System.out.println("Saláro Bruto......." + fmt.format(salarioBruto));
        System.out.println("Alíquota do IR....." + aliquotaIR + "%");
        System.out.println("Imposto............" + fmt.format(imposto));
        System.out.println("Salário Líquido...." + fmt.format(salarioLiquido));
    }
    
    @Override
    public double calcularSalarioBruto() {
        return this.salarioBase + this.totalHoras * this.valorHora;
    }
    
}
