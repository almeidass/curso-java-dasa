package br.com.dasa.model.dao;

import br.com.dasa.model.bean.Contato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContatoDAOTest {
    
    public ContatoDAOTest() {
    }

    @Test
    public void inserir() {
        
        Contato contato = new Contato("Leonardo Almeida", "batata@palha.com", "11985438870");
        ContatoDAO dao = new ContatoDAO();

        if (dao.inserir(contato)) {
            System.out.println("Contato cadastrado com sucesso!");
        } else {
            fail("Erro ao cadastrar o caontato!");
        }
    }
    
}
