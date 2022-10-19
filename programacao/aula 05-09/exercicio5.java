//5. Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, 
//lidos externamente. O final da leitura acontecerá quando for lido um valor negativo.

import javax.swing.JOptionPane;

public class exercicio5{
 public static void main(String[]args){
      int numero = 0;
      int contador = 0;
      int soma = 0;
      while(numero >= 0){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
        if(numero > 0){
            soma = soma + numero;
            contador++;
        }
      }
     JOptionPane.showMessageDialog(null,"A media e: " + (soma / contador));
 }
}