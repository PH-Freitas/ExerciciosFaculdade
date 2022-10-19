import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class exercicio{
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int continuar;
        do{
        int sorteio = random.nextInt(10) + 1;
        //System.out.println("Digite um numero de 1 a 10: ");
        int chute = //scanner.nextInt();
        Integer.parseInt(JOptionPane.showInputDialog("Digite de 0 a 10"));
        if(chute == sorteio){
        //System.out.println("Parabens!!!"); 
         JOptionPane.showMessageDialog(null,"Parabens");
        } else{
        //System.out.println("Errou!, a resposta era: " + sorteio); 
         JOptionPane.showMessageDialog(null,"Errou. a resposta era: " + sorteio);
        }
        //System.out.println("Digite 0 para parar ou 1 para continuar");
        continuar = //scanner.nextInt();  
        Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para parar e 1 para continuar"));
        } while(continuar == 1);
    }
}