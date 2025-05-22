package br.com.taskboard.taskboard.dao;

import br.com.taskboard.taskboard.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    private Connection connection;
    private PreparedStatement stm = null;

    public Usuario autenticar(String email, String senha)  {
        String sql = "SELECT * FROM TB_CADASTRO_USUARIO WHERE email = ? AND senha = ?";

        try{
            connection = ConnectionManager.getInstance().getConnection();
            stm = connection.prepareStatement(sql);
            stm.setString(1, email);
            stm.setString(2, senha);

            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Usuario user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setCpf(rs.getString("cpf"));
                user.setSenha(rs.getString("senha"));
                return user;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
