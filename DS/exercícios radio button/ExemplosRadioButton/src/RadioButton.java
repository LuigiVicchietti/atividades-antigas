import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class RadioButton extends JFrame {

	private JPanel contentPane;
	private JTextField CxSalario;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField CxResultado;
	private JTextField CxAumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setResizable(false);
		setTitle("Exerc\u00EDcio Reajuste");
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
		
		JRadioButton rdbQuinze = new JRadioButton("Reajuste 15%");
		buttonGroup.add(rdbQuinze);
		rdbQuinze.setBackground(Color.WHITE);
		rdbQuinze.setBounds(41, 115, 109, 23);
		panel.add(rdbQuinze);
		
		JRadioButton rdbVinte = new JRadioButton("Reajuste 20%");
		buttonGroup.add(rdbVinte);
		rdbVinte.setBackground(Color.WHITE);
		rdbVinte.setBounds(41, 152, 109, 23);
		panel.add(rdbVinte);
		
		JRadioButton rdbTrinta = new JRadioButton("Reajuste 30%");
		buttonGroup.add(rdbTrinta);
		rdbTrinta.setBackground(Color.WHITE);
		rdbTrinta.setBounds(41, 190, 109, 23);
		panel.add(rdbTrinta);
		
		JLabel lblNewLabel = new JLabel("Sistema de Reajuste (Sal\u00E1rio)");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(133, 2, 186, 62);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o sal\u00E1rio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(53, 65, 109, 29);
		panel.add(lblNewLabel_1);
		
		CxSalario = new JTextField();
		CxSalario.setBounds(161, 71, 94, 20);
		panel.add(CxSalario);
		CxSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					
					if(rdbQuinze.isSelected()) {
						
						Double salario, aumento, novoSalario;
						salario = Double.parseDouble(CxSalario.getText());
						aumento = salario / 100 * 15;
						novoSalario = salario + aumento;
						
						CxAumento.setText(aumento.toString());
						CxResultado.setText(novoSalario.toString());
						
					} else if (rdbVinte.isSelected()) {
						
						Double salario, aumento, novoSalario;
						salario = Double.parseDouble(CxSalario.getText());
						aumento = salario / 100 * 20;
						novoSalario = salario + aumento;
						
						CxAumento.setText(aumento.toString());
						CxResultado.setText(novoSalario.toString());
						
					} else if (rdbTrinta.isSelected()) {
						
						Double salario, aumento, novoSalario;
						salario = Double.parseDouble(CxSalario.getText());
						aumento = salario / 100 * 30;
						novoSalario = salario + aumento;
						
						CxAumento.setText(aumento.toString());
						CxResultado.setText(novoSalario.toString());
						
					} else {
						
						JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada! Por favor selecionar uma dentre as disponíveis.");
					}
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(180, 228, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Sal\u00E1rio Reajustado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(180, 150, 125, 23);
		panel.add(lblNewLabel_2);
		
		CxResultado = new JTextField();
		CxResultado.setBackground(Color.WHITE);
		CxResultado.setEditable(false);
		CxResultado.setBounds(315, 152, 86, 20);
		panel.add(CxResultado);
		CxResultado.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Aumento de:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(180, 115, 125, 23);
		panel.add(lblNewLabel_3);
		
		CxAumento = new JTextField();
		CxAumento.setBackground(Color.WHITE);
		CxAumento.setEditable(false);
		CxAumento.setBounds(315, 116, 86, 20);
		panel.add(CxAumento);
		CxAumento.setColumns(10);
	}
}
