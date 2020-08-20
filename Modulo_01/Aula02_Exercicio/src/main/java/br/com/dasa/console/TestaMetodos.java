package br.com.dasa.console;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaMetodos {

    public static void main(String[] args) {

        System.out.println("Escolha o método!");
        System.out.println("1 - Calcular soma de dois números.");
        System.out.println("2 - Inverter a ordem dos caracteres de uma frase.");
        System.out.println("3 - Verificar se o servidor está ativo.");
        System.out.println("4 - Verificar se o cnpj é válido.");
        System.out.println("");
        System.out.print("Digite o numero do método: ");

        Scanner entrada = new Scanner(System.in);
        int numMetodo = entrada.nextInt();

        switch (numMetodo) {
            case 1:
                new TestaMetodos().telaCalcularNumeros();
                break;
            case 2:
                new TestaMetodos().telaInverterOrdemCaracteresFrase();
                break;
            case 3:
                new TestaMetodos().telaVerificarServidorAtivo();
                break;
            case 4:
                new TestaMetodos().telaValidarCNPJ();
                break;
            default:
                System.out.println("Digite SOMENTE números entre 1 e 4");
        }
        
        System.out.println("Fim ####################");
    }

    public void telaCalcularNumeros() {

        System.out.println("##############################");
        System.out.println("Metodo que soma dois numeros!");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o numero 2: ");
        double num2 = entrada.nextDouble();
        
        System.out.println("Resultado: " + somarDoisNumeros(num1, num2));
    }

    public double somarDoisNumeros(double num1, double num2) {
        return num1 + num2;
    }

    public void telaInverterOrdemCaracteresFrase() {

        System.out.println("##############################");
        System.out.println("Metodo de inverter a ordem dos caracteres de uma frase.");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        String frase = entrada.nextLine();

        System.out.println("Frase: " + InverterOrdemCaracteresFrase(frase));
    }

    private static String InverterOrdemCaracteresFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }

    public void telaVerificarServidorAtivo() {

        System.out.println("##############################");
        System.out.println("Metodo que verifica se o servidor está ativo.");
        System.out.println("");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o host[localhost]: ");
        String host = entrada.nextLine();

        if (host.isEmpty()) {
            host = "localhost";
        }

        System.out.println((verificarServidorAtivo(host)) ? "Servidor Ativo" : "Servidor Inativo");
    }

    boolean verificarServidorAtivo(String host) {

        // Inspiração "https://respostas.guj.com.br/12792-verificar-se-um-servidor-esta-online"
        try {
            return InetAddress.getByName(host).isReachable(10000);
        } catch (UnknownHostException e) {
            System.out.println("Host desconhecido: " + host);
            return false;
        } catch (IOException e) {
            System.out.println("Não foi possível conectar ao host " + host);
            return false;
        } catch (Exception e) {
            System.out.println("Erro ao verificar o host " + host);
            return false;
        }
    }

    public void telaValidarCNPJ() {
        System.out.println("##############################");
        System.out.println("Metodo que valida se o CNPJ é valido.");
        System.out.println("");
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o CNPJ: ");
        String cnpj = entrada.nextLine();
        
        System.out.println((validarCNPJ(cnpj)) ? "CNPJ Valido" : "CNPJ Invalido");
    }

    public static boolean validarCNPJ(String cnpj) {
        // Inspiração "https://www.devmedia.com.br/validando-o-cnpj-em-uma-aplicacao-java/22374"
        // considera-se erro cnpj's formados por uma sequencia de numeros iguais
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
                || cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
                || cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
                || cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
                || cnpj.equals("88888888888888") || cnpj.equals("99999999999999")
                || (cnpj.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                // converte o i-ésimo caractere do cnpj em um número:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posição de '0' na tabela ASCII)
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

            // Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
}
