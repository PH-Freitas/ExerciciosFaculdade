import java.util.Scanner;
public class Teste {
public static void main(String args[]){
   Scanner scanner = new Scanner(System.in);
   Carros carro = new Carros(0, null, 0);
   
   System.out.println(carro.setAnodefabricação(200));
   System.out.println(carro.setModelo("ideia"));
   System.out.println(carro.setVelocidade(500));
   
    }
   
}