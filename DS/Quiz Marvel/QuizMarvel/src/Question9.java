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
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class Question9 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question9 frame = new Question9();
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
	public Question9() {
		setTitle("Nona Pergunta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 464, 367);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Quando Rick Jones, amigo de Banner, estava prestes a ser atingigo por uma gigantesca explos\u00E3o gamma, Bruce o protege e recebe toda a potencia da bomba. Mais tarde, Banner se torna o Hulk enquanto tentava dormir.  </BODY> </HTML>");
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setBounds(249, 74, 209, 87);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Banner, quando foi atingido por uma gigantesca bomba gamma, foi escolhido \u00E0 herdar o poder de The One Below All, e assim, se tornar a personifica\u00E7\u00E3o do capeta e carregar o fardo de ser um dos mais perigosos personagens do universo. </BODY> </HTML>");
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setBounds(249, 164, 209, 99);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Quando Banner se prop\u00F5e a ser cobaia de seu pr\u00F3prio experimento, recebe grandes quantidades de energia gamma \u00E0 partir de uma m\u00E1quina, assim, se tornando o Hulk e sendo logo em seguida ca\u00E7ado pelo exercito. </BODY> </HTML>");
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setBounds(249, 266, 209, 94);
		panel.add(rdbResposta3);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Pontos d = new Pontos();


				if(rdbResposta1.isSelected()==false && rdbResposta2.isSelected()==false && rdbResposta3.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbResposta2.isSelected())
				{
				d.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				d.Erro++;

				}

				Question10 janelinha = new Question10();
				janelinha.setVisible(true);
				Question9.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(61, 321, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Hulk, al\u00E9m de ser um dos seres mais poderosos da editora, tem uma hist\u00F3ria muito triste e que foi aprofundada ao longo do tempo. Atualmente, qual a origem oficial do Hulk?  </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(63, 11, 333, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question9.class.getResource("/img/hulkImortal1.jpg")));
		lblNewLabel_1.setBounds(10, 85, 233, 225);
		panel.add(lblNewLabel_1);
	}
}
