import javax.swing.JOptionPane;
import java.util.Scanner;
public class compra{
    public static void main(String args[]){
        boolean continuarcomprando = true;
        do{
        Double preco;
        preco = 
        Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de compra"));
        if(preco <= 200){
            JOptionPane.showMessageDialog(null,"desconto de 4%: " + (preco * 4/100) + " reais");
            JOptionPane.showMessageDialog(null,"Valor a pagar: " + (preco  - preco * 4/100) + " reais");
        } else if(preco <= 500){
          JOptionPane.showMessageDialog(null,"desconto de 6%: " + (preco * 6/100) + " reais");
          JOptionPane.showMessageDialog(null,"Valor a pagar: " + (preco - preco * 6/100 + " reais"));
        } else {
          JOptionPane.showMessageDialog(null,"desconto de 8%: " + (preco * 8/100) + " reais");
          JOptionPane.showMessageDialog(null,"Valor a pagar: " + (preco - preco * 8/100 + " reais"));
        }
        int opcao;
        opcao =
        Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para parar ou 1 para continuar"));
        if(opcao == 0){
          continuarcomprando = false;
        }
        } while(continuarcomprando == true);
    }
}