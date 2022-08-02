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
			
			JOptionPane.showMessageDialog(null, "Atividade Sobrecarga de Métodos");
			
			String msg = "1 - Inserir Inforamações "+
			"\n2 - Exibir Informações "+ "\n3 - Descobrir Salário reajustado " +
					"\n4 - Descobrir Salário final " + "\n0 - Sair";
			
			Option = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			switch (Option) {
			case 1:
				
			p.setcliente(JOptionPane.showInputDialog("Digite o nome do cliente:"));
			p.settrabalho(JOptionPane.showInputDialog("Digite do que o cliente trabalha:"));
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Informações: \nCliente: " + p.getcliente() +
				"\nTrabalho: " + p.gettrabalho());
				
				break;
				
			case 3: 
				
			Salario1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do cliente: "));
		
			if (Salario1 >= 1500) {
				reajuste = 5;
			} 
			else {
				reajuste = 10;
			}
		
			JOptionPane.showMessageDialog(null, "O reajuste é de: " + reajuste + " , logo, será de " + Salario1 * reajuste / 100);
		
			total1 = Salario1 + Salario1 * reajuste / 100;
		
			JOptionPane.showMessageDialog(null,"O salário com reajuste é de " + s.Salario(Salario1, reajuste, total1));
		
				break;
				
			case 4: 
				
				Salario2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do cliente: "));
				
				if (Salario2 >= 1500) {
					REAJUSTE = 5;
					inss = 10;
				} 
				else {
					REAJUSTE = 10;
					inss = 6;
				}
			
				total2 = Salario2 + Salario2 * REAJUSTE / 100;
			
				JOptionPane.showMessageDialog(null, "O inss é de: " + inss + " , logo, o inss é de: " + Salario2 * inss / 100);
			
				total3 = total2 - Salario2 * inss / 100 ;
			
				JOptionPane.showMessageDialog(null,"O salário final é de " + s.Salario(Salario2, REAJUSTE, total2, inss, total3));
			
					break;
				
			case 0:
				
				JOptionPane.showMessageDialog(null, "Até!");
				
				break;
				
				default:
					
					JOptionPane.showMessageDialog(null, "Opção Invalida!");
				
			}
			
		} 
		
		while (Option!=0);
	}
		
}
