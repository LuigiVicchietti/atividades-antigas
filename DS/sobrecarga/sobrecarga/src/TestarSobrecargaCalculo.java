import javax.swing.JOptionPane;

public class TestarSobrecargaCalculo {

 public static void main(String[] args) {

//1 Metodo Somar - Inteiro//
int n1 , n2, somar;

//2 Metodo Somar - Double//
double v1,v2,v3,resultado;

//Construção do Objeto para a acessar a Classe Calculos//
//Instanciar o objeto //
SobrecargaCalculo c = new SobrecargaCalculo();

// 1 - Metodo Somar - Entrada de Dados -- Solicitar Informaçoes//
n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

somar = n1+n2;

//1 - Metodo Somar - Saida ( Exibir na tela ) //
JOptionPane.showMessageDialog(null,"O resultado da soma é :"+c.somaNumeros(n1, n2, somar));

//Sobrecarga do método //
//2 Metodos Somar //

// 2 - Metodo Somar - Entrada de Dados -- Solicitar Informaçoes//
v1 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada:Digite o primeiro número:"));
v2 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada:Digite o segundo número:"));
v3 = Double.parseDouble(JOptionPane.showInputDialog("2 Rodada: Digite o terceiro número:"));

resultado = v1+v2+v3;

//2 - Metodo Somar - Saida ( Exibir na tela ) //
JOptionPane.showMessageDialog(null,"O resultado da soma é :"+c.somaNumeros(v1, v2, v3, resultado));


 }

}