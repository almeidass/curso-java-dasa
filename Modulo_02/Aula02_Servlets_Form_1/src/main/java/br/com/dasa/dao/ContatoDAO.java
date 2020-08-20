package br.com.dasa.dao;

import br.com.dasa.conexao.FabricaDeConexoes;
import br.com.dasa.model.bean.ContatoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDAO {

    public boolean inserirContato(ContatoBean contato) {

        String sql = "INSERT INTO contato (nome, email, fone) values (?, ?, ?)";

        try (Connection con = FabricaDeConexoes.obterConexao();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getEmail());
            ps.setString(3, contato.getFone());
            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao tentar criar um novo contato:" + ex);

            return false;
        }

    }

}
