import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question1 frame = new Question1();
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
	public Question1() {
		setTitle("Primeira Quest\u00E3o");
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
		
		JLabel lblNewLabel = new JLabel("<HTML> <BODY> Qual o VERDADEIRO nome do Wolverine? </BODY> </HTML>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(118, 11, 241, 52);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					TelaInicialQuiz   Janela = new TelaInicialQuiz();
					Question1.this.dispose();;
					Janela.setVisible(true);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(118, 324, 89, 23);
		panel.add(btnNewButton);
		
		JRadioButton rdbResposta2 = new JRadioButton("Logan Richard");
		buttonGroup.add(rdbResposta2);
		rdbResposta2.setBackground(Color.WHITE);
		rdbResposta2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbResposta2.setBounds(73, 277, 109, 23);
		panel.add(rdbResposta2);
		
		JRadioButton rdbResposta3 = new JRadioButton("Logan Howllet");
		rdbResposta3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonGroup.add(rdbResposta3);
		rdbResposta3.setBackground(Color.WHITE);
		rdbResposta3.setBounds(270, 235, 109, 23);
		panel.add(rdbResposta3);
		
		JRadioButton rdbResposta4 = new JRadioButton("James Howllet");
		rdbResposta4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonGroup.add(rdbResposta4);
		rdbResposta4.setBackground(Color.WHITE);
		rdbResposta4.setBounds(270, 277, 109, 23);
		panel.add(rdbResposta4);
		
		JRadioButton rdbResposta1 = new JRadioButton("Marcus Jackman");
		rdbResposta1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonGroup.add(rdbResposta1);
		rdbResposta1.setBackground(Color.WHITE);
		rdbResposta1.setBounds(73, 235, 109, 23);
		panel.add(rdbResposta1);
		
		JButton btnNewButton_1 = new JButton("Proxima");
		btnNewButton_1.addActionListener(new ActionListener() {
			
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

				Question2 janelinha = new Question2();
				janelinha.setVisible(true);
				Question1.this.dispose();


				}
				
					
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(270, 324, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Question1.class.getResource("/img/wolverine.png")));
		lblNewLabel_1.setBounds(118, 40, 214, 218);
		panel.add(lblNewLabel_1);
	}
}
