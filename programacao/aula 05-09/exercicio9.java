/*9. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado. */

public class exercicio9{
    public static void main(String args[]){
    int contador = 1;
    while(contador < 51){
        System.out.println(contador);
        contador++;
    }
        System.out.println("O Numero maior: " + Math.max(1,50));
        System.out.println("O Numero menor: " + Math.min(1,50));
    }
}