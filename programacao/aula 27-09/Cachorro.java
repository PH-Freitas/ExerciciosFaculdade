public class Cachorro extends Mamifero{
    // construtor = bloco especial de inicialização
    public Cachorro(String nome){
     super(nome, 4);
     System.out.println("O nome do seu cachorro é: " + nome);
     System.out.println("Numero de patas: " + 4);
    }
}
