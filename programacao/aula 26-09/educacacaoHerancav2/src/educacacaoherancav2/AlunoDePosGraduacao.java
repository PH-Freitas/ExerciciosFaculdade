
package educacacaoherancav2;

public class AlunoDePosGraduacao extends Aluno {
    private char conceito;

    AlunoDePosGraduacao(){
        System.out.println("Criando aluno de pos graduacao");
    }
    
    public char getConceito() {
        return this.conceito;
    }

    public void setConceito(char conceito) {
        this.conceito = conceito;
    }
}
