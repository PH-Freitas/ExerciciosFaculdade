/*30. Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200. */
public class exercicio30{
    public static void main(String args[]){
        int contador = 100;
        for(contador = 200; contador >= 100; contador--){
            if(contador % 2 ==0){
                continue;
            } else{
                System.out.println(contador);
            }
        }
    }
}