/*17. Escrever um algoritmo que lê um número não determinado de pares de valores m,n, todos inteiros e positivos,
 um par de cada vez, e calcula e escreve a soma dos n inteiros consecutivos a partir de m inclusive. */

import javax.swing.JOptionPane;

public class exercicio17{
    public static void main(String args[]){
        int n1;
        int n2;
        int soma;
        int continuar;
        do{
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            if(n1 <= 0 || n2 < 0){
                break;
            }
            soma = n1 + n2;
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se quiser continuar"));
            System.out.println("SOMA: " + soma);
        } while(continuar == 1);
    }
}