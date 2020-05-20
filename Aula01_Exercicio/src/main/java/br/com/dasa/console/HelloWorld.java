package br.com.dasa.console;

import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        JOptionPane.showMessageDialog(null, "Hello Again", "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
