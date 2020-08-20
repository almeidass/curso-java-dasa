<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="contato"
                     scope="request"
                     class="br.com.dasa.model.bean.ContatoBean">

            <jsp:setProperty name="contato" property="nome" value="" />
            <jsp:setProperty name="contato" property="email" value="" />
            <jsp:setProperty name="contato" property="fone" value="" />
        </jsp:useBean>

        <form action="CadastrarServlet" method="post">
            Nome: <br />
            <input type="text" name="nome"
                   value="<jsp:getProperty name="contato" property="nome" />" /><br />
            Email: <br />
            <input type="text" name="email" 
                   value="<jsp:getProperty name="contato" property="email" />" /><br />
            Fone: <br /> 
            <input type="text" name="fone" 
                   value="<jsp:getProperty name="contato" property="fone" />" /><br />
            <br />
            <input type="submit" value="Cadastrar" />
        </form>
        <%
            String msgSucesso = (String) request.getAttribute("msgSucesso");
            if (msgSucesso != null) {
                out.println("<h3 style='color: green'>" + msgSucesso + "</h3>");
            }
            ArrayList<String> erros = (ArrayList) request.getAttribute("erros");
            if (erros != null) {
                for (String erro : erros) {
                    out.println("<h3 style='color: red'>" + erro + "</h3>");
                }
            }
        %>
    </body>
</html>
