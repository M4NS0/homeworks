package temporario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtTempo;
	private JTextField textField;
	private JTextField txtNomeDoCliente;
	private JButton btnEditar;
	private JButton btnNewButton;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnLigadesliga = new JToggleButton("Liga/Desliga");
		tglbtnLigadesliga.setFont(new Font("Dialog", Font.BOLD, 10));
		tglbtnLigadesliga.setBounds(356, 52, 131, 25);
		contentPane.add(tglbtnLigadesliga);
		tglbtnLigadesliga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNovo.setBounds(12, 12, 76, 25);
		contentPane.add(btnNovo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setBounds(100, 52, 244, 25);
		contentPane.add(comboBox);
		
		txtTempo = new JTextField();
		txtTempo.setBorder(null);
		txtTempo.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtTempo.setText("tempo:");
		txtTempo.setBounds(366, 92, 44, 19);
		contentPane.add(txtTempo);
		txtTempo.setColumns(10);
		
		textField = new JTextField();
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setBounds(425, 92, 44, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtNomeDoCliente = new JTextField();
		txtNomeDoCliente.setBorder(null);
		txtNomeDoCliente.setFont(new Font("Dialog", Font.ITALIC, 10));
		txtNomeDoCliente.setEditable(false);
		txtNomeDoCliente.setText("nome do cliente - número de processo");
		txtNomeDoCliente.setBounds(127, 19, 196, 31);
		contentPane.add(txtNomeDoCliente);
		txtNomeDoCliente.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Dialog", Font.BOLD, 10));
		btnEditar.setBounds(12, 52, 76, 25);
		contentPane.add(btnEditar);
		
		btnNewButton = new JButton("Estatística");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 10));
		btnNewButton.setMargin(new Insets(2, 5, 2, 5));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(12, 92, 76, 25);
		contentPane.add(btnNewButton);
	}
}
