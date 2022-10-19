public class LivroDeNotas{

private String nomeDocurso;

public LivroDeNotas(){
    setnomeDocurso("atribuiu na construcao");
}

public LivroDeNotas( String nome){
    setnomeDocurso(nome);
}

    public void exibirMensagem( String msg ) {
        System.out.println(msg);
    }
    public void setnomeDocurso( String nomeCurso ){
        this.nomeDocurso = nomeCurso;
    }

    public String getnomeDocurso(){
        return this.nomeDocurso;
    }
}