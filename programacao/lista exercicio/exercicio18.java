/*18. Escrever um algoritmo que lê um número não determinado de valores para m, todos inteiros e positivos, um de cada vez.
 Se m for par, verificar quantos divisores possui e escrever esta informação. 
 Se m for ímpar e menor do que 10 calcular e escrever o fatorial de m. 
 Se m for impar e maior ou igual a 10 calcular e escrever a soma dos inteiros de 1 até m.*/
 
 import javax.swing.JOptionPane;

 public class exercicio18{
    public static void main(String args[]){
        int m = 1;
        int fat = 1;
        int soma = 1;
        int continuar;
        do{
            m = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            if(m % 2 ==0){
                JOptionPane.showMessageDialog(null, "Numero par!");
            } else if(m <= 10){
            for(int i = 2; i <= m; i++){
                fat*= i;
                System.out.println("Fatorial: " + fat);
            }
            } else{
                for(int x = 1; x <= m; x++){
                    soma += x;
                    System.out.println("Soma dos inteiros: " + soma);
                }
            }
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Se quiser continuar digite 1"));
        } while(continuar == 1);
    }
 }
