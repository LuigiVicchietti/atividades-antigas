import javax.swing.JOptionPane;

	public class ExercicioDesconto {

	public static void main(String[] args) {
		
		Double PrecoProduto;
		Double PorcentagemDesconto;
		Double ResultadoDesconto;
		Double ResultadoProduto;
		
	    PrecoProduto = (double) Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o preço do produto:"));
		PorcentagemDesconto = (double) Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o desconto (Sem a porcentagem):"));
		
		ResultadoDesconto= PrecoProduto * PorcentagemDesconto / 100;
		ResultadoProduto= PrecoProduto - ResultadoDesconto;
		
		JOptionPane.showMessageDialog(null, "O preço com desconto será : R$" + ResultadoProduto);
	}
}