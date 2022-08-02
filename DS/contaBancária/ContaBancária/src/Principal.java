import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String[] args) {
		
		Conta c1 = new Conta();
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Luigi Vicchietti");
		cliente1.setCpf("111.222.333-64");
		cliente1.setDtNascimento("17/01/1980");
		cliente1.setTelCliente("11948876551");
		
		JOptionPane.showMessageDialog(null, "Conta Bancária");
		
		int Option = 1;
		
		do {
			
			String msg = "1 - Cadastrar Conta "+
			"\n2 - Exibir Conta "+ "\n3 - Depositar e sacar" + "\n0 - Sair";
			
			Option = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			switch (Option) {
			case 1:
				
				JOptionPane.showMessageDialog(null, "Cadastrando a conta bancária");
				c1.setAgencia(JOptionPane.showInputDialog("Qual o número da agência?"));
				c1.setNumero(Double.parseDouble(JOptionPane.showInputDialog("Qual o número da conta?")));
				c1.setCliente(cliente1);
				c1.setSaldo (Double.parseDouble(JOptionPane.showInputDialog("Qual o saldo inicial da conta?")));
				
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Conta Bancária - C1 \nAgência: " + c1.getAgencia() + 
						"\nNúmero: " + c1.getNumero() + "\nTitular: " + c1.getCliente().getNome() + 
						"\nSaldo inicial: " + c1.ExibirSaldo() + "\nValor do limite: " + c1.getLimite());
				
				break;
				
			case 3:
				
				double Valor = (double) c1.ExibirSaldo();
				
				JOptionPane.showMessageDialog(null, "Depositando e sacando");
				
				if (Valor<=500) {
					
				c1.Depositar(100);
				JOptionPane.showMessageDialog(null, "Depósito \nSaldo atual - C1 \nR$ " + c1.ExibirSaldo());
				
				c1.Sacar(700);
				JOptionPane.showMessageDialog(null, "Saque \nSaldo atual - C1 \nR$ " + c1.ExibirSaldo());
				
				c1.Depositar(1000);
				JOptionPane.showMessageDialog(null, "Depósito \nSaldo atual - C1 \nR$ " + c1.ExibirSaldo());
				
				c1.Sacar(850);
				JOptionPane.showMessageDialog(null, "Saque \nSaldo atual - C1 \nR$ " + c1.ExibirSaldo());
			}
				else if (Valor>500) {
				 
					JOptionPane.showMessageDialog(null, "Saldo ultrapassou o limite esperado.");
			}
				
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
