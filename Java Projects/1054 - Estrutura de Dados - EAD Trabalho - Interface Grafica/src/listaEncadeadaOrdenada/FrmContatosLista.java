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

	/**
	 * Create the frame.
	 */
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
		setBounds(100, 100, 450, 300);
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
			boolean[] columnEditables = new boolean[] { false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(200);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(400);
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
		
		JButton btnAlterar = new JButton("Editar");               // Janela 1
		btnAlterar.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setVisible(false);                     // Desliga o painel principal
				dispose();
				FrmContatos frmCadastro = new FrmContatos(lista); // Cria Objeto do Tipo FrmContatos estanciando com um ArrayList já criado
				int indice = table.getSelectedRow();              // Ao clicar em um nome, pega a posição e guarda na variável índice
				
				if (indice >= 0) {                                // Se o indice for maior ou igual a zero, faça:
					
					
					//frmCadastro.getBtnGravar().setText("Alterar");
										
					Pessoa p = lista.get(indice);					
					
					frmCadastro.getTxtNome().setText(p.getNome());
					frmCadastro.getTxtMatricula().setText(p.getEndereco());
					frmCadastro.getTxtFone().setText(p.getTelefone());
					frmCadastro.setIndice(indice);
				
					frmCadastro.setVisible(true);
					//preecherDataTable(true);
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione uma pessoa na tabela");
					FrmContatosLista c = new FrmContatosLista();
					c.setVisible(true);
					
				}

			}
		});
		panel.add(btnAlterar);

		
		/* Função para o botão de Excluir */ 
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPane.setVisible(false);                     // Desliga o painel principal
				dispose();
				int indice = table.getSelectedRow();
				if (indice >= 0) {
					Pessoa aux = new Pessoa();
					System.out.println(lista.get(indice).getNome());
					aux.setNome(lista.get(indice).getNome());
					aux.setTelefone(lista.get(indice).getTelefone());
					aux.setEndereco(lista.get(indice).getEndereco());
					
					list.retira(aux);
					lista.remove(indice);
					
					
					try {
						
						GerArquivo.gravarArquivo(list);
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Falha ao gravar os dados da agenda!");
					}
					FrmContatosLista c = new FrmContatosLista();
					c.setVisible(true);
				}
			}
		});
		panel.add(btnExcluir);

		
		/* Função para o botão de Sair */ 
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Ubuntu Mono", Font.PLAIN, 12));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
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