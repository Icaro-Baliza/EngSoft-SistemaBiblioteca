import java.util.ArrayList;

public class Livro {
    private String codigo;
    private String titulo;
    private String editora;
    private ArrayList<String> autores;
    private String edicao;
    private String anoPublicacao;

    private ArrayList<Exemplar> exemplares;

    public Livro(String codigo, String titulo, String editora, ArrayList<String> autores, String edicao, String anoPublicacao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }



}
