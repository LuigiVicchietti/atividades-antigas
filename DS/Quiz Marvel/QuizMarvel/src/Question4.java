import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question4 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question4 frame = new Question4();
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
	public Question4() {
		setTitle("Quarta Pergunta");
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
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Na primeira Guerras Secretas, existia um personagem cujo o poder era comparado \u00E0 entidades e que foi o principal responsavel pelo arco, que reuniu her\u00F3is e vil\u00F5es do universo. Quem \u00E9 ele?  </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(59, 16, 374, 52);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question4.class.getResource("/img/guerrassecretacapa.png")));
		lblNewLabel_1.setBounds(40, 79, 400, 138);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbResposta3 = new JRadioButton("Galactus");
		rdbResposta3.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setBounds(286, 240, 109, 23);
		panel.add(rdbResposta3);
		
		JRadioButton rdbResposta2 = new JRadioButton("Beyonder");
		rdbResposta2.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setBounds(59, 271, 109, 23);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta1 = new JRadioButton("Doutor Estranho (Era de ouro)");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta1.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setBounds(59, 240, 171, 23);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta4 = new JRadioButton("Vigia");
		rdbResposta4.setBackground(Color.WHITE);
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setBounds(286, 271, 109, 23);
		panel.add(rdbResposta4);
		
		JButton btnNewButton = new JButton("Pr\u00F3xima");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Pontos d = new Pontos();


				if(rdbResposta1.isSelected()==false && rdbResposta2.isSelected()==false && rdbResposta3.isSelected()==false && rdbResposta4.isSelected()==false)
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

				Question5 janelinha = new Question5();
				janelinha.setVisible(true);
				Question4.this.dispose();
				
				}
				
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(192, 324, 89, 23);
		panel.add(btnNewButton);
		
	}
}
