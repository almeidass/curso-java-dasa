package br.com.dasa.servlets;

import br.com.dasa.dao.ContatoDAO;
import br.com.dasa.model.bean.ContatoBean;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "CadastrarServlet", urlPatterns = {"/CadastrarServlet"})
public class CadastrarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ContatoBean contato = new ContatoBean();
        contato.setNome(request.getParameter("nome"));
        contato.setEmail(request.getParameter("email"));
        contato.setFone(request.getParameter("fone"));

//        Contato contato = new Contato();
//        contato.setNome(request.getParameter("nome"));
//        contato.setEmail(request.getParameter("email"));
//        contato.setFone(request.getParameter("fone"));
        ArrayList<String> erros = new ArrayList<>();

        if (StringUtils.isBlank(contato.getNome())) {
            erros.add("O campo Nome é obrigatório");
        }
        if (StringUtils.isBlank(contato.getEmail())) {
            erros.add("O campo Email é obrigatório");
        }
        if (StringUtils.isBlank(contato.getFone())) {
            erros.add("O campo Fone é obrigatório");
        }
        if (!StringUtils.isNumeric(contato.getFone())) {
            erros.add("O campo Fone precisa ser numérico");
        }

        ContatoDAO dao = new ContatoDAO();
        
        dao.inserirContato(contato);

        if (erros.isEmpty()) {
            request.setAttribute("msgSucesso", "Contato cadastrado com sucesso!");
        } else {
            request.setAttribute("erros", erros);
            request.setAttribute("contato", contato);
        }

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
