import javax.swing.JOptionPane;

public class Comissao {
    public static void main(String args[]) {
        int intNum = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Preço unitario da peça:", "Comissão do vendedor", JOptionPane.PLAIN_MESSAGE));
        int intNum1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Quantidade de peças vendidas:", "Comissão do vendedor", JOptionPane.PLAIN_MESSAGE));
        JOptionPane.showMessageDialog(null, "Comissão do vendedor: "+ (Math.round(intNum * intNum1 * 5/100 * 100.0)/100.0 ), "Final",JOptionPane.INFORMATION_MESSAGE);
    }
}