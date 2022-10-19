import javax.swing.JOptionPane;

public class verdadeiro{
    public static void main(String args[]){
        int numero;
        numero=
        Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if(numero <=10 && numero >=0){
            System.out.println("Numero correto!");
        } else{
            System.out.println("Numero incorreto!");
        }
    }
}