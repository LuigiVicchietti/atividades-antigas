import java.util.Scanner; //
public class AntecessorSucessor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ni1, niS, niA;
		System.out.println("Digite o inteiro");
		ni1 = leia.nextInt();
		niS = ni1+1;
		niA = ni1-1;
		System.out.println("Seu antecessor é:" + niA);
		System.out.println("Seu sucessor é:" + niS);
		leia.close();
	}

}
