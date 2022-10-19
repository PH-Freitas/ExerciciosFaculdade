import javax.swing.JOptionPane;

public class Salario {
    public static void main(String args[]){
        double salario;
        salario = Double.parseDouble((JOptionPane.showInputDialog(null,"Digite o seu salario")));
        if (salario >= 1212){
        JOptionPane.showMessageDialog(null,"Voce ganha pelo menos 1 salario minimo!");
        } else {
        System.out.println("Voce ganha menos que 1 salario minimo");
        }
   }
}