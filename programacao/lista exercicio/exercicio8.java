/*8. Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares. 
Termine a leitura se o usuário digitar zero (O).*/
import javax.swing.JOptionPane;

public class exercicio8{
    public static void main(String args[]){
    int numero = 1;
    int media =0;
    int soma = 0;
    while(numero!= 0){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        if(numero % 2 == 0){
        soma = soma + numero;
        media++;
        } else{
            break;
        }
    } System.out.println("Media: " + (soma / media));
    }
}