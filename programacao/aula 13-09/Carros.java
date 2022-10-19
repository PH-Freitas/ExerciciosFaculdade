public class Carros {
private int anodefabricação;
private String modelo;
private double velocidade;

 public Carros (int anodefabricação, String modelo, double velocidade ){
     this.setAnodefabricação(anodefabricação);
     this.setModelo(modelo);
     this.setVelocidade(velocidade);
 }
 public void Carro2(int anodefabricação, String modelo, double velocidade){
     
 }
 public int getAnodefabricação() {
    return this.anodefabricação;
 }
 public int setAnodefabricação(int anodefabricação){
 return this.anodefabricação = anodefabricação;
 }
 public String getModelo(){
     return this.modelo;
 }
 public String setModelo(String modelo){
      return this.modelo = modelo;
 }
 public double getVelocidade(){
     return this.velocidade;
 }
 public double setVelocidade(double velocidade){
     return this.velocidade = velocidade;
 }
}