package br.com.dasa.console;

import javax.swing.JOptionPane;

public class Ex12Pesquisa {

    public static void main(String[] args) {

        String[] perguntas = {"Você concorda com solução utilizada?",
            "Você concorda com a postura do profissional durante o atendimento?",
            "Você concorda com o duração do atendimento?"};

        String[] opcoes = {"Concordo", "Concordo Parcialmente", "Discordo"};

        double somaNotas = 0;

        for (String pergunta : perguntas) {
            int n = JOptionPane.showOptionDialog(null,
                    pergunta, "",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcoes,
                    opcoes[0]);

            switch (n) {
                case 0:
                    somaNotas += 10;
                    break;
                case 1:
                    somaNotas += 5;
                    break;
                case 2:
                    somaNotas += 0;
                    break;
            }

            JOptionPane.showMessageDialog(null, "Você escolheu a opção\"" + opcoes[n] + "\"");
        }

        if (somaNotas / 3 >= 10) {
            JOptionPane.showMessageDialog(null, "Cliente muito satisfeito");
        } else if (somaNotas / 3 >= 5 && somaNotas / 3 < 10) {
            JOptionPane.showMessageDialog(null, "Cliente satisfeito");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não satisfeito");
        }

    }

}
