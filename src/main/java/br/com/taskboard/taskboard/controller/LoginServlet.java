package br.com.taskboard.taskboard.controller;

import br.com.taskboard.taskboard.dao.LoginDao;
import br.com.taskboard.taskboard.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private LoginDao loginDao = new LoginDao();

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        Usuario usuario = loginDao.autenticar(email, senha);
        if (usuario != null) {
            req.getSession().setAttribute("usuarioLogado", usuario);
            resp.sendRedirect("tarefas");
        } else {
            req.setAttribute("erro", "E-mail ou senha inválidos.");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }

    }
}
