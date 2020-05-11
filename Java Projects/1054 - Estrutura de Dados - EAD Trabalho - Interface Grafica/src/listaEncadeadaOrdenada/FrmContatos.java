package listaEncadeadaOrdenada;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class FrmContatos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFone;

	private JTextField txtEndereco;
	private JButton btnGravar;
	private int indice;

	private ArrayList<Pessoa> lista;

	public FrmContatos(ArrayList<Pessoa> lista) {
		this.lista = lista;
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				if (btnGravar.getText().equals("Gravar")) {
					limparCampos();
				}
			}
		});
		
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 349, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblNome.setBounds(10, 14, 66, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblTelefone.setBounds(10, 42, 66, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblEndereco.setBounds(10, 68, 66, 14);
		contentPane.add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(86, 67, 126, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtNome = new JTextField();
		txtNome.setBounds(86, 11, 225, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(86, 39, 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		       /* Botão Cancelar */
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				FrmContatosLista frm = new FrmContatosLista();
				frm.setVisible(true);
				
			}
		});
		btnCancelar.setBounds(183, 113, 89, 23);
		contentPane.add(btnCancelar);
                                                          /* Inicio da Função de Gravação */
		
		                                                          /* Botão Gravar */
		btnGravar = new JButton("Gravar");
		btnGravar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
              
				if (btnGravar.getText().equals("Gravar")) {           
					String mens = inserirPessoa();
					JOptionPane.showMessageDialog(null, mens);
				} else {
					String mens = alterarPessoa();
					JOptionPane.showMessageDialog(null, mens);
					
				}
				dispose();
				FrmContatosLista frm = new FrmContatosLista();
				frm.setVisible(true);
			}
		});
		btnGravar.setBounds(66, 113, 89, 23);
		contentPane.add(btnGravar);

		
	}
    
	
	/* Função Inserir */
	
	public String inserirPessoa() {                   // Chamada pelo Método do Botão Gravar
		Lista list = new Lista();                     // Cria Objeto da Classe Lista ( Encadeada )
		Pessoa p = new Pessoa();                      // Cria Objeto da Classe Pessoa
	
		try {                                         // Inicio do tratamento de excessão
			                                          // Inserindo no Objeto do tipo Pessoa
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setEndereco(txtEndereco.getText());
			
			list.adicionaOrdenado(p);                 // Adicionando Objeto do tipo Pessoa na Lista Ligada Ordenada
			lista.add(p);                             // Adicionando Objeto do tipo Pessoa em um ArrayList que será usado pela JTable
			
			GerArquivo.gravarArquivo(list, true);     // Passa a lista Ordenada para a Classe que grava em arquivo de texto
			
			return "Pessoa inserida com sucesso";
			
		} catch (Exception e) {                       // fim do tratamento de excessão
			return "Erro ao Inserir! Favor digitar apenas números na matrícula!";
		}
		
	}
	
    
	/* Função de Alteração de Pessoas cadastradas */
	
	public String alterarPessoa() {
		try {
			Lista list = new Lista();                // Cria Objeto da Classe Lista ( Encadeada )
			Pessoa p = lista.get(indice);            // Cria Objeto da Classe Pessoa
                                                     // Adiciona 
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setEndereco(txtEndereco.getText());

			list.adicionaOrdenado(p);
			lista.add(p);
			GerArquivo.gravarArquivo(list, true);
			
			return "Pessoa alterada com sucesso";
		} catch (Exception e) {
			return "Erro ao Alterar! Favor digitar apenas números na matrícula!";
		}
	}


	/* Função de Limpar Campos */
		                                             
	public void limparCampos() {                       
		txtFone.setText("()");                             
		txtNome.setText("");
		txtEndereco.setText("");
		txtNome.requestFocus();
	}
	


	/* Getters e Setters */
	
	public JButton getBtnGravar() {
		return btnGravar;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public JTextField getTxtFone() {
		return txtFone;
	}

	public JTextField getTxtMatricula() {
		return txtEndereco;
	}
}