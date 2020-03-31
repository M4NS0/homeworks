package frontEnd;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import backEnd.Client;
import backEnd.Gravacao;

public class Perguntas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int ranking;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perguntas frame = new Perguntas();
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
	public Perguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Client cliente = new Client(Client.getNome(), Client.getSexo(),Client.getCurso(), ranking);
				Gravacao nova = new Gravacao();
				try {
					nova.Grava(Client.getNome(), Client.getSexo(), Client.getCurso(), ranking);;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnOk.setBounds(321, 180, 117, 25);
		contentPane.add(btnOk);
		setLocationRelativeTo(null);
		setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height); // full screen
        setVisible(true);
	}

	public int getRanking() {
		return ranking;
	}
	

}
