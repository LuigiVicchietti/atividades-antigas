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
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question3 frame = new Question3();
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
	public Question3() {
		setResizable(false);
		setTitle("Terceira Quest\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(-13, 0, 488, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Qual o principal motivo de ocorrer a saga Xmen VS Vingadores e qual dos personagens foram afetados com os acontecimentos? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(67, 11, 349, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question3.class.getResource("/img/xmenVSavengers2.jpg")));
		lblNewLabel_1.setBounds(100, 53, 278, 152);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbResposta1 = new JRadioButton("<HTML> <BODY> Com a morte de Jean Grey, a entidade F\u00EAnix vem a terra possuir Hope Summers, p\u00F3rem, a entidade tr\u00E1s uma esperan\u00E7a aos Xmen de fazer sua ra\u00E7a prosperar novamente, possuindo, Collossus, Magia, Emma Watson, Ciclop e Namor.  </BODY> </HTML>");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta1.setBounds(16, 201, 247, 75);
		panel.add(rdbResposta1);
		
		JRadioButton rdbResposta3 = new JRadioButton("<HTML> <BODY> Com o final de Guerra Civil 1, os mutantes revoltados, com as guerras ideol\u00F3gicas de Stark e Roger, Wolverine, Ciclop, Emma Watson e Tempestade decidem se juntar com Jean Grey para tornar a legi\u00E3o de her\u00F3is unida novamente, mas isso n\u00E3o ocorreu bem.</BODY> </HTML>");
		rdbResposta3.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setBounds(265, 212, 213, 99);
		panel.add(rdbResposta3);
		
		JRadioButton rdbResposta2 = new JRadioButton("<HTML> <BODY> Com a Feiticeira Escarlate devastada ap\u00F3s Dinastia M, os Vingadores Capit\u00E3o Am\u00E9rica, Stark, Ant-Man e Thor se juntam para reviver a Jean Grey em busca do repovoamento da ra\u00E7a mutante, que em contra partida, os xmen queriam a Jean viva para matar a Feiticeira. </BODY> </HTML>");
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setVerticalAlignment(SwingConstants.TOP);
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbResposta2.setBounds(16, 269, 237, 80);
		panel.add(rdbResposta2);
		
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

				Question4 janelinha = new Question4();
				janelinha.setVisible(true);
				Question3.this.dispose();
				
				}
				
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(327, 326, 89, 23);
		panel.add(btnNewButton);
	}
}
