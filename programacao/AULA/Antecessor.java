import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String args[]) {
    int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "digite um número"));
    JOptionPane.showMessageDialog(null, "Antecessor: " + (valor - 1));
    }
}