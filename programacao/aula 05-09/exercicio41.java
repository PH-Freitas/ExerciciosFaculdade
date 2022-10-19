/*41. Faça um algoritmo que leia as três notas de 50 alunos de uma turma. 
Para cada aluno, calcule a média ponderada, como segue: MP = ( n1*2 + n2*4 + n3*3 ) / 10
Além disso, calcule a média geral da turma. Mostre a média de cada aluno e uma mensagem "Aprovado", 
caso a média seja maior ou igual a sete, e uma mensagem "Reprovado", caso contrário.
 Ao final, mostre a média geral. */

import javax.swing.JOptionPane;

public class exercicio41{
    public static void main(String args[]){
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int mp = 0;
        int continuar = 1;
        do{
            m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 1 nota: "));
            m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 2 nota: "));
            m3 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua 3 nota: "));
            mp = (m1*2 + m2*4 + m3*3) / 10;
            if(mp >= 7){
                System.out.println("Aprovado!");
            } else{
                System.out.println("Reprovado");
            }
            System.out.println(mp);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Se quiser fazer novamente a conta digite 0: "));
    
        } while ( continuar == 0);
    }
}