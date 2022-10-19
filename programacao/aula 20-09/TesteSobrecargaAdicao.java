
public class TesteSobrecargaAdicao {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int x = 2, y = 3, z = 4;
        String s1 = "50", s2 = "35";
        float a = 34.6f, b = 45.6f;

        System.out.println(calc.soma(x, y, z));
        System.out.println(calc.soma(z, s1));
        System.out.println(calc.soma(x, y));
        System.out.println(calc.soma(a, b));
        System.out.println(calc.soma(s1, s2));
    }
}
