public class CalculadoraCientifica {
    public double raiz(int a){
        return Math.sqrt(a);
    }
    public double raiz(double b){
        return Math.sqrt(b);
    }
    public double raiz(String c){
        double d = Double.parseDouble(c);
        return Math.sqrt(d);
    }
    public double potencia(byte a , byte b){
        return Math.pow(a, b);
    }
    public double potencia(String s1 , String s2){
        double s11 = Double.parseDouble(s1);
        double s22 = Double.parseDouble(s2);
        return Math.pow(s11, s22);
    }
    public double potencia(int b , double c){
        return Math.pow(b, c);
    }
}
