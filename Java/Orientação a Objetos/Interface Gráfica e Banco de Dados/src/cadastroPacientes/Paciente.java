/**
 *
 * Classe principal, a que gera os objetos Paciente que são a parte efetiva do
 * programa de cadastro de pacientes de um hospital hipotético
 * 
 * @author barcelosluan
 */

package cadastroPacientes;

public class Paciente {

    private String pacienteId;
    private String pacienteNome;
    private String pacienteCpf;
    private String pacienteMae;
    private String pacienteTelefone;
    private String pacienteInternacao;
    private String pacienteAlta;
    private String[] pacienteColunas = new String[] {"id", 
                                                     "nome", 
                                                     "cpf", 
                                                     "mae", 
                                                     "telefone", 
                                                     "internacao", 
                                                     "alta"};
    
    public Paciente() {  
    }
    
    public Paciente(String id) {
        this.pacienteId = id;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(String id) {
        this.pacienteId = id;
    }

    public String getPacienteNome() {
        return pacienteNome;
    }

    public void setPacienteNome(String nome) {
        this.pacienteNome = nome;
    }

    public String getPacienteCpf() {
        return pacienteCpf;
    }

    public void setPacienteCpf(String cpf) {
        this.pacienteCpf = cpf;
    }

    public String getPacienteMae() {
        return pacienteMae;
    }

    public void setPacienteMae(String mae) {
        this.pacienteMae = mae;
    }

    public String getPacienteTelefone() {
        return pacienteTelefone;
    }

    public void setPacienteTelefone(String telefone) {
        this.pacienteTelefone = telefone;
    }

    public String getPacienteInternacao() {
        return pacienteInternacao;
    }

    public void setPacienteInternacao(String internacao) {
        this.pacienteInternacao = internacao;
    }

    public String getPacienteAlta() {
        return pacienteAlta;
    }

    public void setPacienteAlta(String alta) {
        this.pacienteAlta = pacienteAlta;
    }

    public String[] getPacienteColunas() {
        return pacienteColunas;
    }

    public void setPacienteColunas(String[] colunas) {
        this.pacienteColunas = colunas;
    }  
    
}
