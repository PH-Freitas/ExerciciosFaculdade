/*2. Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor de 
E. 
E = 1 + 1/ 1! + 1/ 2! + 1/3! + 1/N! */ 
import javax.swing.JOptionPane;

public class exercicio2{
    public static void main(String args[]){
    int fat = 1;
    int n;
    double e;
    e = 1+1/1 + 1/2 + 1/6 + 1/fat;
    n = 
    Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro e positivo"));
    for(int i = 2; i <=n; i++){
    fat *= i;
    }
    System.out.println("fatorial: " + fat);
    JOptionPane.showMessageDialog(null, "o valor de e: " + e);
    }
}