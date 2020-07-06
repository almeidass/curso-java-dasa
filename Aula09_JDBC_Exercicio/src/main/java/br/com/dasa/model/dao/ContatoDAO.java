package br.com.dasa.model.dao;

import br.com.dasa.conexao.FabricaDeConexoes;
import br.com.dasa.model.bean.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    public boolean inserir(Contato contato) {

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

    public List<Contato> buscarTodos() {

        String sql = "SELECT * FROM contato";
        List<Contato> contatos = new ArrayList<>();

        try (Connection con = FabricaDeConexoes.obterConexao();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEmail(rs.getString("email"));
                contato.setFone(rs.getString("fone"));
                
                contatos.add(contato);
                
            }

        } catch (SQLException ex) {
            System.err.println("Erro ao tentar consultar os Contatos:" + ex);

        }
        
        return contatos;

    }

}
