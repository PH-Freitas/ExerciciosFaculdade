import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String args[]){
        double nota;
        nota = Double.parseDouble((JOptionPane.showInputDialog("digite sua nota:")));
        if (nota >= 90){
            System.out.println("conceito A");
        } else if (nota >= 80){
            System.out.println("conceito B");
        } else if (nota >= 70){
            System.out.println("conceito C");
        } else {
            System.out.println("Conceito D");
        }
    }
}