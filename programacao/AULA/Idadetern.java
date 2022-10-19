import javax.swing.JOptionPane;

public class Idadetern {
    public static void main(String args[]){
        int idade;
        String resultado;
        idade = Integer.parseInt((JOptionPane.showInputDialog("Digite sua idade:")));
        resultado = idade >= 18 ? "Maior de Idade!" : "Menor de Idade!";
        System.out.println(resultado);
    }
}