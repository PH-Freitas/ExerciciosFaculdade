public class TesteLivroDeNotas{
    public static void main(String args[]){
        LivroDeNotas livro = new LivroDeNotas("este e meu livro");
        livro.exibirMensagem("bem vindo ao metodo");
        System.out.println(livro.getnomeDocurso());
    }
}