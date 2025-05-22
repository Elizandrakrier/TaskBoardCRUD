package br.com.taskboard.taskboard.controller;

import br.com.taskboard.taskboard.dao.TarefaDao;
import br.com.taskboard.taskboard.model.Tarefas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/tarefas")
public class TarefaServlet extends HttpServlet {

    private TarefaDao tarefaDao;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String titulo = req.getParameter("titulo");
            String descricao = req.getParameter("descricao");

            Tarefas tarefas = new Tarefas(titulo, descricao, 0);
            tarefaDao = new TarefaDao();
            tarefaDao.save(tarefas);
        }catch (Exception e){
            e.printStackTrace();
        }

        req.getRequestDispatcher("tarefas.jsp").forward(req, resp);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            tarefaDao = new TarefaDao();
            List<Tarefas> tarefas = tarefaDao.getAll();
            req.setAttribute("tarefas", tarefas);
        }catch (Exception e){
            e.printStackTrace();
        }
        req.getRequestDispatcher("lista.jsp").forward(req, resp);
    }
}
