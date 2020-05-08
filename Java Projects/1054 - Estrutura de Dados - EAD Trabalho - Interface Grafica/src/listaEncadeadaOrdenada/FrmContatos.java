package listaEncadeadaOrdenada;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JSpinner;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;

public class FrmContatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFone;

	private JTextField txtEndereco;
	private JButton btnGravar;

	private ArrayList<Pessoa> lista;
	private int indice;

	

	public void limparCampos() {
		txtFone.setText("");
		txtNome.setText("");
		txtEndereco.setText("0");
		txtNome.requestFocus();
	}

	/**
	 * Create the frame.
	 */
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

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblNome.setBounds(10, 14, 66, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblTelefone.setBounds(10, 42, 66, 14);
		contentPane.add(lblTelefone);

		txtNome = new JTextField();
		txtNome.setBounds(86, 11, 225, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(86, 39, 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);

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

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(183, 113, 89, 23);
		contentPane.add(btnCancelar);

		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		lblEndereco.setBounds(10, 68, 66, 14);
		contentPane.add(lblEndereco);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(86, 67, 126, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
	}

	public String inserirPessoa() {
		FrmContatosLista frm = new FrmContatosLista();
	
		try {
			
			
			
			
			/*
			Pessoa p = new Pessoa();
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setMatricula(Integer.parseInt(txtEndereco.getText()));
			lista.add(p); 
			limparCampos();
			GerArquivo.gravarArquivo(p.toString(), true);
			
			// ler de volta o arquivo gravado para evitar que a lista duplique
			 
			*/
			
			
			return "Pessoa inserida com sucesso";
			
		} catch (Exception e) {
			return "Erro ao Inserir! Favor digitar apenas n�meros na matr�cula!";
		}
		
	}
	

	public String alterarPessoa() {
		try {
			
			
			
			/*
			Pessoa p = lista.get(indice);
			p.setNome(txtNome.getText());
			p.setTelefone(txtFone.getText());
			p.setMatricula(Integer.parseInt(txtEndereco.getText()));
			GerArquivo.gravarArquivo(lista);
			return "Pessoa alterada com sucesso";
			*/
		} catch (Exception e) {
			return "Erro ao Alterar! Favor digitar apenas n�meros na matr�cula!";
		}
		return null;
	}
	
	public JButton getBtnGravar() {
		return btnGravar;
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

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
}
