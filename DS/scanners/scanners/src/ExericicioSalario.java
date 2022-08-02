import javax.swing.JOptionPane;

public class ExericicioSalario {
    public static void main(String[] args) {
        int msSal1=0, msSal2=0;
        double nSal, maior=0, menor=999999999, salMedio=0, soma1=0, soma2=0;
        
        for(int i=0; i<12; i++) {
            nSal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu salário recebido do " + (i+1) + "º mês do ano:"));
            
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
        JOptionPane.showMessageDialog(null, "O " + (msSal1+1) + "º mês possui o maior salário: R$" + maior);
        JOptionPane.showMessageDialog(null, "O " + (msSal2+1) + "º mês possui o menor salário: R$" + menor);
        JOptionPane.showMessageDialog(null, "O salário médio é de : R$" + salMedio);
        JOptionPane.showMessageDialog(null, "A soma de seus rendimentos é de: R$" + soma2);
    }
}