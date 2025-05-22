package br.com.taskboard.taskboard.dao;

import br.com.taskboard.taskboard.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    private Connection connection;
    private PreparedStatement stm;

    public boolean cadastrar(Usuario usuario) {

        String sql = "INSERT INTO TB_CADASTRO_USUARIO (id, nome, email, cpf, senha) VALUES (SEQ_CADASTRO_USUARIO.nextval, ?, ?, ?, ?)";
        try{

            connection = ConnectionManager.getInstance().getConnection();
            stm = connection.prepareStatement(sql);
            stm.setString(1, usuario.getNome());
            stm.setString(2, usuario.getEmail());
            stm.setString(3, usuario.getCpf());
            stm.setString(4, usuario.getSenha());

            stm.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
