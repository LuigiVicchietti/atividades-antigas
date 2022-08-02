import java.util.Scanner;

public class DescontoScanner {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner (System.in);
        double PrecoProduto, PorcentagemDesconto, ResultadoDesconto, ResultadoProduto;
        
        System.out.println("Digite o preço do produto?");
        PrecoProduto = in.nextDouble();
        System.out.println("Digite o desconto (sem a porcentagem):");
        PorcentagemDesconto = in.nextDouble();
        ResultadoDesconto = (PrecoProduto * PorcentagemDesconto) / 100;
        ResultadoProduto = PrecoProduto - ResultadoDesconto;
        System.out.println("O valor do produto com o desconto dado é: R$" + ResultadoDesconto);
        in.close();
    }
}