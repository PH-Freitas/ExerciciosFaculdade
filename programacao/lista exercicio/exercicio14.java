/*14. Escrever um algoritmo que leia um número não determinado de valores e calcule a média aritmética dos valores lidos,
 a quantidade de valores positivos, 
 a quantidade de valores negativos eo percentual de valores negativos e positivos.
 Mostre os resultados. */
 import javax.swing.JOptionPane;

 public class exercicio14{
    public static void main(String args []){
        int n;
        int positivo = 0;
        int negativo = 0;
        int total = 0;
        int media = 1;
         for(total = 1; total <= 5; total++){
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero" + total));
            media = n;
            total = negativo + positivo;
            if(n >= 0){
            positivo++;
            } else{
            negativo++;
            }
         }
        System.out.println("numeros positivos: " + (positivo));
        System.out.println("numeros negativos: " + (negativo));
        System.out.println("Media: " + (media / total));
    }
 }