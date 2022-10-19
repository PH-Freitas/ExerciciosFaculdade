public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println("Raiz: " + calc.raiz(25));
        System.out.println("Raiz: " + calc.raiz(22.5));
        System.out.println("Raiz: " + calc.raiz("36"));
        System.out.println("Potencia: " + calc.potencia(4, 3));
        System.out.println("Potencia: " + calc.potencia("5", "2"));
        System.out.println("Potencia: " + calc.potencia(4, 3.5));
    }
}
