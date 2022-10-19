import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int n, v[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        n = scanner.nextInt();
        v = new int[n];
        System.out.println("Vetor criado");
        for (int i=0; i <v.length; i++){
            System.out.println(v[i] + " ");
        }
        scanner.close();
    }
}
