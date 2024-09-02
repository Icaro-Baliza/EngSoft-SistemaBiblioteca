package fabricas;
import biblioteca.livros.Livro;
import biblioteca.livros.Exemplar;
import biblioteca.Emprestimo.Emprestimo;
import biblioteca.Emprestimo.Reserva;

import java.util.ArrayList;
import java.util.Date;

public class FabricaBiblioteca {
    public static Livro criarLivro(String codigo, String titulo, String editora, ArrayList<String> autores, String edicao, String anoPublicacao){
        return new Livro(codigo, titulo, editora, autores, edicao, anoPublicacao);
    }

    public static Exemplar criarExemplar(String codigoDoLivro, String nomeDoLivro, String codigoExemplar){
        return new Exemplar(codigoDoLivro, nomeDoLivro, codigoExemplar);
    }

    public static Emprestimo criarEmprestimo(String codigoUsuario, String nomeUsuario, Exemplar exemplar, Date dataEmprestimo, int tempoEmprestimo){
        return new Emprestimo(codigoUsuario, nomeUsuario, exemplar, dataEmprestimo, tempoEmprestimo);
    }

    public static Reserva criarReserva(String codigoLivro, String tituloLivro, String codigoUsuario, String nomeUsuario, Date dataAtual){
        return new Reserva(codigoLivro, tituloLivro, codigoUsuario, nomeUsuario, dataAtual);
    }

}
