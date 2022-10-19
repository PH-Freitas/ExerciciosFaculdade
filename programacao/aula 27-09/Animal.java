public class Animal{
    private String nome;
    private int patas;
    //construtores com carga
    // sem parâmetros e todos os atributos sao zerados.
    public Animal(){
        
    }
    public Animal(String nome){
     this.nome = nome;
    }
    public Animal(String nome, int patas){
        this.nome = nome;
        this.patas = patas;
    }
}