import javax.swing.JOptionPane;

public class codigo{
    public static void main(String args[]){
        int valor, senha;
        valor = 
        Integer.parseInt(JOptionPane.showInputDialog("Digite seu salário"));
        senha = 
        Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));
        if(valor == 1200 && senha == 1){
            System.out.println("Seu salário aumentou 20%,"+" seu novo salário: " + (valor * 20/100 + valor) + " reais");
        }
        if(valor == 1300 && senha == 2){
            System.out.println("Seu salário aumentou 15%,"+" seu novo salário: " + (valor * 15/100 + valor) + " reais");
        }
        if(valor == 1400 && senha == 3){
            System.out.println("Seu salário aumentou 5%,"+ " seu novo salário: " +(valor * 5/100 + valor) + " reais");
        }
        if(valor == 1500 && senha == 4){
            System.out.println("Seu salário não muda");
        }
    }
}