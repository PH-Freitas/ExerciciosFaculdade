import javax.swing.JOptionPane;

public class ExemploLeitura {
    public static void main (String args []) {
        String strNumero1;
        strNumero1 = JOptionPane.showInputDialog("digite o numero 1");
        int intNumero1 = Integer.parseInt(strNumero1);
        
        String strNumero2;
        strNumero2 = JOptionPane.showInputDialog("digite o numero2");
        int intNumero2 = Integer.parseInt(strNumero2);

        JOptionPane.showMessageDialog(null, intNumero1 + intNumero2);
    }
}