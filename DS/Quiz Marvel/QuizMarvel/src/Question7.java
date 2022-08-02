import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question7 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question7 frame = new Question7();
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
	public Question7() {
		setTitle("S\u00E9tima Pergunta");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Qual a primeira grande equipe da Marvel criada e qual a que foi ESPECIALMENTE criada para acabar com o Thanos, respectivamente? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(107, 11, 274, 43);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbResposta1 = new JRadioButton("Quarteto Fant\u00E1stico e Strikerforce. ");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta1.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setBounds(6, 231, 197, 23);
		contentPane.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("Vingadores e Guardi\u00F5es da Gal\u00E1xia");
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta2.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setBounds(6, 274, 195, 23);
		contentPane.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("Quarteto Fant\u00E1stico e Guardi\u00F5es da Gal\u00E1xia.");
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta3.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setBounds(208, 231, 239, 23);
		contentPane.add(rdbResposta3);
		
		JRadioButton rdbResposta4 = new JRadioButton("X-Men e Strikeforce.");
		rdbResposta4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta4.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setBounds(208, 274, 239, 23);
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

				if(rdbResposta3.isSelected())
				{
				d.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				d.Erro++;

				}

				Question8 janelinha = new Question8();
				janelinha.setVisible(true);
				Question7.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(159, 312, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question7.class.getResource("/img/logoVingadores1.png")));
		lblNewLabel_1.setBounds(152, 137, 152, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Question7.class.getResource("/img/logoquarteto1.png")));
		lblNewLabel_2.setBounds(315, 58, 110, 108);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Question7.class.getResource("/img/logoXmen1.png")));
		lblNewLabel_3.setBounds(25, 65, 152, 78);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("<HTML> <BODY> N\u00E3o encontrei a logo em png da StrikeForce </BODY> </HTML>");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 9));
		lblNewLabel_4.setBounds(363, 320, 78, 31);
		contentPane.add(lblNewLabel_4);
	}
}
