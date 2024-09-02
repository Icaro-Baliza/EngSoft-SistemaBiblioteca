package biblioteca.livros.states;
import biblioteca.livros.Exemplar;

public class Emprestado implements EstadoDisponibilidade{
    private static Emprestado instance;

    private Emprestado(){}

    public static Emprestado getInstance(){
        if(instance == null){
            instance = new Emprestado();
        }
        return instance;
    }

    public void emprestar(Exemplar exemplar){
        System.out.println("O exemplar " + exemplar.getCodigoExemplar() + " está indisponível");
        
    }

    public void devolver(Exemplar exemplar){
        System.out.println("O exemplar  " + exemplar.getCodigoExemplar() + " foi devolvido");
        exemplar.setStatus(Disponivel.getInstance());
    }
}
