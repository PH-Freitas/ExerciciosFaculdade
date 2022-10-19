/*21. Faça um algoritmo que leia vários números inteiros e positivos e calcule o produtório dos números pares.
 O fim da leitura será indicado pelo número 0. */
 import javax.swing.JOptionPane;

 public class exercicio21{
    public static void main(String args[]){
        int n;
        int soma = 1;
        int continuar;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            for(int i = 1; i <= n; i++){
                if(n % 2 == 0){
                   soma *= i;
                }
            }
            System.out.println("Produto dos numeros pares: " + soma);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Se quiser continuar não digite 0"));
        } while(continuar != 0);
    }
 }
