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

public class Question8 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question8 frame = new Question8();
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
	public Question8() {
		setTitle("Oitava Pergunta");
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
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Como no universo h\u00E1 muita injusti\u00E7a e poucos recursos, Thanos tem a meta de balancear o universo, sendo um lugar igualit\u00E1rio; Dividida em 2 partes.  </BODY> </HTML>");
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setBounds(18, 197, 211, 55);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Foi principalmente influenciado pela Morte, pois ele \u00E9 apaixonado por ela, por isso quer exterminar 1/2 do universo; Dividida em 3 partes </BODY> </HTML>");
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setBounds(18, 255, 211, 60);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Ap\u00F3s Tit\u00E3, sua terra natal, ser destruida junto com sua fam\u00EDlia, Thanos jura vingan\u00E7a as entidades mais poderrosas do universo; \u00C9 dividida em 4 partes.  </BODY> </HTML>");
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta3.setBounds(231, 197, 227, 55);
		panel.add(rdbResposta3);
		
		JRadioButton rdbResposta4 = new JRadioButton("<HTML> <BODY> Ap\u00F3s Guerras Secretas, Thanos se impressiona com tamanho poder de Beyonder e vai em buscas das joias para supera-lo e ser o mais poderoso do universo; \u00C9 dividida em 3 partes.  </BODY> </HTML>");
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta4.setBackground(Color.WHITE);
		rdbResposta4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta4.setBounds(225, 255, 239, 60);
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

				Question9 janelinha = new Question9();
				janelinha.setVisible(true);
				Question8.this.dispose();
				
				}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(186, 322, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Qual a REAL raz\u00E3o de Thanos ser obsecado pelas joias do infinito? E quantas partes a saga Guerra Infinita foi dividida?  </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(96, 11, 293, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question8.class.getResource("/img/joiaInfinito.jpg")));
		lblNewLabel_1.setBounds(30, 56, 400, 134);
		panel.add(lblNewLabel_1);
		
	}
}
