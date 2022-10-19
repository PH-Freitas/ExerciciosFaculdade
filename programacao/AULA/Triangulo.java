import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String args[]) {
        double base = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da base:",));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da altura:",));
        JOptionPane.showMessageDialog(null, "Área do triângulo: "+ (base * altura) + "m²");
    }
}