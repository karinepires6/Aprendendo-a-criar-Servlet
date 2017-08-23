/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.primeiraServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kpires
 */
@WebServlet("/adicionaCliente")
public class ServletCliente extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String nomeFantasia = request.getParameter("nome");
        String cnpjCpf = request.getParameter("cnpj");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String endereco = request.getParameter("endereco");

        System.out.println("------------- DADOS DA EMPRESA -------------");
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ/CPF: " + cnpjCpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);

        // imprime o nome do contato que foi adicionado
        out.println("<html>");
        out.println("<body>");
        out.println("Cliente: " + nomeFantasia
                + " adicionado com sucesso!");
        out.println("</body>");
        out.println("</html>");

    }

}
