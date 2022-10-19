import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        int i;
        int n1, n2, n3, n4, n5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Leitura dos valores");
        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro valor: ");
        n3 = scanner.nextInt();
        //repetir o comando para todos os valores.
        System.out.println("leitura dos elementos do vetor");
        int[] v = new int[5];
        for(i=0; i < v.length; i++){
            System.out.println("Digite o " + (i + 1) + "º valor");
            v[i] = scanner.nextInt();
        }

    }
}