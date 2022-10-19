/* 12. Escrever um algoritmo que leia 20 valores para uma variável ne, para cada um deles, calcule a tabuada de 1 até n. Mostre a tabuada na forma: 
1x n = n 
2 x n = 2n 
3x n = 3n 
nx n = n2  */
import javax.swing.JOptionPane;

public class exercicio12{
    public static void main(String args[]){
        int ne = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        int i = 1;
        while(i <= 20 && i <= ne){
           System.out.println(ne + " x " + i + " = " + (ne * i));
           i++;
        }
    }
}