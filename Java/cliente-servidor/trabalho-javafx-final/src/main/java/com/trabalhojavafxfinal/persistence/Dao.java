package com.trabalhojavafxfinal.persistence;

import com.trabalhojavafxfinal.models.Citizen;
import com.trabalhojavafxfinal.services.JdbcConnection;
import com.trabalhojavafxfinal.utils.Tools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
    private static JdbcConnection connection = new JdbcConnection();
    private Connection conn = null;

    public void connect() throws SQLException {
        connection.connect();
    }

    public void disconnect() {
        connection.disconnect();
    }

    public List<Citizen> getListFromDB() throws SQLException {
        String sql = "SELECT * FROM registro";
        try {
            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            ArrayList<Citizen> list = new ArrayList<>();
            while (rs.next()) {
                Citizen citizen = new Citizen();
                citizen.setId(rs.getInt("id"));
                citizen.setCitizenName(rs.getString("citizenname"));
                citizen.setCpf(rs.getString("cpf"));
                citizen.setVaxName(rs.getString("vaxname"));
                citizen.setVaxDate(rs.getDate("vaxdate"));
                citizen.setVaxProducerName(rs.getString("vaxproducername"));
                citizen.setVaxDosage(rs.getDouble("vaxdosage"));
                citizen.setVaxCNPJ(rs.getString("vaxcnpj"));
                list.add(citizen);
            }
            return list;
        } catch (SQLException e) {
            return null;
        }

    }

    public void insert(Citizen citizen) throws SQLException {
        String sql = "INSERT INTO registro (id,citizenname, cpf, vaxname, vaxdate, vaxproducername, vaxdosage, vaxcnpj) " +
                "VALUES (" + citizen.getId()
                + " ,'" + citizen.getCitizenName() + "'"
                + "," + "'" + citizen.getCpf() + "'"
                + "," + "'" + citizen.getVaxName() + "'"
                + "," + "'" + citizen.getVaxDate() + "'"
                + "," + "'" + citizen.getVaxProducerName() + "'"
                + "," + citizen.getVaxDosage()
                + "," + "'" + citizen.getVaxCNPJ() + "'" + ")";

        try (Connection conn = connection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Citizen citizen) {
        try {
            String sql = "delete from registro where id = ?";

            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, citizen.getId());
            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.print("Erro ao excluir! " + e.getMessage());
        }
    }

    public void update(Citizen citizen) {
        Tools tools = new Tools();
        try {
            String sql = "update public.registro set citizenName = ?, cpf = ?, vaxname = ?, vaxdate = ?::date, vaxproducername = ?, vaxdosage = ?, vaxcnpj = ? where id = ?";

            Connection conn = connection.connect();
            PreparedStatement pstm = conn.prepareStatement(sql);


            pstm.setString(1, citizen.getCitizenName());
            pstm.setString(2, citizen.getCpf());
            pstm.setString(3, citizen.getVaxName());
            pstm.setString(4, tools.dateToString(citizen.getVaxDate()));
            pstm.setString(5, citizen.getVaxProducerName());
            pstm.setDouble(6, citizen.getVaxDosage());
            pstm.setString(7, citizen.getVaxCNPJ());
            pstm.setInt(8, citizen.getId());
            pstm.executeUpdate();

        } catch (Exception e) {

            System.out.print("Erro ao atualizar! " + e.getMessage());
        }
    }
}
