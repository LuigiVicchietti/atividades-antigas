import javax.swing.JOptionPane;

public class CadastroCelular {
	
	String modelo;
	String marca;
	double preco;
	
	public void CadastrarCelular (String mdlCell, String mCell, double pCell) {
		
		this.modelo = mdlCell;
		this.marca = mCell;
		this.preco = pCell;
		
		JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
		
	}
	
	public String exibirInfo() {
		
		String info = "Modelo do celular: " + this.modelo +
	                  "."+ "\n Marca do celular: " + this.marca + 
				      "."+ "\n O Preço do celular: " + this.preco;
		
		return info;
	
	}

}
