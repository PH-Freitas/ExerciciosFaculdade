
package educacacaoherancav2;

public class Professor extends Pessoa {
    private int matricula;
    
    Professor(){
        super("carlos", 33);
        System.out.println("criando professor");
    }
    public void Lecionando(){
        System.out.println(getNome() + "Lecionando");
    }
}
