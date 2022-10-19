import java.util.Random;
import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        int v[] = new int[n];
        Random random = new Random();
        for(int i = 0; i < v.length; i++){
            v[i] = random.nextInt(10);
            System.out.println(v[i]+ " ");
        }
        scanner.close();
    }  
}
