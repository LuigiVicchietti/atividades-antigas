import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class losangulo extends JFrame {

	private JPanel contentPane;
	private JTextField CxDiagonalMaior;
	private JTextField CxResArea;
	private JTextField CxDiagonalMenor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					losangulo frame = new losangulo();
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
	public losangulo() {
		setTitle("\u00C1rea do Losangulo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 444, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(losangulo.class.getResource("/img/areaLosangulo.png")));
		lblNewLabel.setBounds(139, 11, 160, 110);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Diagonal (+):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(21, 146, 75, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Diagonal (-):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(21, 184, 75, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(275, 146, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Retornar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				telaInicial   Janela = new telaInicial();
				losangulo.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(21, 223, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				CxDiagonalMaior.setText("");
				CxDiagonalMenor.setText("");
				CxResArea.setText("");
				
				CxDiagonalMaior.requestFocus();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(317, 223, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double diagonalMenor, diagonalMaior, calcularArea;
				diagonalMaior = Double.parseDouble(CxDiagonalMaior.getText());
				diagonalMenor = Double.parseDouble(CxDiagonalMenor.getText());
				calcularArea = diagonalMaior * diagonalMenor / 2;
				
				CxResArea.setText(calcularArea.toString());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(170, 223, 89, 23);
		panel.add(btnNewButton_2);
		
		CxDiagonalMaior = new JTextField();
		CxDiagonalMaior.setBounds(106, 144, 86, 20);
		panel.add(CxDiagonalMaior);
		CxDiagonalMaior.setColumns(10);
		
		CxDiagonalMenor = new JTextField();
		CxDiagonalMenor.setBounds(106, 182, 86, 20);
		panel.add(CxDiagonalMenor);
		CxDiagonalMenor.setColumns(10);
		
		CxResArea = new JTextField();
		CxResArea.setEditable(false);
		CxResArea.setBounds(320, 144, 86, 20);
		panel.add(CxResArea);
		CxResArea.setColumns(10);
	}

}
