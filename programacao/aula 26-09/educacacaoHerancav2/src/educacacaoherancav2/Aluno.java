
package educacacaoherancav2;

public class Aluno extends Pessoa{
    private int ra;
      
    Aluno(){
        super("jose", 33);
        System.out.println("Criando aluno");
    }
    
    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    
}
