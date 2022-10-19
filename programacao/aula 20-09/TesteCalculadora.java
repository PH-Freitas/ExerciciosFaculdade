import javax.swing.JOptionPane;

public class TesteCalculadora {
   public static void main(String[] args) {
     //construir um objeto Calculadora
    Calculadora calc = new Calculadora(); //Construtor padrão
    int opcao;
    do{
       opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao"));
    } while(opcao < 1 || opcao > 4);
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
    int resultado;
    if(opcao == 1){
       resultado = calc.soma(num1, num2);
    } else if(opcao == 2){
        resultado = calc.subtracao(num1, num2);
    } else if (opcao == 3){
        resultado = calc.multiplicacao(num1, num2);
    } else {
        resultado = calc.divisao(num1, num2);
    }
    JOptionPane.showMessageDialog(null, "Resultado: " + resultado , "Calculadora" , JOptionPane.INFORMATION_MESSAGE);
 }
}
