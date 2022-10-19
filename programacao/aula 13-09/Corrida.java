import java.util.Scanner;

public class Corrida {
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Carro martin = new Carro();
        martin.escolher("Mustang");
        System.out.println("Modelo: " + martin.getModelo());
        martin.setVelocidade(500);
        System.out.println("velocidade: " + martin.getVelocidade());


        Carro carro = new Carro();
        System.out.println("modelo do carro: " + carro.getModelo());
        System.out.println("ano do carro: " + carro.getAnoFabricacao());
        System.out.println("velocidade do carro: " + carro.getVelocidade());

        System.out.println("digite o modelo do carro novo: ");
        String modelo = scanner.next();
        System.out.println("digite o ano do carro novo");
        int ano = scanner.nextInt();
        System.out.println("digite a velocidade do carro novo");
        double velocidade = scanner.nextDouble();

        Carro carroNovo = new Carro(modelo, ano, velocidade);
        System.out.println("meu carro novo:\n" + carroNovo.getModelo() + "\n" + carroNovo.getAnoFabricacao() + "\n" + carroNovo.getVelocidade());
    }
}
