/*
============================================================================

Instituição     : Pontifícia Universidade Católica de Goiás
Departamento    : Escola de Ciências Exatas e da Computação
Curso           : Análise e Desenvolvimento de Sistemas
Matéria         : Estrutura de Dados
Professor       : José Olímpio Ferreira
Período         : Segundo
Avaliação       : Trabalho EAD / N2
Título          : Agenda em Lista Encadeada e Ordenada
Autor           : Bruno Camargo Manso
Descrição       : Quando os botões de adicionar e de excluir são clicados, 
                  uma segunda  janela  responsável  pelo  cadastro  surge. 
                  Esta nova janela possuirá campos de preenchimento, e os 
                  botões gravar e cancelar.

============================================================================
*/

package agenda;

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
	private int index;

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
			@Override
			public void windowClosed( WindowEvent arg0) {
				Programa programa = new Programa();
				programa.setVisible(true);
			}
		});
		
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 349, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		lblNome.setBounds(12, 19, 66, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		lblTelefone.setBounds(12, 59, 66, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		lblEndereco.setBounds(12, 99, 66, 14);
		contentPane.add(lblEndereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		txtEndereco.setBounds(88, 92, 223, 28);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtNome = new JTextField();
		txtNome.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		txtNome.setBounds(88, 12, 223, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setFont(new Font("Ubuntu Light", Font.PLAIN, 14));
		txtFone.setBounds(88, 52, 223, 28);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		       /* Botão Cancelar */
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Programa frm = new Programa();
				frm.setVisible(true);	
			}
		});
		btnCancelar.setBounds(185, 159, 89, 23);
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
				Programa frm = new Programa();
				frm.setVisible(true);
			}
		});
		btnGravar.setBounds(68, 159, 89, 23);
		contentPane.add(btnGravar);

		
	}
    
	
	/* Função Inserir */
	
	public String inserirPessoa() {                   // Chamada pelo Método do Botão Gravar
		
		
		Pessoa p = new Pessoa();                      // Cria Objeto da Classe Pessoa
		Lista list = new Lista();
	
		try {                                         // Inicio do tratamento de excessão
			
			GerArquivo.lerArquivo(list);              // Carregando arquivo e adicionando a uma Lista Encadeada de Forma Ordenada
			
                                                      // Inserindo no Objeto do tipo Pessoa: 
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setEndereco(txtEndereco.getText());
			
			list.adicionaOrdenado(p);                 // Adicionando Objeto do tipo Pessoa na Lista Ligada Ordenada
			lista.add(p);                             // Adicionando Objeto do tipo Pessoa em um ArrayList que será usado pela JTable
			
			GerArquivo.gravarArquivo(list, false);    // Passa a lista Ordenada para a Classe que grava em arquivo de texto
			
			return "Pessoa inserida com sucesso";
			
		} catch (Exception e) {                       // fim do tratamento de excessão
			return "Erro ao Inserir! Favor digitar apenas números na matrícula!";
		}
	}
	
    
	/* Função de Alteração de Pessoas cadastradas */
	
	public String alterarPessoa() {
		Lista list = new Lista();                    // Cria Objeto da Classe Lista ( Encadeada )
		Pessoa p = lista.get(index);                 // Cria Objeto da Classe Pessoa
		
		try {
			
			GerArquivo.lerArquivo(list);             // Carregando arquivo e adicionando a uma Lista Encadeada de Forma Ordenada
			list.retira(p);                          // Remove Pessoa a ser editada da Lista Encadeada
			lista.remove(p);                         // Remove Pessoa a ser editada do ArrayList

                                                     // Adiciona usando os campos editáveis:
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setEndereco(txtEndereco.getText());
			
			list.adicionaOrdenado(p);                // Adiciona pessoa editada na Lista Encadeada
			lista.add(p);                            // Adiciona pessoa editada no ArrayList
			
			GerArquivo.gravarArquivo(list, false);   // Grava Arquivo novamente
			
			return "Pessoa alterada com sucesso";
		} catch (Exception e) {
			return "Erro ao Alterar!";
		}
	}


	/* Função de Limpar Campos */
		                                             
	public void limparCampos() {                       
		txtFone.setText("(  )");                             
		txtNome.setText("");
		txtEndereco.setText("");
		txtNome.requestFocus();
	}

	/* Getters e Setters */
	
	public JButton getBtnGravar() {
		return btnGravar;
	}

	public int getIndice() {
		return index;
	}

	public void setIndice(int index) {
		this.index = index;
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

