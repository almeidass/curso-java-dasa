package br.com.dasa.console;

import java.text.NumberFormat;

public abstract class Funcionario {

    protected int matricula;
    protected String nome;
    protected String cargo;
    protected double salarioBase;
    
    protected NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public Funcionario(int matricula, String nome, String cargo, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    protected abstract void calcularSalario();
    protected abstract double calcularSalarioBruto();
    
    protected void imprimirCabecalho() {
        System.out.println("---------------------------------------");
        System.out.println("Diagnosticos da America - Contracheques");
        System.out.println("---------------------------------------");
        System.out.println("Matrícula.........." + this.matricula);
        System.out.println("Nome..............." + this.nome);
        System.out.println("Cargo.............." + this.cargo);
        System.out.println("Salário Base......." + fmt.format(this.salarioBase));
    }
    
    public double calcularAliquotaImpostoRenda(double salarioBruto) {
        if (salarioBruto <= 1000) {
            return 0;
        } else if (salarioBruto > 1000 && salarioBruto <= 3000) {
            return 15;
        } else {
            return 20;
        }
    }
    
    public double calcularDescontoSalario(double salarioBruto) {
        return salarioBruto / 100 * calcularAliquotaImpostoRenda(salarioBruto);
    }

    public double calcularSalarioLiquido(double salarioBruto) {
        return salarioBruto - calcularDescontoSalario(salarioBruto);
    }
   
}
