package jogo;
public class Jogo {
    
    public static void main(String[] args) throws InterruptedException{
        
        Personagem cacador = new Personagem(10, 0, 0);
        Personagem soneca = new Personagem(1, 1 , 4);
        cacador.setNome("Jonh");
        cacador.cacar();
        Thread.sleep(2000);
        cacador.comer();
        Thread.sleep(2000);
        cacador.dormir();
        Thread.sleep(2000);
        cacador.statusVars();
        
        soneca.setNome("Manuel");
        soneca.cacar();
        Thread.sleep(2000);
        soneca.comer();
        Thread.sleep(2000);
        soneca.cacar();
        Thread.sleep(2000);
        soneca.dormir();
        Thread.sleep(2000);
        soneca.statusVars();

    }
}
