package com.exerciciojavafx5.persistence;

import com.exerciciojavafx5.model.Aluno;
import com.exerciciojavafx5.services.JdbcConnection;
import com.exerciciojavafx5.utils.Tools;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private static JdbcConnection connection = new JdbcConnection();


    public void connect() throws SQLException {
        connection.connect();
    }

    public void disconnect() {
        connection.disconnect();
    }

    public List<Aluno> getAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM matricula";
        try {
            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setDataNascimento(rs.getDate("nascimento"));
                aluno.setMatricula(rs.getString("matricula"));
                alunos.add(aluno);
            }
            return alunos;
        } catch (SQLException throwables) {
            System.out.print("Erro ao carregar! "+ throwables.getMessage());
            return null;
        }
    }

    public void update(Aluno aluno) {
        Tools tools = new Tools();
        String sql = "update public.matricula set " +
                "nome = '" + aluno.getNome() + "', " +
                "nascimento = '" + tools.dateToString(aluno.getDataNascimento()) + "', " +
                "matricula = '" + aluno.getMatricula() + "' " +
                "where id = " + aluno.getId();

        try {
            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
        } catch (SQLException throwables) {
            System.out.print("Erro ao atualizar! "+ throwables.getMessage());
        }
    }

    public void save(Aluno aluno) {
        String sql = "INSERT INTO matricula (id, nome, nascimento, matricula) " +
                "VALUES (" + aluno.getId()
                + ", '" + aluno.getNome()
                + "', '" + aluno.getDataNascimento()
                + "', '" + aluno.getMatricula()
                + "')";

        try {
            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
        } catch (SQLException throwables) {
            System.out.print("Erro ao salvar! "+ throwables.getMessage());
        }
    }

    public void delete(Aluno aluno) {
        try {
            String sql = "delete from matricula where id = ?";

            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, aluno.getId());
            pstm.executeUpdate();

        } catch (SQLException throwables) {
            System.out.print("Erro ao excluir! "+ throwables.getMessage());
        }
    }
}

