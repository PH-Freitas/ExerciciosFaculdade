/*53. Faça um algoritmo que calcule os 20 primeiros números primos, dados os tres primeiros 1,2 e 
3. */
public class exercicio53{
    public static void main(String args[]){
int i = 1;
int contador = 1;
for (i = 2; i >= contador; i++){
    if(i % 2 == 0){
        continue;
    } else{
        System.out.println(i);
    }
    contador++;
    if(contador == 20){
        break;
    }
}
    }
}