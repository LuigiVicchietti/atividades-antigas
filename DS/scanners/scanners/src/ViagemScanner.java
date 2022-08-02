import java.util.Scanner;

public class ViagemScanner {
public static void main(String[] args) {
		
	    Scanner in = new Scanner (System.in);
		int NomeDestino;
		int QntdDias;
		
		System.out.println("Qual destino você deseja ir?:");
		NomeDestino = in.nextInt();
		if (NomeDestino == 1){
			System.out.println("Quantos dias você ficara por lá?:");
			QntdDias = in.nextInt();
			if (QntdDias>=2 && QntdDias<=5) {
				System.out.println("Você irá pagar R$240 reais por dia");
			}
				else if (QntdDias>=6 && QntdDias<=10) {
					System.out.println("Você irá pagar R$350 reais por dia");
				}
				else if (QntdDias>=11) {
					System.out.println("Você irá pagar R$360 reais por dia");
					}
				}
			
			if (NomeDestino == 2) {
				System.out.println("Quantos dias você ficara por lá?:");
				QntdDias = in.nextInt();
				if (QntdDias>=2 && QntdDias<=5) {
					System.out.println("Você irá pagar R$500 reais por dia");
				}
					else if (QntdDias>=6 && QntdDias<=10) {
					 System.out.println("Você irá pagar R$560 reais por dia");
					}
					else if (QntdDias>=11) {
					 System.out.println("Você irá pagar R$620 reais por dia");
					}
				}
			       in.close();
			}
			
			}