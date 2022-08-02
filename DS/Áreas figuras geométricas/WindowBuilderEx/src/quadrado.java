import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quadrado extends JFrame {

	private JPanel contentPane;
	private JTextField CxLados;
	private JTextField CxResArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quadrado frame = new quadrado();
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
	public quadrado() {
		setResizable(false);
		setTitle("\u00C1rea do Quadrado");
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(quadrado.class.getResource("/img/areaQuadrado.png")));
		lblNewLabel.setBounds(136, 26, 160, 72);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lado:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(23, 128, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00C1rea:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(23, 167, 46, 14);
		panel.add(lblNewLabel_2);
		
		CxLados = new JTextField();
		CxLados.setBounds(79, 126, 86, 20);
		panel.add(CxLados);
		CxLados.setColumns(10);
		
		CxResArea = new JTextField();
		CxResArea.setEditable(false);
		CxResArea.setBounds(79, 165, 86, 20);
		panel.add(CxResArea);
		CxResArea.setColumns(10);
		
		JButton btnNewButton = new JButton("Retornar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				telaInicial   Janela = new telaInicial();
				quadrado.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(36, 226, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double ladoQuadrado, calcularArea;
				ladoQuadrado = Double.parseDouble(CxLados.getText());
				calcularArea = ladoQuadrado * ladoQuadrado;
				
				CxResArea.setText(calcularArea.toString());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(176, 226, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				CxLados.setText("");
				CxResArea.setText("");
				
				CxLados.requestFocus();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(318, 226, 89, 23);
		panel.add(btnNewButton_2);
	}
}
