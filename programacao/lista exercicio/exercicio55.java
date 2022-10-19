/*55. Faça uma algoritmo que receba duas datas e retorne a diferença entre elas em dias. */
import javax.swing.JOptionPane;

public class exercicio55{
    public static void main(String args[]){
        int data1 = Integer.parseInt(JOptionPane.showInputDialog("Digite dia 1"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes 1"));
        int data2 = Integer.parseInt(JOptionPane.showInputDialog("Digite dia 2"));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes 2"));
        int total1 = data1 + (mes1 * 30);
        int total2 = data2 + (mes2 * 30);
        int diferenca = total1 - total2;
        System.out.println(diferenca + " dias");
    }
}