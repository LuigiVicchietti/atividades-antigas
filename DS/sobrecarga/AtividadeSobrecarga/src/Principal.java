import javax.swing.JOptionPane;

public class Principal {
	
	private String cliente;
	private String trabalho;
	
	Principal() {
		this.cliente = cliente;
		this.trabalho = trabalho;
	}
	
	public String getcliente() {
		return cliente; 
	}
	
	public void setcliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String gettrabalho() {
		return trabalho; 
	}
	
	public void settrabalho(String trabalho) {
		this.trabalho = trabalho;
	}
	
	public static void main(String[] args) {
		
		int Salario1, reajuste, total1;
		double Salario2, REAJUSTE, total2, inss, total3;
		
		int Option = 1;
		
		Principal p = new Principal ();
		Salario s = new Salario();
		
		do {
			
			JOptionPane.showMessageDialog(null, "Atividade Sobrecarga de M�todos");
			
			String msg = "1 - Inserir Inforama��es "+
			"\n2 - Exibir Informa��es "+ "\n3 - Descobrir Sal�rio reajustado " +
					"\n4 - Descobrir Sal�rio final " + "\n0 - Sair";
			
			Option = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			switch (Option) {
			case 1:
				
			p.setcliente(JOptionPane.showInputDialog("Digite o nome do cliente:"));
			p.settrabalho(JOptionPane.showInputDialog("Digite do que o cliente trabalha:"));
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Informa��es: \nCliente: " + p.getcliente() +
				"\nTrabalho: " + p.gettrabalho());
				
				break;
				
			case 3: 
				
			Salario1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o sal�rio do cliente: "));
		
			if (Salario1 >= 1500) {
				reajuste = 5;
			} 
			else {
				reajuste = 10;
			}
		
			JOptionPane.showMessageDialog(null, "O reajuste � de: " + reajuste + " , logo, ser� de " + Salario1 * reajuste / 100);
		
			total1 = Salario1 + Salario1 * reajuste / 100;
		
			JOptionPane.showMessageDialog(null,"O sal�rio com reajuste � de " + s.Salario(Salario1, reajuste, total1));
		
				break;
				
			case 4: 
				
				Salario2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o sal�rio do cliente: "));
				
				if (Salario2 >= 1500) {
					REAJUSTE = 5;
					inss = 10;
				} 
				else {
					REAJUSTE = 10;
					inss = 6;
				}
			
				total2 = Salario2 + Salario2 * REAJUSTE / 100;
			
				JOptionPane.showMessageDialog(null, "O inss � de: " + inss + " , logo, o inss � de: " + Salario2 * inss / 100);
			
				total3 = total2 - Salario2 * inss / 100 ;
			
				JOptionPane.showMessageDialog(null,"O sal�rio final � de " + s.Salario(Salario2, REAJUSTE, total2, inss, total3));
			
					break;
				
			case 0:
				
				JOptionPane.showMessageDialog(null, "At�!");
				
				break;
				
				default:
					
					JOptionPane.showMessageDialog(null, "Op��o Invalida!");
				
			}
			
		} 
		
		while (Option!=0);
	}
		
}
