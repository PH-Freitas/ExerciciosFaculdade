/*49.Faça um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o fatorial de N (N!). */
import javax.swing.JOptionPane;

public class exercicio49{
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