package biblioteca.livros.states;
import biblioteca.livros.Exemplar;

public interface EstadoDisponibilidade {
    void emprestar(Exemplar exemplar);
    void devolver(Exemplar exemplar);
}
