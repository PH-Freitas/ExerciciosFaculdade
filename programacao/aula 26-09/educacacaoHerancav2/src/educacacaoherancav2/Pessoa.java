
package educacacaoherancav2;

public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(){
        System.out.println("Criando pessoa");
    }
    Pessoa(String nome, int idade){
        System.out.println("nome " + nome + " idade " + idade);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
