import javax.swing.JOptionPane;

public class Bola {
	
	String marca;
	String cor;
	String tamanho;
	double pre�o;
	
	void PedirInfo() {
		
		marca= JOptionPane.showInputDialog("Qual a marca da bola? ");
		cor= JOptionPane.showInputDialog("Qual a cor da bola? ");
		tamanho= JOptionPane.showInputDialog("Qual o tamanho da bola? ");
		pre�o= Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o da bola? "));
	}
	
	void Kikar() {
		JOptionPane.showMessageDialog(null,"A bola kika bem alto... ");
	}
	
	void Rolar() {
		JOptionPane.showMessageDialog(null,"A bola rolou muito nas partidas de futebol... ");
	}
	
	void Murchar() {
		JOptionPane.showMessageDialog(null,"Depois de dia inteiro a bola muchou... ");
	}
	
	
	void ExibirInfo() {
		JOptionPane.showMessageDialog(null,"Qual a marca da bola: " + marca +
	                                ". A Cor da bola: " + cor + 
				                    ". O Tamanho da bola: " + tamanho + 
				                    ". O Pre�o da bola: " + pre�o);
		
	}

}
