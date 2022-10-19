/*Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. 
O algoritmo deverá ler, além das notas, 
o código do aluno e deverá ser encerrado quando o código for igual a zero.*/
import javax.swing.JOptionPane;

public class exercicio7{
    public static void main(String args[]){
   int m = 1;
   int contador = 0;
   int soma = 0;
   int codigoaluno = 1;
   int codigoaluno2 = 1;
   int codigoaluno3 = 1;
   while(m != 0){
    m = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota"));
    if(m > 0){
        codigoaluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo"));
        codigoaluno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo"));
        codigoaluno3 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo"));
        soma = soma + m;
        contador++;
    }
   }
   System.out.println("A media dos 3 alunos foram: " + (soma / contador));
   System.out.println("codigo aluno 1: "+ codigoaluno);
   System.out.println("codigo aluno 2: "+ codigoaluno2);
   System.out.println("codigo aluno 3: "+ codigoaluno3);
 }
}