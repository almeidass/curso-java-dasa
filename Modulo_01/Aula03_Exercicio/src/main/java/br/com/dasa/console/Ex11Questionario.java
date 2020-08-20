package br.com.dasa.console;

import javax.swing.JOptionPane;

public class Ex11Questionario {

    public static void main(String[] args) {

        String[] planetas = {
            "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno",
            "Urano", "Neturno"};

        String resposta = "";
        while (resposta != null) {

            resposta = (String) JOptionPane.showInputDialog(null,
                    "Qual é o nome do \"Planeta Vermelho\"?", "",
                    JOptionPane.QUESTION_MESSAGE, null, planetas, "Terra");
            if (resposta != null && resposta.equals("Marte")) {
                
                JOptionPane.showMessageDialog(null, "Parabéns, sua resposta está correta!");
            } else if (resposta != null) {
                
                JOptionPane.showMessageDialog(null, "Errado! Tente Novamente...");
            } else {
                
                JOptionPane.showMessageDialog(null, "Cancelado! Saindo do programa...");
            }

        }

    }

}
