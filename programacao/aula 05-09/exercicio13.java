/*13. Escrever um algoritmo que leia um número n que indica quantos valores devem ser lidos a seguir.
 Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial deste valor.*/
 import javax.swing.JOptionPane;
 public class exercicio13{
  public static void main(String args[]){
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
    int fat = 1;
    for(int i = 2; i<= n; i++){
            fat*= i;
        }
    System.out.println("valor lido:" + n  + " fatorial: " + fat);
    }
  }