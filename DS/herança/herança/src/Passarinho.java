import javax.swing.JOptionPane;

public class Passarinho {
	
	String nome;
	String cor;
	String raça;
	double preço;
	
	void PedirInfo() {
		
		nome= JOptionPane.showInputDialog("Qual o nome do passarinho? ");
		cor= JOptionPane.showInputDialog("Qual a cor do passarinho? ");
		raça= JOptionPane.showInputDialog("Qual a raça do passarinho? ");
		preço= Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do passarinho? "));
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
				                    ". A Raça do passarinho: " + raça + 
				                    ". O Preço do passarinho: " + preço);
		
	}

}
