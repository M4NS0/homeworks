package listaEncadeadaOrdenada;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmContatosLista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	private JTable table;

	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private Lista list;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public FrmContatosLista frame;

			public void run() {
				try {
					frame = new FrmContatosLista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}

	/* Configurando Janela */
	
	public FrmContatosLista() {
		setFont(new Font("Ubuntu Mono", Font.BOLD, 12));
		setTitle("Lista de Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				preecherDataTable(true);
			}
		});
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel painel = new JPanel();
		contentPane.add(painel, BorderLayout.CENTER);
		painel.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane(table = new JTable());
		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Telefone", "Endereço" }) {
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(300);
		table.getColumnModel().getColumn(1).setPreferredWidth(300);
		table.getColumnModel().getColumn(2).setPreferredWidth(600);
		scrollPane.setViewportView(table);

		painel.add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 4, 0, 0));

		
		
		/* Inicio das Funções de Botões /*
		
		/* Função para o botão de Adicionar */
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				FrmContatos frmCadastro = new FrmContatos(lista);
				frmCadastro.getBtnGravar().setText("Gravar");
				frmCadastro.setVisible(true);
				scrollPane.setVisible(false);
				dispose();
				
				
			}
		});
		panel.add(btnAdicionar);

		
		/* Função para o botão de Alterar */
		
		JButton btnAlterar = new JButton("Editar");               
		btnAlterar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);                     // Desliga o painel principal
				dispose();
				FrmContatos frmCadastro = new FrmContatos(lista); // Cria Objeto do Tipo FrmContatos estanciando com um ArrayList já criado
				int indice = table.getSelectedRow();              // Ao clicar em um nome, pega a posição e guarda na variável índice
				
				if (indice >= 0) {                                // Se o indice for maior ou igual a zero, faça:
				
					frmCadastro.getBtnGravar().setText("Alterar");
						
					Pessoa p = lista.get(indice);                 // Cria Objeto do tipo Pessoa instanciado pelo indice escolhido
					                                              // Preenche os campos com o Objeto Pessoa:
					
					frmCadastro.getTxtNome().setText(p.getNome());
					frmCadastro.getTxtMatricula().setText(p.getEndereco());
					frmCadastro.getTxtFone().setText(p.getTelefone());
					frmCadastro.setIndice(indice);

					frmCadastro.setVisible(true);                // Liga o Painel de Cadastro
					
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma pessoa na tabela");
					FrmContatosLista janelaCadastro = new FrmContatosLista();
					janelaCadastro.setVisible(true);	
				}
			}
		});
		panel.add(btnAlterar);

		
		/* Função para o botão de Excluir */ 
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				                                                     
				dispose();                                            // Desliga o Painel Principal                           
				int indice = table.getSelectedRow();                  // Pega o Indice da Linha escolhida
				if (indice >= 0) {                                    // Se estiver escolhido, faça:
					Pessoa aux = new Pessoa();                        // Adicionar Objeto auxiliar Pessoa
					                                                  // Adicionar Pessoa do Indice no Objeto auxiliar:
					aux.setNome(lista.get(indice).getNome());         
					aux.setTelefone(lista.get(indice).getTelefone());
					aux.setEndereco(lista.get(indice).getEndereco());
										
					list.retira(aux);                                 // Remove Pessoa da Lista ( encadeada )
					lista.remove(indice);                             // Remove Pessoa do ArrayList
					
					
					try {                                             // tente:
						
						GerArquivo.gravarArquivo(list);               // Gravar Lista Encadeada no arquivo de Texto
					} catch (IOException e) {                         // Tratar Excessões
						JOptionPane.showMessageDialog(null,           // Avisar ao usuário caso não consiga
						"Falha ao gravar os dados da agenda!");
					}
					FrmContatosLista janela = new FrmContatosLista(); // Cria um Objeto desta Classe para permitir o acesso a ela  
					janela.setVisible(true);                          // Religa o Painel Principal
				}
			}
		});
		panel.add(btnExcluir);

		
		/* Função para o botão de Sair */ 
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);                                       // Sai do Programa
			}
		});
		panel.add(btnSair);
	}

	
	/* Incio do carregamento do arquivo .txt */
	
	protected void preecherDataTable(boolean lerArquivo) {
		
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		modelo.setRowCount(0);
		
		if (lerArquivo == true) {
			try {
				list = new Lista();
				GerArquivo.lerArquivo(list);					// passagem de parametros da Classe Lista para Classe GerArquivo
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Falha ao ler os dados da agenda!");
			}
		}
		
		/* inicio do preenchimento da JFrameTable */			/* 	P: 			Por quê usar um ArrayList? 				*/
																/* 	R: Para o devido preenchimento da tabela JFrame		*/
		
		String[] aux = list.imprima().split("\n"); 				// converte lista encadeada ordenada para array de String e separa pessoas
		for (int i = 0; i < aux.length; i++) {					// roda todos os elementos da lista encadeada
			String[] temp = aux[i].split(",");					// divide cada atributo de cada pessoa por virgulas
			Pessoa p = new Pessoa(temp[0], temp[1], temp[2]);  	// insere os atributos em um objeto tipo Pessoa
			lista.add(p);										// adiciona as pessoas em um arrayList
		}
		for (Pessoa p : lista) {								// para cada elemento da lista, adiciona uma pessoa	
																// e coloca atributos em uma linha:
			
			modelo.addRow(new Object[] { p.getNome(), p.getTelefone(),p.getEndereco() });
		}
		
	}
    /* Getters e Setters */
	
	public Lista getList() {
		return list;
	}

	public void setList(Lista list) {
		this.list = list;
	}

	public ArrayList<Pessoa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Pessoa> lista) {
		this.lista = lista;
	}



	

}