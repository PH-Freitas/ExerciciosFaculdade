/*26. Escreva um algoritmo que gere o números de 1000 a 1999
 e escreva aqueles que dividido por 11 dão resto igual a 5. */

 public class exercicio26{
    public static void main(String args[]){
        int contador = 1000;
        while(contador <= 1999){
            if(contador % 11 == 5){
                System.out.println(contador);
        }
        contador++;
     }
    }
 }