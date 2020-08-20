package br.com.dasa.console;

public class FolhaPagamento {

    public static void main(String[] args) {

        Funcionario [] funcionarios = new Funcionario [3];
        funcionarios[0] = new Mensalista(98765, "Louise Sueli Renata Araújo", "Gerente de TI", 20_435.89);
        funcionarios[1] = new Vendedor(34567, "Elisa Camila da Costa", 3_000, 2, 250_234);
        funcionarios[2] = new Horista(245799, "Iago Lucas Pereira", "Consultor TI", 1_000, 50, 168);
        
        rodaFolha(funcionarios);
    }  

    private static void rodaFolha(Funcionario[] funcionarios) {
        
        for (Funcionario funcionario : funcionarios) {
            
            funcionario.calcularSalario();
            
        }
        
    }

}
