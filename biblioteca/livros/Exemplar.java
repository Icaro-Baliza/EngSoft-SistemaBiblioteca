package biblioteca.livros;
import biblioteca.livros.states.*;



public class Exemplar {
    private String codigoDoLivro;
    private String nomeDoLivro;
    private String codigoExemplar;
    private EstadoDisponibilidade statusDisponibilidade = Disponivel.getInstance();


    public Exemplar(String codigoDoLivro, String nomeDoLivro, String codigoExemplar){
        this.codigoDoLivro = codigoDoLivro;
        this.codigoExemplar = codigoExemplar;
    }

    public String getCodigoDoLivro() {
        return codigoDoLivro;
    }

    public String getNomeDoLivro(){
        return nomeDoLivro;
    }

    public String getCodigoExemplar() {
        return codigoExemplar;
    }

    public void emprestar(){
        this.statusDisponibilidade.emprestar(this);
    }

    public void devolver(){
        this.statusDisponibilidade.devolver(this);
    }
    
    public void setStatus(EstadoDisponibilidade newStatus){
        this.statusDisponibilidade = newStatus;
    }

    public boolean isDisponivel(){
        if(this.statusDisponibilidade instanceof Disponivel){
            return true;
        }
        return false;
    }


    
}
