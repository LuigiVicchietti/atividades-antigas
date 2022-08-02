import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question6 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question6 frame = new Question6();
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
	public Question6() {
		setResizable(false);
		setTitle("Sexta Quest\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> O Doutor Destino, al\u00E9m de mal\u00E9fico e mago, \u00E9 um g\u00EAnio \u00E0 altura de Reed Richards. Onde Victor Von Doom estudou e quem era seus parceiros de estudo? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(83, 11, 307, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question6.class.getResource("/img/doctordoom1.png")));
		lblNewLabel_1.setBounds(23, 60, 139, 307);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY>  Universidade Estadual em Hegeman; Seus parceiros na universidade eram Ben Grim e Reed Richards, vulgos Coisa e Sr.Fant\u00E1stico.  </BODY> </HTML>");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta1.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setBounds(210, 60, 219, 65);
		contentPane.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Universidade de Harvard; Seus parceiros foram Tony Stark, no come\u00E7o dos estudos, e Hank Pym, no final. </BODY> </HTML>");
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta2.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setBounds(210, 130, 219, 48);
		contentPane.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> MIT (Instituto de Tecnologia de Massachusetts); Seus parceiros foram Bruce Banner e Hank Pym. </BODY> </HTML>");
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta3.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setBounds(210, 194, 219, 46);
		contentPane.add(rdbResposta3);
		
		JRadioButton rdbResposta4 = new JRadioButton("<HTML> <BODY> Universidade de Harvard; Seus parceiros foram Reed Richards e Hank Pym. </BODY> </HTML>");
		rdbResposta4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta4.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta4.setBounds(210, 258, 219, 48);
		contentPane.add(rdbResposta4);
		
		JButton btnNewButton = new JButton("Pr\u00F3ximo");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Pontos d = new Pontos();


				if(rdbResposta1.isSelected()==false && rdbResposta2.isSelected()==false && rdbResposta3.isSelected()==false && rdbResposta4.isSelected()==false)
				{
				JOptionPane.showMessageDialog(null,"Escolha uma opção");


				}
				else {

				if(rdbResposta1.isSelected())
				{
				d.Acerto++;

				}
				//Senão escolheu opção incorreta//
				//acumular um erro//

				else
				{

				d.Erro++;

				}

				Question7 janelinha = new Question7();
				janelinha.setVisible(true);
				Question6.this.dispose();
				
			}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(190, 330, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
