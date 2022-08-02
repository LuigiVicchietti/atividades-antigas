import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaInicial frame = new telaInicial();
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
	public telaInicial() {
		setResizable(false);
		setTitle("Figuras Geom\u00E9tricas");
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
		
		JButton btnNewButton = new JButton("\u00C1rea de Quadrado");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				quadrado   Janela = new quadrado();
				telaInicial.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(24, 32, 153, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u00C1rea de Ret\u00E2ngulo");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				retangulo   Janela = new retangulo();
				telaInicial.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(24, 124, 153, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u00C1rea de Tri\u00E2ngulo");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				triangulo  Janela = new triangulo();
				telaInicial.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(24, 207, 153, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00C1rea de Losangulo");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				losangulo   Janela = new losangulo();
				telaInicial.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(251, 125, 169, 22);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u00C1rea de Paralelogramo");
		btnNewButton_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				paralelogramo   Janela = new paralelogramo();
				telaInicial.this.dispose();
				Janela.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(251, 33, 169, 22);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(telaInicial.class.getResource("/img/imgFiguras.png")));
		lblNewLabel.setBounds(205, 170, 229, 90);
		panel.add(lblNewLabel);
	}
}
