import javax.swing.JOptionPane;

public class contador{
    public static void main(String args[]){
        int i = 1;
        while(i <= 10) {
            //System.out.println(i);
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
        JOptionPane.showMessageDialog(null, i); //quando o while for falso, ele vai exibir o numero que quebrou o while
    }
}