import javax.swing.JOptionPane;

public class Cachorro {
	
	String nome;
	String cor;
	String ra�a;
	double pre�o;
	
	void PedirInfo() {
		
		nome= JOptionPane.showInputDialog("Qual o nome do cachorro? ");
		cor= JOptionPane.showInputDialog("Qual a cor do cachorro? ");
		ra�a= JOptionPane.showInputDialog("Qual a ra�a do cachorro? ");
		pre�o= Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do cachorro? "));
	}
	
	void Latir() {
		JOptionPane.showMessageDialog(null,"O cachorro latiu bem alto... ");
	}
	
	void Correr() {
		JOptionPane.showMessageDialog(null,"O cachorro estava correndo no parque... ");
	}
	
	void Pular() {
		JOptionPane.showMessageDialog(null,"O cachorro pulou o dia inteiro... ");
	}
	
	void Comer() {
		JOptionPane.showMessageDialog(null,"O cachorro comeu quando voltou do parque... ");
	}
	
	void ExibirInfo() {
		JOptionPane.showMessageDialog(null,"Qual o nome do cachorro: " + nome +
	                                ". A Cor do cachorro: " + cor + 
				                    ". A Ra�a do cachorro: " + ra�a + 
				                    ". O Pre�o do cachorro: " + pre�o);
		
	}

}
