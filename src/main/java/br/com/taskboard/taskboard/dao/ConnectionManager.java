package br.com.taskboard.taskboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static ConnectionManager connectionManager;

    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }

    public Connection getConnection() {
        Connection connection = null;

        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";
        String user = "RM559560";
        String password = "Fiap#2025";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
