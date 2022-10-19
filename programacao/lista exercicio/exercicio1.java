import javax.swing.JOptionPane;

public class exercicio1{
    public static void main(String args[]){
       int entrada;
       int contador;
       int numeroDeNegativos = 0;
       for(contador = 1; contador <=5; contador++){
        entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + contador));
       if(entrada < 0){
        numeroDeNegativos++;
       }
       }
       System.out.println("o total de numeros negativos e " + numeroDeNegativos);
    }
}
