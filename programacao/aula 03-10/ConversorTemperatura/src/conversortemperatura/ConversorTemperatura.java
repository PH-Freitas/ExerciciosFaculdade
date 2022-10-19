package conversortemperatura;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ConversorTemperatura {

    public static void main(String[] args) {
   SwingUtilities.invokeLater (() -> {
criarTela();
});
    }
    
    public static void criarTela(){
        JFrame tela = new JFrame("Conversor");
        JTextField celciusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\n00BOC");
        JButton conversor = new JButton("Converter");
        JLabel valorConverter = new JLabel("");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout (new GridLayout(2, 2, 4 , 4));
        painelDeConteudo.add(celciusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(conversor);
        painelDeConteudo.add(valorConverter);
        
        conversor.addActionListener((e) -> {
        double celsius = Double.parseDouble(
       celciusTextField.getText());
                                   
      double fahrenheit = celsius / 5 * 9 + 32;
    valorConverter.setText(
      String.format("%.2f\u00B0F", fahrenheit)
     );
});
        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        
        
    }
    
}
