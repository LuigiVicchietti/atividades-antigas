import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class TelaCarregamento extends JFrame {

	private JPanel contentPane;
	private JLabel texto;
	private JLabel percent;
	private JProgressBar barra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCarregamento frame = new TelaCarregamento();
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
	public TelaCarregamento() {
		setTitle("Tela de carregamento");
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
		
		texto = new JLabel(".");
		texto.setBounds(40, 30, 99, 14);
		panel.add(texto);
		
	    percent = new JLabel(".");
		percent.setBounds(382, 30, 46, 14);
		panel.add(percent);
		
		barra = new JProgressBar();
		barra.setBackground(Color.BLUE);
		barra.setForeground(Color.WHITE);
		barra.setBounds(0, 302, 474, 32);
		panel.add(barra);
		
		
		new Thread(new carregar()).start();
		
	}
	
	
	//implementar a Thread //
	//criar o metodo para percorrer de 0 á 100//
	public class carregar implements Runnable{
	//metodo para percorrer a barra de progresso//
	public void run (){

	//laço de repetição para percorrer progresso//
	for ( int i =0 ; i < 101 ; i ++ )

	 {
	/*tratamento de erro chamado try--cath--
	para o caso da barra não inicializar*/
	try {

	/* Método Sleep em milisegundos– Tempo de Vida da Thread */
	Thread.sleep(100) ;
	/* Chamar a progressive Bar e adicionar o contador para
	* ir de 1 até 100. ( variavel do contador) */

	 barra.setValue( i ) ;
	/* Mensagem no JLABEL com if e pegando informaçoes
	* da progressive Bar */
	if (barra.getValue() <= 50 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Informações.....");
	percent.setText(i + "%");
	}
	else if (barra.getValue() <= 80 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Telas.....");
	percent.setText(i + "%");
	}
	else if (barra.getValue() <= 90 )
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Carregando Quiz.....");
	percent.setText(i + "%");
	}
	else
	{
	/* Setar Mensagem do JLABEL de acordo com progressive Bar */
	texto.setText("Iniciar Quiz.....");
	percent.setText(i + "%");

	}

	//cath -- Tratamento de erro//
	} catch (Exception erro) {

	 JOptionPane.showMessageDialog(null,erro);
	}
	}

	 //chamar proxima tela apos as 2 chaves do catch//
	TelaInicialQuiz tela= new TelaInicialQuiz();//constroi a tela//
	TelaCarregamento.this.dispose();//fecha a tela atual//
	tela.setVisible(true);//deixa visivel*/

	}

	 }
	
}
	
	
	
