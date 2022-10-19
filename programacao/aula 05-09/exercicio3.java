 /*A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos.
 A prefeitura deseja saber: 
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$ 100,00.
O final da leitura de dados se dará com a entrada de um salário negativo. (Use o comando ENQUANTO-FAÇA)*/ 
import javax.swing.JOptionPane;

public class exercicio3{

    public static void main(String[]args){
        double msalario = 0;
        double persalario;
        double maxsalario = 0;
        double salario = 0;
        int numfilhos;
        int mfilhos = 0;
        int contador = 0;
        while( salario >=0){
        salario =
        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario"));
        if(salario > 0){
         numfilhos = 
         Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de filhos"));
         contador++;
         msalario = msalario + salario;
         mfilhos = mfilhos + numfilhos;
         if(salario > maxsalario){
            maxsalario = salario;
         }
        }
     }
        System.out.println("media do salario da populacao: "+ (msalario/contador));
        System.out.println("media do numero de filhos " + (mfilhos/contador));
        System.out.println("maior salario: " + maxsalario);
    }
         }
