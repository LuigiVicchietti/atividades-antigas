import javax.swing.JOptionPane;

public class ExericicioSalario {
    public static void main(String[] args) {
        int msSal1=0, msSal2=0;
        double nSal, maior=0, menor=999999999, salMedio=0, soma1=0, soma2=0;
        
        for(int i=0; i<12; i++) {
            nSal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu sal�rio recebido do " + (i+1) + "� m�s do ano:"));
            
            if (nSal > maior) {
                maior = nSal;
                msSal1 = i;
            }
            if (nSal < menor){
                menor = nSal;
                msSal2 = i;
            }
            if (nSal > 0) {
                soma1 = soma1 + nSal;
                salMedio = soma1 / 12;
            }
            if (nSal > -1) {
                soma2 = soma2 + nSal;
            }
        }
        JOptionPane.showMessageDialog(null, "O " + (msSal1+1) + "� m�s possui o maior sal�rio: R$" + maior);
        JOptionPane.showMessageDialog(null, "O " + (msSal2+1) + "� m�s possui o menor sal�rio: R$" + menor);
        JOptionPane.showMessageDialog(null, "O sal�rio m�dio � de : R$" + salMedio);
        JOptionPane.showMessageDialog(null, "A soma de seus rendimentos � de: R$" + soma2);
    }
}