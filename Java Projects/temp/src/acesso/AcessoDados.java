/**
 *
 * Classe que gera o encapsulamento do acesso aos dados do BD
 * Data Access Object (DAO) ou Objeto de Acesso aos Dados
 * 
 * @author barcelosluan
 */

package acesso;

// Importa o pacote de conexão ao BD
import conexao.ConnectionFactory;
// Importa o pacote de cadastro de pacientes
import cadastroPacientes.Paciente;
// Importa o BD
import java.sql.*;
import java.util.ArrayList;
// Importa o pacote de saída de informações ao usuário
import javax.swing.JOptionPane;

public class AcessoDados {
    
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String mae;
    String telefone;
    String internacao;
    String alta;;
    
    public AcessoDados() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void salvar(Paciente objPaciente) {
        try {
            String sql;
            if (String.valueOf((objPaciente.getPacienteId())).isEmpty()) {
                sql = "INSERT INTO paciente(nome,cpf,mae,telefone, internacao, alta) VALUES(?,?,?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objPaciente.getPacienteNome());
                stmt.setString(2, objPaciente.getPacienteCpf());
                stmt.setString(3, objPaciente.getPacienteMae());
                stmt.setString(4, objPaciente.getPacienteTelefone());
                stmt.setString(5, objPaciente.getPacienteInternacao());
                stmt.setString(6, objPaciente.getPacienteAlta());
                stmt.execute();
                stmt.close();
            } else {
                sql = "UPDATE paciente SET nome = ?, cpf = ?, mae = ?, telefone = ?, internacao = ?, alta = ? WHERE paciente.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(7, objPaciente.getPacienteId());
                stmt.setString(1, objPaciente.getPacienteNome());
                stmt.setString(2, objPaciente.getPacienteCpf());
                stmt.setString(3, objPaciente.getPacienteMae());
                stmt.setString(4, objPaciente.getPacienteTelefone());
                stmt.setString(5, objPaciente.getPacienteInternacao());
                stmt.setString(6, objPaciente.getPacienteAlta());
                stmt.execute();
                stmt.close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public ArrayList buscar(Paciente objPaciente) {
        try {
            String sql = "";
            
            if(!objPaciente.getPacienteNome().isEmpty()) {
                sql = "SELECT * FROM paciente WHERE nome LIKE '%" + objPaciente.getPacienteNome() + "%' ";
            } else if (!objPaciente.getPacienteCpf().isEmpty()) {
                sql = "SELECT * FROM paciente WHERE cpf LIKE '%" + objPaciente.getPacienteCpf() + "%' ";
            }
            
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("mae"),
                    rs.getString("telefone"),
                    rs.getString("internacao"),
                    rs.getString("alta")
                });
            }
            
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }
    
    public void deletar(Paciente objPaciente) {
        try {
            String sql;
            
            if (!String.valueOf(objPaciente.getPacienteId()).isEmpty()) {
                sql = "DELETE FROM paciente WHERE paciente.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objPaciente.getPacienteId());
                stmt.execute();
                stmt.close();
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM paciente");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("cpf"),
                    rs.getString("mae"),
                    rs.getString("telefone"),
                    rs.getString("internacao"),
                    rs.getString("alta")
                });
            }
            
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }
    }

    public static void testarConexao() throws SQLException {
        try (Connection objConnection = new ConnectionFactory().getConnection()) {
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso! ");
        }
    }
}
