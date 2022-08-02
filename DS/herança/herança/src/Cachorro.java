import javax.swing.JOptionPane;

public class Cachorro {
	
	String nome;
	String cor;
	String raça;
	double preço;
	
	void PedirInfo() {
		
		nome= JOptionPane.showInputDialog("Qual o nome do cachorro? ");
		cor= JOptionPane.showInputDialog("Qual a cor do cachorro? ");
		raça= JOptionPane.showInputDialog("Qual a raça do cachorro? ");
		preço= Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do cachorro? "));
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
				                    ". A Raça do cachorro: " + raça + 
				                    ". O Preço do cachorro: " + preço);
		
	}

}
