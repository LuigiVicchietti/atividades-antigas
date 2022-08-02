import javax.swing.JOptionPane;

public class ExercicioVetor {
    public static void main(String[] args) {
    	
        final int TAM = 9;
        int a[], j, i;
        double b[], fat;
        a = new int [TAM];
        b = new double [TAM];
        
        for(i=0; i<TAM; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i+1) + "º número inteiro:"));
        }
        
        for(i=0; i<TAM; i++) {
            fat = 1;
            for(j=1; j<=a[i]; j++) {
                    fat = fat * j;
            }
            b[i] = fat;
            JOptionPane.showMessageDialog(null, "Fatorial do número " + a[i] + ": \n" + b[i]);
        }
    }
}