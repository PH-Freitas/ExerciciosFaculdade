/*50. Faça um algoritmo que leia 2 valores inteiros e positivos: Xe Y. 
O algoritmo deve calcular e escrever a função potência XY */
import javax.swing.JOptionPane;

public class exercicio50{
    public static void main(String args[]){
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("digite um valor x: "));
        int y;
        y = Integer.parseInt(JOptionPane.showInputDialog("digite um valor y: "));
        int pot = x * y;
        System.out.println(pot * pot);
    }
}