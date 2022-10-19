/*16. Escrever um algoritmo que le um conjunto não determinado de valores, 
um de cada vez, e escreve uma tabela com cabeçalho, que deve ser repetido a cada 20 linhas.
 A tabela conterá o valor lido, seu quadrado, seu cubo e sua raiz quadrada.*/
 import javax.swing.JOptionPane;

 public class exercicio16{
    public static void main(String args[]){
        int n;
        int continuar;
        do{
            for(int i = 1; i < 20; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
            System.out.println("Valor lido: " + n);
            System.out.println("Valor lido ao quadrado: " + (n * n));
            System.out.println("Valor lido ao cubo: " + (n * n * n));
            System.out.println("Raiz quadrada: " + Math.sqrt(n));
            if(n == 0){
                break;
            }
            }
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 se quiser continuar"));
        } while(continuar == 1);
    }
 }