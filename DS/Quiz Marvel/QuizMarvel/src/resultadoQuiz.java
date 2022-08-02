import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class resultadoQuiz extends JFrame {
	
	//Chamar classe Pontos //
	//Construir objeto --coloquei a letra d//
	Pontos d = new Pontos();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					resultadoQuiz frame = new resultadoQuiz();
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
	public resultadoQuiz() {
		setTitle("Resultado do Quiz");
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
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TelaInicialQuiz   Janela = new TelaInicialQuiz();
				resultadoQuiz.this.dispose();;
				Janela.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(184, 310, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Parab\u00E9ns! Voc\u00EA completou o Quiz!</BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(101, 11, 265, 55);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<HTML> <BODY> Seu resultado foi de:  </BODY> </HTML>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(166, 77, 131, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ACERTOS!!!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(121, 132, 103, 35);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<HTML> <BODY> E ai, como foi seu desempenho no quiz? Otimo, Bom, Ruim ou P\u00E9ssimo? Relaxa, independente do resultado, lembre-se que esse quiz \u00E9 somente um passa-tempo.  </BODY> </HTML>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(90, 199, 276, 79);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("% ACERTOS!!!");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(332, 132, 122, 35);
		panel.add(lblNewLabel_4);
		
		JLabel acerto = new JLabel(".");
		acerto.setBounds(22, 132, 89, 48);
		panel.add(acerto);
		
		JLabel porAcerto = new JLabel(".");
		porAcerto.setBounds(234, 132, 88, 48);
		panel.add(porAcerto);
		
		double porcentagemAcertos;

		porcentagemAcertos = 100 * d.getAcertos() / 10;
		
		//Exibir a porcentagem de erro e acerto//
		porAcerto.setText(String.valueOf(porcentagemAcertos));
		
		//Exibir a quantidade de acerto e erro//
		acerto.setText(String.valueOf(d.getAcertos()));
		
	}
}
