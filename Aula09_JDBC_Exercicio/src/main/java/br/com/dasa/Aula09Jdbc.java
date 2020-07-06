package br.com.dasa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aula09Jdbc {

    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(driver);
        } catch (Exception e) {
            
        }

        String url = "jdbc:mysql://172.17.0.1:6606/agenda_contatos";
        String usr = "agenda_contatos";
        String pwd = "agenda_contatos";
//        DatabaseMetaData dbmd = con.getMetaData();
//        System.out.println("Banco: " + dbmd.getDatabaseProductName() + " " + dbmd.getDatabaseProductVersion());

        try (Connection con = DriverManager.getConnection(url, usr, pwd);
                Statement stmt = con.createStatement()) {

            String sql = "SELECT * FROM contatos";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") + " - " + rs.getString("email"));

            }
            rs.close();
        } catch (SQLException e) {
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");

        String sql = "SELECT * FROM contatos WHERE nome LIKE ? ORDER BY nome";
        try (Connection con = DriverManager.getConnection(url, usr, pwd);
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "C%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("nome") + " - " + rs.getString("email"));
            }
            rs.close();
        } catch (SQLException e) {
        }

    }

}
