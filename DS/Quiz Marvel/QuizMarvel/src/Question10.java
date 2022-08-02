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

public class Question10 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question10 frame = new Question10();
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
	public Question10() {
		setTitle("D\u00E9cima Pergunta");
		setResizable(false);
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
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Uma das sagas atuais da Marvel, Deus Knull, Knull, Deus dos simbiontes, vem acabar com a terra para propagar a escurid\u00E3o em todo o universo. No final desta saga, como o antagonista \u00E9 derrotado? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(75, 11, 325, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question10.class.getResource("/img/deusKnull.jpg")));
		lblNewLabel_1.setBounds(269, 69, 164, 238);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Ap\u00F3s Knull matar o filho de Eddie Brock, Brock renasce todo poderoso em busca de vingar seu filho e seus companheiros simbiontes atormentados. Brock funde a prancha/espada do surfista prateado e o Mjolnir de Thor para derrota-lo. </BODY> </HTML>");
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setBounds(23, 86, 240, 75);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Surfista, em um ato heroico, se funde com Eddie Brock e luta at\u00E9 a morte com Knull at\u00E9 conseguir derrota-lo jogando-o no sol. Brock sobrevive herdando os poderes do surfista. </BODY> </HTML>");
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setBounds(23, 164, 240, 53);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Eddie \u00E9 revivido pelo Doutor Estranho e ganha um novo poder, controlar v\u00E1rios simbiontes ao mesmo tempo. Eddie controla o exercito de Knull contra ele e tamb\u00E9m, todos os her\u00F3is v\u00E3o para cima de Knull, derrotando-o. </BODY> </HTML>");
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setBounds(23, 229, 240, 68);
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

				resultadoQuiz janelinha = new resultadoQuiz();
				janelinha.setVisible(true);
				Question10.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(185, 317, 89, 23);
		panel.add(btnNewButton);
		
	}
}
