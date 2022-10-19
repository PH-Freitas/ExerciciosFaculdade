public class Carro{
    //atributos
    private int anofabricacao;
    private String modelo;
    private double velocidade;
    //construtores
    public Carro (String modelo, int anofabricacao, double velocidade){
        this.setModelo(modelo);
        this.setAnoFabricacao(anofabricacao);
        this.setVelocidade(velocidade);
    }
    //redefinido o construtor padrao
    public Carro(){}

    //getters = ver atributos
    public String getModelo() {
        return this.modelo;
    }
    public int getAnoFabricacao(){
     return this.anofabricacao;
    }
    public double getVelocidade() {
        return this.velocidade;
    }
    //setters = alterar os valores
   public void setModelo(String modelo) {
    this.modelo = modelo;
   }
   public void setAnoFabricacao(int anofabricacao) {
    this.anofabricacao = anofabricacao;
   }
   public void setVelocidade(double velocidade) {
    if(velocidade > 300) {
        this.velocidade = 300;
    } else{
        this.velocidade = velocidade;
    }
   }
   // outros
   public void acelerar(double aceleracao) {
    this.velocidade = this.velocidade + aceleracao;
 }
   public void escolher(String modelo){
    this.modelo = modelo;
 }
}