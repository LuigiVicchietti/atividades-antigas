
import javax.swing.*;



import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;


		public class ExRadio extends JFrame implements ItemListener{
		
		
		//Declaração de Variavel Global//
		double aumento,reajuste,valor;
		
		/*declaração dos componentes*/
		//Agrupar os Radio Button//
		ButtonGroup rd= new ButtonGroup();
		
		//Declaração do Radio Button//
		JRadioButton radio1,radio2,radio3;
		
		//Declaração do Texto//
		JLabel texto;
		
		//Declaração da Caixa de Texto//
		JTextField caixa;
		
		
		//1-construção da janela(super classe)mesmo nome da classe//
		public ExRadio() {
		
		//Titulo da Janela//
		setTitle("Janela Radio");
		
		//Tamanho da minha Janela//
		setSize(400, 480);
		
		// abrir janela centralizado//
		this.setLocationRelativeTo(null);
		
		//Janela com opção de encerrar//
		setDefaultCloseOperation (DISPOSE_ON_CLOSE);
		
		//Retirar a opção de maximizar a Janela//
		setResizable(false);
		
		//Cor de Fundo da Janela//
		getContentPane().setBackground(new Color(255,255,255)) ;
		
		
		
		//2 - Formatação e o Posicionamento dos elementos//
		
		
		//Formatação do texto//
		texto = new JLabel("Digite o valor do salario:");
		
		//Posição do Texto//
		//eixo x,eixo y,largura , altura//
		texto.setBounds(100,100,200,30);
		
		
		
		//Formatação da caixa texto//
		caixa = new JTextField();
		
		//Posicionamento da caixa de texto//
		//eixo x,eixo y,largura , altura//
		caixa.setBounds(100,140, 120,30);
		
		
		
		//Formatação do Radio Button//
		
		radio1 = new JRadioButton("15%");
		
		//Mnemonic - Tecla de Atalho//
		radio1.setMnemonic(KeyEvent.VK_B);
		
		//Começa desabilitado -- falso//
		radio1.setSelected(false);
		
		
		//Posição do Radio Button//
		radio1.setBounds(100,200,220,30);
		
		
		radio2 = new JRadioButton("20%");
		radio2.setMnemonic(KeyEvent.VK_C);
		radio2.setSelected(false);
		radio2.setBounds(100,230,220,30);
		
		
		radio3 = new JRadioButton("30%");
		radio3.setMnemonic(KeyEvent.VK_D);
		radio3.setSelected(false);
		radio3.setBounds(100,260,220,30);
		
		
		//Obrigatorio adicionar radio button dentro do Button Group//
		rd.add(radio1);
		rd.add(radio2);
		rd.add(radio3);
		
		
		//Adicionar os componentes dentro da janela//
		getContentPane().add(texto);
		getContentPane().add(caixa);
		getContentPane().add(radio1);
		getContentPane().add(radio2);
		getContentPane().add(radio3);
		
		
		//Metodo Item Listener - Ouvir o Item Escolhido//
		radio1.addItemListener(this);
		radio2.addItemListener(this);
		radio3.addItemListener(this);
		
		//Tipo De Layout Nulo - Dominio Componentes//
		getContentPane().setLayout(null);
		
		
		}
		
		
		@Override
		public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		
		//Se selecionar o radio button de 15%//
		if(radio1.isSelected()) {
		
		
		//Pegar valor da caixa de texto e jogar em uma variavel//
		valor = Double.parseDouble(caixa.getText());
		
		//variavel para calculo do reajuste de 15%//
		reajuste = valor * 15 /100;
		
		//calculo do salario com reajuste//
		aumento = valor + reajuste;
		
		//mensagem de exibição //
		JOptionPane.showMessageDialog(null,"O valor do salario é R$:"+valor +
		"\nO valor de 15% de reajuste é R$:"+ reajuste+
		"\nO valor do salario com reajuste R$:"+ aumento,
		"Reajuste de 15% no salario",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		if(radio2.isSelected()) {
		
		
		
		valor = Double.parseDouble(caixa.getText());
		
		
		
		reajuste = valor * 20 /100;
		
		aumento = valor + reajuste;
		
		
		JOptionPane.showMessageDialog(null,"O valor do salario é R$:"+valor +
		"\nO valor de 20% de reajuste é R$:"+ reajuste+
		"\nO valor do salario com reajuste R$:"+ aumento,
		"Reajuste de 20% no salario",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(radio3.isSelected()) {
		
		
		valor = Double.parseDouble(caixa.getText());
		
		
		reajuste = valor * 30 /100;
		
		aumento = valor + reajuste;
		
		
		JOptionPane.showMessageDialog(null,"O valor do salario é R$:"+valor +
		"\nO valor de 30% de reajuste é R$:"+ reajuste+
		"\nO valor do salario com reajuste R$:"+ aumento,
		"Reajuste de 30% no salario",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		}
		
		
		
		
		
		
		}