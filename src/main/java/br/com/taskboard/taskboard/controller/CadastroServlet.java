package br.com.taskboard.taskboard.controller;

import br.com.taskboard.taskboard.dao.UsuarioDao;
import br.com.taskboard.taskboard.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
    private UsuarioDao usuarioDAO = new UsuarioDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");

        Usuario novoUsuario = new Usuario(nome, email, cpf, senha);
        boolean sucesso = usuarioDAO.cadastrar(novoUsuario);

        if (sucesso) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("erro", "Erro ao cadastrar usuário. Tente novamente.");
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
        }
    }
}
