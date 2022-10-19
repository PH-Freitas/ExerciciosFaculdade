import javax.swing.JOptionPane;

public class Exemplo3{
    public static void main(String args[]){
        double nota;
        String conceito;

        nota = Double.parseDouble((JOptionPane.showInputDialog("Digite sua nota")));
        conceito = nota >= 90 ? "A" : nota >= 80 
                              ? "B" : nota >= 70
                              ? "C" : "D";
        System.out.println("Conceito " + conceito);
    }
}