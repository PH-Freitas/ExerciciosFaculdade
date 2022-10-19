import javax.swing.JOptionPane;

public class Exemploif {
    public static void main(String args[]){
        double nota;
        nota = Double.parseDouble((JOptionPane.showInputDialog("Digite sua nota")));
        if(nota >= 70) {
        System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}