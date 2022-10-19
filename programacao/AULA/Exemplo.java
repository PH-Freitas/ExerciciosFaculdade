import javax.swing.JOptionPane;

public class Exemplo {
    public static void main(String args[]) {
        double primeirovalor =0;
        double segundovalor=0;
        primeirovalor = Double.parseDouble((JOptionPane.showInputDialog("Digite o primeiro valor")));
        segundovalor = Double.parseDouble((JOptionPane.showInputDialog("Digite o segundo valor")));
        double soma = primeirovalor + segundovalor;
        double subr = primeirovalor - segundovalor;
        double mult = primeirovalor * segundovalor;
        double divi = primeirovalor / segundovalor;
        System.out.println(" soma: "  + soma + " subr: "  + subr + " mult: "  + mult + " divi: "  + divi);
    }
}