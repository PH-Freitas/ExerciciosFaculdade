/*6. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação: 
- 1,2,3,4 = voto para os respectivos candidatos; 
- 5 = voto nulo; 
- 6 = voto em branco; 
Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva: 
- total de votos para cada candidato; 
- total de votos nulos; 
- total de votos em branco; 
Como finalizador do conjunto de votos, tem-se o valor 0.*/
import javax.swing.JOptionPane;
public class exercicio6{
    public static void main(String [] args){
    int voto = 1;
    int voto1 = 0;
    int voto2 = 0;
    int voto3 = 0;
    int voto4 = 0;
    int voto5 = 0;
    int voto6 = 0;
    while(voto != 0){
        voto =Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do candidato"));
        if(voto == 1){
         voto1++;
        }
        if(voto == 2){
         voto2++;
        }
         if(voto == 3){
           voto3++;
        }
        if(voto == 4){
         voto4++;
        }
        if(voto == 5){
         voto5++;
        }
        if(voto == 6){
         voto6++;
        }
    }
    System.out.println("total de votos para o candidato 1: " + voto1);
    System.out.println("total de votos para o candidato 2: " + voto2);
    System.out.println("total de votos para o candidato 3: " + voto3);
    System.out.println("total de votos para o candidato 4: " + voto4);
    System.out.println("total de votos nulos: " + voto5);
    System.out.println("total de votos brancos: " + voto6);
    }
}