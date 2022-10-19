/*51. Faça um algoritmo que calcule o fatorial de um número.*/
import javax.swing.JOptionPane;
public class exercicio51{
    public static void main(String args[]){
        int fat = 1;
        int valor;
        valor =
        Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        for(int i = 2; i<= valor; i++){
            fat*= i;
        }
        
        System.out.println("fatorial: " + fat);
    }
}