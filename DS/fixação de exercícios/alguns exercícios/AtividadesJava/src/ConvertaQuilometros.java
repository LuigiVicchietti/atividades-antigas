import java.util.Scanner;//
public class ConvertaQuilometros {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //
		double M, Km;
		System.out.println("Digite o valor em metros");
		M = in.nextDouble();
		Km= M/1000;
		System.out.println("O valor em quilometros é em:" + Km);
		in.close();
	}
	

}
