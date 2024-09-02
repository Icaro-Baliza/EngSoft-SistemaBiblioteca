package biblioteca.livros.states;

import biblioteca.livros.Exemplar;

public class Disponivel implements EstadoDisponibilidade{
    private static Disponivel instance;

    private Disponivel(){}

    public static Disponivel getInstance(){
        if(instance == null){
            instance = new Disponivel();
        }
        return instance;
    }

    public void emprestar(Exemplar exemplar){
        System.out.println("Emprestando o exemplar " + exemplar.getCodigoExemplar());
        exemplar.setStatus(Emprestado.getInstance());        
    }

    public void devolver(Exemplar exemplar){
        System.out.println("O exemplar " + exemplar.getCodigoExemplar() + " já estava disponível");
    }    
}
