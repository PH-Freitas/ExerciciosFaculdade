import javax.swing.JOptionPane;

public class fazer {
    public static void main(String args[]){
        double nota1, nota2;
        int contador = 1;
        do{
            nota1 = 
            Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
            nota2 =
            Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
            JOptionPane.showMessageDialog(null, "Media: " + (nota1 + nota2) /2);
            contador++;
        } while(contador <= 2);
    }
}