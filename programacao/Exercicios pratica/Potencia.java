import javax.swing.JOptionPane;

public class Potencia {
    public static void main (String args[]) {
        int intNum = Integer.parseInt(JOptionPane.showInputDialog
        (null, "digite o primeiro numero:", "calcular a potência",JOptionPane.PLAIN_MESSAGE));
        System.out.println(intNum * intNum);
        int intNum1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "digite o segundo numero:", "calcular a potência",JOptionPane.PLAIN_MESSAGE));
        System.out.println(intNum1 * intNum1);
        int intNum2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "digite o terceiro numero:", "calcular a potência",JOptionPane.PLAIN_MESSAGE));
        System.out.println(intNum2 * intNum2);
        int intNum3 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "digite o quarto numero:", "calcular a potência",JOptionPane.PLAIN_MESSAGE));
        System.out.println(intNum3 * intNum3);
        JOptionPane.showMessageDialog(null, "Soma das potências: " + ((intNum * intNum) + (intNum1 * intNum1)
        + (intNum2 * intNum2) + (intNum3 * intNum3)), "Final", JOptionPane.INFORMATION_MESSAGE);
    }
}