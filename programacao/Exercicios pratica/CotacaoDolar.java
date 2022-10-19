import javax.swing.JOptionPane;

public class CotacaoDolar {
    public static void main (String args[]) {
     double x = 5.17;
     JOptionPane.showMessageDialog (null, "Cotação do Dolar: " + x);
     int intNum = Integer.parseInt(JOptionPane.showInputDialog
     (null, "digite o valor para ser cotado :", "VALOR EM DOLAR", JOptionPane.PLAIN_MESSAGE));
     JOptionPane.showMessageDialog (null, "Valor inserido: " + intNum + " Dol");
     JOptionPane.showMessageDialog(null, "resultado final :" + (Math.round(intNum * x *100.0)/100.0)+" Reais", "Final",
     JOptionPane.INFORMATION_MESSAGE);
    }
}