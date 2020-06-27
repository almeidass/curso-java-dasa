package br.com.dasa.console;

public class Funcionario {

    protected int matricula;
    protected String nome;
    protected String cargo;
    protected double salarioBruto;

    public Funcionario(int matricula, String nome, String cargo, double salarioBruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public void calcularSalario() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario Bruto: " + this.salarioBruto);
        System.out.println("Imposto: " + this.calcularTaxaImpostoRenda(this.salarioBruto));
        System.out.println("Salario Liquido: " + this.calcularSalarioLiquido(this.salarioBruto));
    }

    public double calcularTaxaImpostoRenda(double salarioBruto) {
        if (salarioBruto <= 1000) {
            return 0;
        } else if (salarioBruto > 1000 && salarioBruto <= 3000) {
            return 15;
        } else {
            return 20;
        }
    }

    public double calcularSalarioLiquido(double salarioBruto) {
        return salarioBruto - (salarioBruto / 100 * calcularTaxaImpostoRenda(salarioBruto));
    }
}
