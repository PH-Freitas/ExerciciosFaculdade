/*38. Escrever um algoritmo que calcula e escreve o produto dos números primos entre 92 e 1478.*/
public class exercicio38{
    public static void main(String args[]){
        int contador = 92;
        for(contador = 1478; contador >= 1478; contador--){
            if(contador % 2 == 0){
                continue;
            } else{
                contador*= contador;
                contador++;
            }
        }
        System.out.println(contador*= contador);
    }
}