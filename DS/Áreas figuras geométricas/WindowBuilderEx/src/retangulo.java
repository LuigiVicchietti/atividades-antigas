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
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class retangulo extends JFrame {

	private JPanel contentPane;
	private JTextField CxBase;
	private JTextField CxResArea;
	private JTextField CxAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retangulo frame = new retangulo();
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
	public retangulo() {
		setTitle("\u00C1rea de Ret\u00E2ngulo");
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
		lblNewLabel.setIcon(new ImageIcon(retangulo.class.getResource("/img/areaRetangulo.png")));
		lblNewLabel.setBounds(134, 11, 160, 118);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Base:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(41, 146, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura:\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(41, 187, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(246, 146, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Retornar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				telaInicial   Janela = new telaInicial();
				retangulo.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(41, 223, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				CxBase.setText("");
				CxAltura.setText("");
				CxResArea.setText("");
				
				CxBase.requestFocus();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(316, 223, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double baseRetangulo, alturaRetangulo, calcularArea;
				baseRetangulo = Double.parseDouble(CxBase.getText());
				alturaRetangulo = Double.parseDouble(CxAltura.getText());
				calcularArea = baseRetangulo * alturaRetangulo;
				
				CxResArea.setText(calcularArea.toString());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(179, 223, 89, 23);
		panel.add(btnNewButton_2);
		
		CxBase = new JTextField();
		CxBase.setBounds(92, 140, 86, 20);
		panel.add(CxBase);
		CxBase.setColumns(10);
		
		CxResArea = new JTextField();
		CxResArea.setEditable(false);
		CxResArea.setBounds(298, 144, 86, 20);
		panel.add(CxResArea);
		CxResArea.setColumns(10);
		
		CxAltura = new JTextField();
		CxAltura.setBounds(92, 185, 86, 20);
		panel.add(CxAltura);
		CxAltura.setColumns(10);
	}

}
