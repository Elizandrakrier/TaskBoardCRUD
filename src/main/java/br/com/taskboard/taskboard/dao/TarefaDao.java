package br.com.taskboard.taskboard.dao;

import br.com.taskboard.taskboard.model.Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TarefaDao {
    private Connection connection;
    private PreparedStatement stm = null;

    public void save(Tarefas tarefas) {

        String sql = "INSERT INTO TB_TAREFAS(ID, TITULO, DESCRICAO) VALUES(SEQ_TAREFAS_ID.nextval, ?, ?)";

        try{
            connection = ConnectionManager.getInstance().getConnection();
            stm = connection.prepareStatement(sql);
            stm.setString(1, tarefas.getTitulo());
            stm.setString(2, tarefas.getDescricao());

            int result = stm.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                stm.close();
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void update(Tarefas tarefas) {
    }

    public void delete(Tarefas tarefas) {
    }

    public Tarefas getTarefasById(int id) {
        return null;
    }

    public List<Tarefas> getAll() {
        List<Tarefas> tarefa = new ArrayList<>();
        String sql = "SELECT * FROM TB_TAREFAS ORDER BY TITULO ASC";

        try{
            connection = ConnectionManager.getInstance().getConnection();
            stm = connection.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {

                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                int id = rs.getInt("id");

                Tarefas task = new Tarefas(titulo, descricao, id);
                tarefa.add(task);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                if (stm != null) stm.close();
                if (connection != null) connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return tarefa;
    }
    public List<Tarefas> getTarefasByTitulo(String titulo) {
        return null;
    }
}
