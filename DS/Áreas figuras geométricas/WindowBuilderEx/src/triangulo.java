import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class triangulo extends JFrame {

	private JPanel contentPane;
	private JTextField CxBase;
	private JTextField CxAltura;
	private JTextField CxResArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					triangulo frame = new triangulo();
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
	public triangulo() {
		setResizable(false);
		setTitle("\u00C1rea do Tri\u00E2ngulo");
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
		lblNewLabel.setIcon(new ImageIcon(triangulo.class.getResource("/img/areaTriangulo.png")));
		lblNewLabel.setBounds(138, 11, 160, 130);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Base:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(39, 156, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(39, 189, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(252, 156, 46, 14);
		panel.add(lblNewLabel_3);
		
		CxBase = new JTextField();
		CxBase.setBounds(95, 154, 86, 20);
		panel.add(CxBase);
		CxBase.setColumns(10);
		
		CxAltura = new JTextField();
		CxAltura.setBounds(95, 187, 86, 20);
		panel.add(CxAltura);
		CxAltura.setColumns(10);
		
		CxResArea = new JTextField();
		CxResArea.setEditable(false);
		CxResArea.setBounds(304, 154, 86, 20);
		panel.add(CxResArea);
		CxResArea.setColumns(10);
		
		JButton btnNewButton = new JButton("Retornar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				telaInicial   Janela = new telaInicial();
				triangulo.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(39, 226, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double baseTriangulo, alturaTriangulo, calcularArea;
				baseTriangulo = Double.parseDouble(CxBase.getText());
				alturaTriangulo = Double.parseDouble(CxAltura.getText());
				calcularArea = baseTriangulo * alturaTriangulo / 2;
				
				CxResArea.setText(calcularArea.toString());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(177, 226, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Limpar");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				CxBase.setText("");
				CxAltura.setText("");
				CxResArea.setText("");
				
				CxBase.requestFocus();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(319, 226, 89, 23);
		panel.add(btnNewButton_2);
	}

}
