import javax.swing.JOptionPane;

public class primo{
    public static void main(String args[]){
        int numero;
        numero = 
        Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        boolean primo = true;
        for(int i = 2; i < numero;i++){
            if(numero % i == 0){
             primo = false;
        } if(primo == true){
         System.out.println("O valor " + numero + " é primo");
         break;
        } else{
          System.out.println("O valor " + numero + "  não é primo");
          break;
        }
        }
    }
    }
