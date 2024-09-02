package usuarios.Professor;

import ObservadorLivro.Observer;
import biblioteca.livros.Livro;
import usuarios.UsuarioGenerico;
import usuarios.estrategias.tempoEmprestimo.IEstrategiaTempoEmprestimo;

public class Professor extends UsuarioGenerico implements Observer{

    protected int qtdNotificacoes;

    public Professor(String codigo, String nome, IEstrategiaTempoEmprestimo estrategiaEmprestimo){
        super(codigo, nome, estrategiaEmprestimo);
        this.qtdNotificacoes = 0;
    }

    public void update(Livro livro){
        this.qtdNotificacoes++;
    }

    public int getQtdNotificacoes(){
        return this.qtdNotificacoes;
    }

}
