import javax.swing.JOptionPane;

public class Idadeif {
    public static void main(String args[]){
        int idade;
        idade = Integer.parseInt((JOptionPane.showInputDialog(null,"Digite sua idade:")));
        if (idade >= 18) {
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}