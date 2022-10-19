import javax.swing.JOptionPane;

public class exemplo {
    public static void main(String[] args) {
     int x = Integer.parseInt(JOptionPane.showInputDialog
     ("Digite 1 para exibir sim ou 0 para exibir nao"));
     if(x == 1){
        JOptionPane.showMessageDialog(null, "Sim");
     }
     if(x == 0){
        JOptionPane.showMessageDialog(null, "Não");
     }
    }
}
