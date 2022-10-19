import java.util.Random;
public class valoresRandomicos{
    public static void main(String args[]){
     System.out.println("um decimal com classe Math: " + Math.random());
     
     Random random = new Random();
     System.out.println("um decimal com classe Math: " + random.nextDouble());

     System.out.println("um inteiro qualquer: " + random.nextInt(10));
     System.out.println("um inteiro entre 0 e 99: " + random.nextInt(100));
     System.out.println("um booleano: " + random.nextBoolean());
    }
}