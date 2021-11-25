package com.trabalhojavafxfinal.services;
import java.sql.*;
public class JdbcConnection {

    static final String URL = "jdbc:postgresql://localhost:5432/cadastro";
    static final String USER = "postgres";
    static final String PASS = "postgres";
    static final String DRIVER = "org.postgresql.Driver";

    public JdbcConnection() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
        }
    }

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASS);

        if (conn != null) {
            return conn;
        }
        return null;
    }

    public static void disconnect() {
        try {
            if (connect() != null) {
                connect().close();
            }
        } catch (SQLException e) {
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        try {
            return connect().prepareStatement(sql);
        } catch (SQLException e) {
            return null;
        }
    }



}
