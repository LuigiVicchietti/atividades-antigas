import java.util.Scanner; // 
public class SomaDosInteirosAoQuadrado {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);// leia, ler, in
		int ni1, ni2, ni3, ni1Quadrado, ni2Quadrado, 
		ni3Quadrado, soma; //declarei as variaveis
		System.out.println("Digite o primeiro valor");
		ni1 = leia.nextInt(); // leia ni1
		System.out.println("Digite o segundo valor");
		ni2 = leia.nextInt() ;
		System.out.println("Digite o terceiro valor");
		ni3 = leia.nextInt();
		ni1Quadrado = ni1*ni1;
		ni2Quadrado = ni2*ni2;
		ni3Quadrado = ni3*ni3;
		soma = ni1Quadrado+ni2Quadrado+ni3Quadrado;
		System.out.println("Soma dos inteiros ao quadrado é:" + soma);
		leia.close();
	}

}
