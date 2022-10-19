/* 11. Escreva um algoritmo que leia um número n (número de termos de uma progressão aritmética),
a1 (o primeiro termo da progressão)
e r(a razão da progressão) e escreva os n termos desta progressão, bem como a soma dos elementos. */
import javax.swing.JOptionPane;

public class exercicio11{
    public static void main(String args[]){
        int n = 1;
        int a1 = 0;
        int r = 3;
        int soma = 0;
        int razao = 0;
        int an = 0;
        while(soma == 0){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de termos: "));
            a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo: "));
            r = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão: "));
            an = a1 + ((n -1)* r);
            soma = ((1 + n) * n);
        }
        System.out.println("Primeiro termo: " + a1);
        System.out.println("Numero de termos: " + n);
        System.out.println("Soma dos elementos: " + soma);
    }
}