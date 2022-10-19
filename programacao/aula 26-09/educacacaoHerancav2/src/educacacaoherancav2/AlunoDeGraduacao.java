
package educacacaoherancav2;

public class AlunoDeGraduacao extends Aluno {
    double nota1, nota2, notaFinal;

    AlunoDeGraduacao(){
        System.out.println("Criando aluno de graduacao");
    }
    
    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaFinal() {
        this.notaFinal = (this.nota1 + this.nota2) /2;
        return this.notaFinal;
    }

}
