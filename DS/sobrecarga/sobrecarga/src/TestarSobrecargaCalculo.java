import javax.swing.JOptionPane;

public class TestarSobrecargaCalculo {

 public static void main(String[] args) {

//1 Metodo Somar - Inteiro//
int n1 , n2, somar;

//2 Metodo Somar - Double//
double v1,v2,v3,resultado;

//Constru��o do Objeto para a acessar a Classe Calculos//
//Instanciar o objeto //
SobrecargaCalculo c = new SobrecargaCalculo();

// 1 - Metodo Somar - Entrada de Dados -- Solicitar Informa�oes//
n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero:"));
n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero:"));

somar = n1+n2;

//1 - Metodo Somar - Saida ( Exibir na tela ) //
JOptionPane.showMessageDialog(null,"O resultado da soma � :"+c.somaNumeros(n1, n2, somar));

//Sobrecarga do m�todo //
//2 Metodos Somar //

// 2 - Metodo Somar - Entrada de Dados -- Solicitar Informa�oes//
v1 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada:Digite o primeiro n�mero:"));
v2 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada:Digite o segundo n�mero:"));
v3 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada: Digite o terceiro n�mero:"));

resultado = v1+v2+v3;

//2 - Metodo Somar - Saida ( Exibir na tela ) //
JOptionPane.showMessageDialog(null,"O resultado da soma � :"+c.somaNumeros(v1, v2, v3, resultado));


 }

}