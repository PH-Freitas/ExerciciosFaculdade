/*15. Escrever um algoritmo que leia uma quantidade desconhecida de números
 e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100. 
 A entrada de dados deve terminar quando for lido um número negativo.*/
import javax.swing.JOptionPane;

public class exercicio15{
    public static void main(String args[]){
        int n;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        int continuar;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
            if(n >= 100 && n<= 76){
                intervalo4++;
            } else if(n <= 75 && n >= 51){
                intervalo3++;
            } else if(n <= 50 && n >= 26){
                intervalo2++;
            } else if(n <= 25 && n >= 0 ){
                intervalo1++;
            }
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar?, se sim, digite um numero positivo"));
        } while(continuar >= 0);
        System.out.println("Numero de valores no 1 intervalo: " + intervalo1);
        System.out.println("Numero de valores no 2 intervalo: " + intervalo2);
        System.out.println("Numero de valores no 3 intervalo: " + intervalo3);
        System.out.println("Numero de valores no 4 intervalo: " + intervalo4);
    }
}
 
 