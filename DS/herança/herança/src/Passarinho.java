import javax.swing.JOptionPane;

public class Passarinho {
	
	String nome;
	String cor;
	String ra�a;
	double pre�o;
	
	void PedirInfo() {
		
		nome= JOptionPane.showInputDialog("Qual o nome do passarinho? ");
		cor= JOptionPane.showInputDialog("Qual a cor do passarinho? ");
		ra�a= JOptionPane.showInputDialog("Qual a ra�a do passarinho? ");
		pre�o= Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do passarinho? "));
	}
	
	void Cantar() {
		JOptionPane.showMessageDialog(null,"O passarinho cantou o dia todo no quintal... ");
	}
	
	void Voar() {
		JOptionPane.showMessageDialog(null,"O passarinho voou o dia inteiro... ");
	}
	
	void Comer() {
		JOptionPane.showMessageDialog(null,"O Passarinho estava faminto... ");
	}
	
	void ExibirInfo() {
		JOptionPane.showMessageDialog(null,"Qual o nome do passarinho: " + nome +
	                                ". A Cor do passarinho: " + cor + 
				                    ". A Ra�a do passarinho: " + ra�a + 
				                    ". O Pre�o do passarinho: " + pre�o);
		
	}

}
