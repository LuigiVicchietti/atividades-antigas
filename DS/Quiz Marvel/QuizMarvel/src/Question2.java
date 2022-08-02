import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question2 frame = new Question2();
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
	public Question2() {
		setTitle("Segunda Quest\u00E3o");
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
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Qual o nome da red She-Hulk e qual sua origem correta? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(80, 11, 317, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question2.class.getResource("/img/redshehulk2.jpg")));
		lblNewLabel_1.setBounds(24, 62, 163, 261);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Jennifer Walters; Ap\u00F3s uma grande absorvis\u00E3o de radia\u00E7\u00E3o Gamma  em uma luta contra o Hulk Vermelho, ela ganha os poderes do Hulk Vermelho por um breve momento. </BODY> </HTML>");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setBounds(225, 47, 243, 61);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Betty Ross, ap\u00F3s sua morte, seu pai, Thadeuss Ross, se prop\u00F5e a revive-la com a ajuda de M.O.D.O.K, mas para isso, ele se transforma no Hulk Vermelho como moeda de troca por M.O.D.O.K. Tempos depois ela seria ressucitada como Red She-Hulk. </BODY> </HTML>");
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setBounds(225, 121, 243, 93);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Edith Banner; M\u00E3e de Banner, ela foi apresentada como Red She-Hulk pela primeira vez em The Incredible Hulk #32 de 2004. Quando revivida para atormentar o psicol\u00F3gico de Banner, ela teve seu DNA mesclado com seu ex marido Thadeuss Ross.</BODY> </HTML>");
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setBounds(225, 224, 243, 93);
		panel.add(rdbResposta3);
		
		JButton btnNewButton = new JButton("Proxima");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				Pontos d = new Pontos();


				if(rdbResposta1.isSelected()==false && rdbResposta2.isSelected()==false && rdbResposta3.isSelected()==false)
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

				Question3 janelinha = new Question3();
				janelinha.setVisible(true);
				Question2.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(195, 331, 89, 23);
		panel.add(btnNewButton);
		
	}

}
