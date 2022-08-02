import javax.swing.JOptionPane;

public class RodarCadastroCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroCelular CadastroCell1 = new CadastroCelular();
		
		int Option = 1;
		
		do {
			
			String msg = "1 - Cadastrar Celular "+
			"\n2 - Exibir Cadastro "+ "\n0 - Sair";
			
			Option = Integer.parseInt(JOptionPane.showInputDialog(msg));
			
			switch (Option) {
			case 1:
				
				String mdlCell = JOptionPane.showInputDialog("Qual o modelo do celular? ");
				String mCell = JOptionPane.showInputDialog("Qual a marca do celular?");
				double pCell = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do celular?"));
				
				CadastroCell1.CadastrarCelular(mdlCell, mCell, pCell);
				
				break;
				
			case 2:
				
				String Mensagem = CadastroCell1.exibirInfo();
				JOptionPane.showMessageDialog(null, Mensagem);
				
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
