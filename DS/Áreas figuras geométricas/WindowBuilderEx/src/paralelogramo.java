import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class paralelogramo extends JFrame {

	private JPanel contentPane;
	private JTextField CxResArea;
	private JTextField CxBase;
	private JTextField CxAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paralelogramo frame = new paralelogramo();
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
	public paralelogramo() {
		setTitle("\u00C1rea do Paralelogramo");
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(paralelogramo.class.getResource("/img/areaParalelogramo.jpg")));
		lblNewLabel.setBounds(137, 11, 162, 98);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Base:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(35, 140, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 182, 46, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Retornar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				telaInicial   Janela = new telaInicial();
				paralelogramo.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(35, 222, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Double baseParalelogramo, alturaParalelogramo, calcularArea;
				baseParalelogramo = Double.parseDouble(CxBase.getText());
				alturaParalelogramo = Double.parseDouble(CxAltura.getText());
				calcularArea = baseParalelogramo * alturaParalelogramo;
				
				CxResArea.setText(calcularArea.toString());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(174, 222, 89, 23);
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
		btnNewButton_2.setBounds(313, 222, 89, 23);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u00C1rea:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(253, 141, 46, 14);
		panel.add(lblNewLabel_3);
		
		CxResArea = new JTextField();
		CxResArea.setEditable(false);
		CxResArea.setBounds(301, 140, 86, 20);
		panel.add(CxResArea);
		CxResArea.setColumns(10);
		
		CxBase = new JTextField();
		CxBase.setBounds(81, 138, 86, 20);
		panel.add(CxBase);
		CxBase.setColumns(10);
		
		CxAltura = new JTextField();
		CxAltura.setBounds(81, 180, 86, 20);
		panel.add(CxAltura);
		CxAltura.setColumns(10);
	}

}
