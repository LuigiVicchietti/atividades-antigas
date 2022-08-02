import javax.swing.JOptionPane;

public class ExercicioViagem {

	public static void main(String[] args) {
		
		int NomeDestino;
		int QntdDias;
		
		NomeDestino = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual destino você deseja ir?:"));
	if (NomeDestino == 1){
	    QntdDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos dias você ficara por lá?:"));
	    if (QntdDias>=2 && QntdDias<=5) {
	    	JOptionPane.showMessageDialog(null,"Você irá pagar R$240 reais por dia");
	    }
	    	else if (QntdDias>=6 && QntdDias<=10) {
	    		JOptionPane.showMessageDialog(null,"Você irá pagar R$350 reais por dia");
	    	}
	    	else if (QntdDias>=11) {
	    			JOptionPane.showMessageDialog(null,"Você irá pagar R$360 reais por dia");
	    		}
	    	}
	
	if (NomeDestino == 2) {
		QntdDias = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos dias você ficara por lá?:"));
		 if (QntdDias>=2 && QntdDias<=5) {
			 JOptionPane.showMessageDialog(null,"Você irá pagar R$500 reais por dia");
		 }
			 else if (QntdDias>=6 && QntdDias<=10) {
				 JOptionPane.showMessageDialog(null,"Você irá pagar R$560 reais por dia");
			 }
				 else if (QntdDias>=11) {
					 JOptionPane.showMessageDialog(null,"Você irá pagar R$620 reais por dia");
				 
			 }
		 }

	
	    }
	}