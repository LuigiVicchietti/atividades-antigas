import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class Question5 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question5 frame = new Question5();
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
	public Question5() {
		setTitle("Quinta Pergunta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> De acordo com o ranking de poder da Marvel, escolha a alternativa que os personagens setejam corretamente rankeados na ordem: Peso M\u00E9dio Intermedi\u00E1rio, Peso Pesado Leve e Peso Pesado Itermedi\u00E1rio.   </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(79, 11, 329, 60);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Homem Aranha, Homem de Ferro e Coisa. </BODY> </HTML>");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta1.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setBounds(60, 239, 164, 38);
		contentPane.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Capit\u00E3o, Homem Aranha e Coisa. </BODY> </HTML>");
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta2.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setBounds(60, 280, 153, 38);
		contentPane.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Capit\u00E3o, Homem Arranha, Homem de Ferro. </BODY> </HTML>");
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta3.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setBounds(272, 239, 161, 38);
		contentPane.add(rdbResposta3);
		
		JRadioButton rdbResposta4 = new JRadioButton("<HTML> <BODY> Homem Aranha, Coisa, Homem de Ferro. </BODY> </HTML>");
		rdbResposta4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta4.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta4.setBounds(272, 280, 145, 38);
		contentPane.add(rdbResposta4);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Pontos d = new Pontos();


				if(rdbResposta1.isSelected()==false && rdbResposta2.isSelected()==false && rdbResposta3.isSelected()==false && rdbResposta4.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbResposta4.isSelected())
				{
				d.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				d.Erro++;

				}

				Question6 janelinha = new Question6();
				janelinha.setVisible(true);
				Question5.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(177, 319, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question5.class.getResource("/img/Spiderman1.png")));
		lblNewLabel_1.setBounds(10, 82, 104, 150);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Question5.class.getResource("/img/ironman1.png")));
		lblNewLabel_2.setBounds(119, 82, 78, 150);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Question5.class.getResource("/img/coisa1.png")));
		lblNewLabel_3.setBounds(197, 82, 138, 150);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Question5.class.getResource("/img/capamerica2.jpg")));
		lblNewLabel_4.setBounds(331, 82, 143, 150);
		contentPane.add(lblNewLabel_4);
	}
}
