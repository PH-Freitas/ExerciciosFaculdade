import javax.swing.JOptionPane;

public class Soma {
    public static void main (String args[]) {
        int intNum = Integer.parseInt(JOptionPane.showInputDialog
        (null, "digite um valor inteiro", "primeira entrada", JOptionPane.PLAIN_MESSAGE));

        double dblNum = Double.parseDouble(JOptionPane.showInputDialog
        (null, "digite um numero de dupla precisão"));

        JOptionPane.showMessageDialog(null, "soma = " + (intNum + dblNum),
        "resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}