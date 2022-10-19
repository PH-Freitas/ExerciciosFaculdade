/*19. Faça um algoritmo que leia uma quantidade não determinada de números positivos.
 Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos números lidos.
  O número que encerrará a leitura será zero */

 import javax.swing.JOptionPane;

 public class exercicio19{
    public static void main(String args[]){
        int m;
        int positivo = 0;
        int negativo = 0;
        int media;
        int mediageral;
        int contador = 0;
        int contadorpar = 0;
        int continuar;
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            contador++;
            if(m % 2 == 0){
             positivo = m;
             contadorpar = m / contador;
            } else{
             negativo = m;
            }
            mediageral = (positivo + negativo) / contador;
            media = positivo / contadorpar;
            System.out.println("Contador: " + contador);
            System.out.println("Media par: " + media);
            System.out.println("Media total: " + mediageral);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Se quiser continuar digite algo diferente de zero"));
        } while(continuar != 0);
    }
 }