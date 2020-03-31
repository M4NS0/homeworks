package frontEnd;

import backEnd.Client;
import backEnd.Gravacao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldnome;
	private JTextField textFieldsexo;
	private JTextField textFieldcurso;
	private JButton btnFoto;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		try {
			// new Splash();
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("JTattoo".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Classe não encontrada");
		} catch (InstantiationException ex) {
			System.out.println("Programa não pode ser instanciado");
		} catch (IllegalAccessException ex) {
			System.out.println("Acesso Ilegal");
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			System.out.println("Look and Feel não suportado");
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new App().setVisible(true);

			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App() {
		setTitle("Jogo dos Inteiros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(130, 122, 70, 15);
		contentPane.add(lblNome);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(130, 149, 70, 15);
		contentPane.add(lblSexo);

		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(130, 176, 70, 15);
		contentPane.add(lblCurso);

		textFieldnome = new JTextField();
		textFieldnome.setBounds(187, 120, 114, 19);
		contentPane.add(textFieldnome);
		textFieldnome.setColumns(10);

		textFieldsexo = new JTextField();
		textFieldsexo.setColumns(10);
		textFieldsexo.setBounds(187, 147, 114, 19);
		contentPane.add(textFieldsexo);

		textFieldcurso = new JTextField();
		textFieldcurso.setBounds(187, 176, 114, 19);
		contentPane.add(textFieldcurso);
		textFieldcurso.setColumns(10);

		JButton btnComecar = new JButton("Começar");
		btnComecar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Client cliente = new Client(textFieldnome.getText(),textFieldsexo.getText(),textFieldcurso.getText(),0);
				
				dispose(); // fecha janela
				new Splash2();

			}

		});

		btnComecar.setBounds(165, 225, 117, 25);
		contentPane.add(btnComecar);

		btnFoto = new JButton("Foto");
		btnFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFoto.setBounds(180, 12, 81, 74);
		contentPane.add(btnFoto);
	}

	public JTextField getTextFieldnome() {
		return textFieldnome;
	}

	public JTextField getTextFieldsexo() {
		return textFieldsexo;
	}

	public JTextField getTextFieldcurso() {
		return textFieldcurso;
	}
	

}
