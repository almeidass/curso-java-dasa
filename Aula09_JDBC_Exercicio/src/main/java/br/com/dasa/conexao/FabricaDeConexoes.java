package br.com.dasa.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://172.17.0.1:6606/agenda_contatos";
    private static final String USR = "agenda_contatos";
    private static final String PWD = "agenda_contatos";

    public static Connection obterConexao() {

        try {  
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PWD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }

}
