public class Material {
    protected String titulo;
    protected int anoPublicacao;

    public Material(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
}

class Livro extends Material{
    public Livro(String titulo, int anoPublicacao){
        super(titulo, anoPublicacao);

    }
}

class Revista extends Material {
    public Revista(String titulo, int anoPublicacao){
        super(titulo, anoPublicacao);
    }
}


