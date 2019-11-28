
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Principal extends JFrame {

	private JPanel contentPane;
	protected ArrayList<Marca> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Dialog Banco de Dados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 112);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAlterar = new JButton("Alterar ");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Marca m = new Marca();
				String marca = JOptionPane.showInputDialog("Insira a Marca do carro: ");
				String pais = JOptionPane.showInputDialog("Insira o Pais de origem da marca ");
				int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id que deseja alterar"));
				m.setNome(marca);
				m.setOrigem(pais);
				m.setId(id);
				
				MarcaDao.alterar(m);
			}
		});
		
				JButton btnInserir = new JButton("Inserir");
				btnInserir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					
						Marca m = new Marca();
						String marca = JOptionPane.showInputDialog("Insira a Marca do carro: ");
						String pais = JOptionPane.showInputDialog("Insira o Pais de origem da marca ");
						m.setNome(marca);
						m.setOrigem(pais);
						MarcaDao.inserir(m);
						}
				});
				contentPane.add(btnInserir);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id que deseja alterar"));
				boolean resultado = MarcaDao.excluir(id);
				if (resultado) {
					JOptionPane.showMessageDialog(null, "Marca excluida com sucesso!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Erro ao excluir a Marca!!!");
					
				}
			}
		});
		contentPane.add(btnExcluir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lista = MarcaDao.listagem();
				for (Marca marca : lista) {
					JOptionPane.showMessageDialog(null, marca.toString());
					
				}
			}
		});
		contentPane.add(btnListar);
		
		JButton btnRetornaPorId = new JButton("Retorna por Id");
		btnRetornaPorId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(JOptionPane.showInputDialog("Insira o id que deseja retornar dados"));
				Marca resultado = MarcaDao.retornaPorId(id);
				JOptionPane.showMessageDialog(null, resultado);
				
			}
		});
		contentPane.add(btnRetornaPorId);
		
		JButton btnNewButton = new JButton("Retorna Ultimo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,MarcaDao.retornaUltimoId());	
				
				
			}
		});
		contentPane.add(btnNewButton);
	}
}
