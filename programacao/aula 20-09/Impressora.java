public class Impressora {
    public float exibir(float a){
        return a;
    }
    public float exibir(float b, float c){
        return b + c;
    }
    public float exibir(float d, String e){
        return d + Float.parseFloat(e);
    }
    public String exibir(String f, float g){
        return f + g;
    }
    public String exibir(String h, String i, String j){
        return h + i + j;
    }
    public int exibir(int k, int l, String m){
        return k + l + Integer.parseInt(m);
    }
}
