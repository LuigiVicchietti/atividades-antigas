import java.util.Scanner;

public class VetorScanner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		final int TAM = 9;
        int a[], j, i;
        double b[], fat;
        a = new int [TAM];
        b = new double [TAM];
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º número inteior:");
            a[i] = in.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            fat = 1;
            for(j=1; j<=a[i]; j++) {
                    fat = fat * j;
            }
            b[i] = fat;
            System.out.println("Fatorial do número " + a[i] + ": /n " + b[i]);
        }
            in.close();
	}

}
