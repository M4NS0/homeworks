package principal;

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

import frontEnd.Splash;



public class Op extends JFrame {


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
		//new Splash();
		EventQueue.invokeLater(new Runnable() {
			

			public void run() {
				try {
					
					Op frame = new Op();
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
	public Op() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
			
		JToggleButton tglbtnLigadesliga = new JToggleButton("Liga/Desliga");
		tglbtnLigadesliga.setFont(new Font("Dialog", Font.BOLD, 10));
		tglbtnLigadesliga.setBounds(356, 52, 131, 25);
		contentPane.add(tglbtnLigadesliga);
		tglbtnLigadesliga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro cadastro = new Cadastro();
				cadastro.getBtnGravar().setText(("Gravar"));
				cadastro.setVisible(true);
				
			}
		});
		btnInserir.setFont(new Font("Dialog", Font.BOLD, 10));
				
		btnInserir.setBounds(12, 12, 76, 25);
		contentPane.add(btnInserir);
		
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
