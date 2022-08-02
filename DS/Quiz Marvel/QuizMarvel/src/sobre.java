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

public class sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sobre frame = new sobre();
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
	public sobre() {
		setTitle("Sobre o Quiz");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 474, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					TelaInicialQuiz   Janela = new TelaInicialQuiz();
					sobre.this.dispose();;
					Janela.setVisible(true);
			}
			
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(195, 317, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(sobre.class.getResource("/img/etecLogo1.png")));
		lblNewLabel.setBounds(136, 11, 200, 122);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Feito em 23 de setembro de 2021");
		lblNewLabel_1.setBounds(35, 245, 188, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML> <BODY> 2 MTEC - Desenvolvimento de Sistemas </BODY> </HTML>");
		lblNewLabel_2.setBounds(35, 216, 188, 31);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aluno: Luigi \"Lulug\u00E3o\" Vicchietti");
		lblNewLabel_3.setBounds(35, 269, 188, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<HTML> <BODY> Quiz realizado para men\u00E7\u00E3o de notas do terceiro bimestre de 2021 da mat\u00E9ria, do professor Carlos, DS </BODY> </HTML>");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(87, 128, 310, 76);
		panel.add(lblNewLabel_4);
	}

}
