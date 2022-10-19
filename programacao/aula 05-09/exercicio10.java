/*10. Escreva um algoritmo que leia o código de um aluno e suas três notas.
 Calcule a média ponderada do aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. 
 Mostre o código do aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e "REPROVADO" se a média for menor que 5. 
 Repita a operação até que o código lido seja negativo. */
import javax.swing.JOptionPane;
public class exercicio10{
    public static void main(String args[]){
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: "));
        do{
            if(codigo >= 0){
            int nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota 1: "));
            int nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota 2: "));
            int nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota 3: "));
            int media = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3)) / 10;
            if(media >= 5){
                System.out.println("Aprovado!");
                System.out.println("Sua media ponderada: " + (media));
                break;
            } else{
                System.out.println("Reprovado!");
                System.out.println("Sua media ponderada: " + (media));
                break;
            }
        }
    } while(codigo >= 0);
}
}