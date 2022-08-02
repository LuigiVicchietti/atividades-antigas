import java.util.Scanner;//
public class Ipvacarro {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//
		double PC, Ipva;
		System.out.println("Digite o valor do carro");
		PC = in.nextDouble();
		Ipva = PC*4/100;
		System.out.println("Seu Ipva é:" + Ipva);
		in.close();
	}

}
