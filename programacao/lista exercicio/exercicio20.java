/*20. Faça um algoritmo que leia vários números inteiros e calcule o somatório dos números negativos.
 O fim da leitura será indicado pelo número 0. */
 import javax.swing.JOptionPane;

 public class exercicio20{
    public static void main(String args[]){
        int n;
        int soma = 1;
        int continuar;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            for(int i = 0; i >= n; i--){
                soma += i;
            }
            System.out.println("Soma dos numero negativos: " + soma);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Se quiser continuar não digite 0"));
        } while(continuar != 0);
    }
 }