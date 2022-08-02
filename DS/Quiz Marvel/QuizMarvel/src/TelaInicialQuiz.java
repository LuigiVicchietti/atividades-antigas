import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicialQuiz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicialQuiz frame = new TelaInicialQuiz();
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
	public TelaInicialQuiz() {
		setTitle("Tela Inicial do Quiz");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 474, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Question1   Janela = new Question1();
				TelaInicialQuiz.this.dispose();
				Janela.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(41, 197, 115, 23);
		panel.add(btnNewButton);
		
		JButton btnInformao = new JButton("Informa\u00E7\u00F5es");
		btnInformao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				info  Janela = new info();
				TelaInicialQuiz.this.dispose();
				Janela.setVisible(true);
			}
			
		});
		btnInformao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInformao.setBounds(41, 242, 115, 23);
		panel.add(btnInformao);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				sobre   Janela = new sobre();
				TelaInicialQuiz.this.dispose();
				Janela.setVisible(true);
			}
			
		});
		btnSobre.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSobre.setBounds(41, 293, 115, 23);
		panel.add(btnSobre);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaInicialQuiz.class.getResource("/img/quizLogo.jpg")));
		lblNewLabel.setBounds(24, 25, 200, 107);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaInicialQuiz.class.getResource("/img/marvelLogo.png")));
		lblNewLabel_1.setBounds(216, 25, 185, 100);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML> <BODY> Pronto para come\u00E7ar a responder um quiz sobre a nossa querid\u00EDssima Marvel? Se ajeita, pega um lanche, um suquinho e vamos responder esse quiz! \r\nAperte \"iniciar\" para come\u00E7ar, os demais bot\u00F5es s\u00E3o inform\u00E1cionais.  </BODY> </HTML>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(216, 143, 236, 200);
		panel.add(lblNewLabel_2);
	}
}
