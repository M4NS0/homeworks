package com.trabalhojavafxfinal.persistence;

import com.trabalhojavafxfinal.models.Citizen;
import com.trabalhojavafxfinal.services.JdbcConnection;

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
        List<Citizen> citizens = new ArrayList<>();
        Citizen citizen = new Citizen();
        try {
            Connection conn = connection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                citizen.setId(rs.getInt("id"));
                citizen.setCitizenName(rs.getString("citizenname"));
                citizen.setCpf(rs.getString("cpf"));
                citizen.setVaxName(rs.getString("vaxname"));
                citizen.setVaxDate(rs.getString("vaxdate"));
                citizen.setVaxProducerName(rs.getString("vaxproducername"));
                citizen.setVaxDosage(rs.getInt("vaxdosage"));
                citizen.setVaxCNPJ(rs.getString("vaxcnpj"));
                citizens.add(citizen);
            }
            pstmt.close();
            rs.close();
            return citizens;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            connection.disconnect();
        }
    }




    public void saveCitizen(Citizen citizen) throws SQLException {
        String sql = "INSERT INTO registro (id,citizenname, cpf, vaxname, vaxdate, vaxproducername, vaxdosage, vaxcnpj) " +
                "VALUES (" + citizen.getId()
                + " ,'" + citizen.getCitizenName() + "'"
                + "," + "'" + citizen.getCpf() + "'"
                + "," + "'" + citizen.getVaxName() + "'"
                + "," + "'" + citizen.getVaxDate() + "'"
                + "," + "'" + citizen.getVaxProducerName() + "'"
                + "," + citizen.getVaxDosage()
                + "," + "'" + citizen.getVaxCNPJ() + "'" + ")";

        System.out.println(sql);

        try (Connection conn = connection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCitizen(Citizen citizen) {
    }

    public void updateCitizen(Citizen citizen) {
    }

    public Citizen getCitizenBySearch(String search) {
        return null;
    }


}
