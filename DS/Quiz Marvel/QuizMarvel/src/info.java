import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					info frame = new info();
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
	public info() {
		setTitle("Informa\u00E7\u00F5es sobre o Quiz");
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
				info.this.dispose();;
				Janela.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(194, 326, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Quiz \u00E9 do tema da Marvel Comics!  Neste quiz, voc\u00EA ir\u00E1 responder DEZ quest\u00F5es sobre o universo 616 da Marvel Comics. As quest\u00F5es ser\u00E3o de n\u00EDveis intermedi\u00E1rios e dif\u00EDceis. Ap\u00F3s a primeira pergunta respondida, voc\u00EA n\u00E3o poder\u00E1 voltar \u00E0 home! </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(83, 76, 342, 77);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informa\u00E7\u00F5es sobre o Quiz");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(155, 27, 174, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML> <BODY> Lembrando: As quest\u00F5es ser\u00E3o, muitas vezes, do universo de HQ\u00B4S da editora. Caso voc\u00EA, que assistiu o MCU todo, virado no Jiraya, quiser tentar responder as quest\u00F5es, voc\u00EA pode (claro), p\u00F3rem, n\u00E3o ser\u00E1 t\u00E3o f\u00E1cil. </BODY> </HTML>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(83, 164, 342, 77);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Boa Sorte!");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(204, 265, 79, 23);
		panel.add(lblNewLabel_3);
	}

}
