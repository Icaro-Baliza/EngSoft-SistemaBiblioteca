package usuarios.Aluno;

import biblioteca.Emprestimo.Reserva;
import usuarios.UsuarioGenerico;
import usuarios.estrategias.qtdEmprestimos.IEstrategiaQtdEmprestimos;
import usuarios.estrategias.tempoEmprestimo.IEstrategiaTempoEmprestimo;

import java.util.ArrayList;

public class AlunoGenerico extends UsuarioGenerico implements IAluno{
    protected ArrayList<Reserva> reservas;
    protected IEstrategiaQtdEmprestimos qtdEmprestimos;

    public AlunoGenerico(String codigo, String nome, IEstrategiaTempoEmprestimo estrategiaEmprestimo, IEstrategiaQtdEmprestimos qtdEmprestimos){
        super(codigo, nome, estrategiaEmprestimo);
        this.reservas = new ArrayList<>();
        this.qtdEmprestimos = qtdEmprestimos;
    }

    public ArrayList<Reserva> getReservas(){
        return this.reservas;
    }

    public void addReserva(Reserva novaReserva){
        this.reservas.add(novaReserva);
    }

    public void setQtdEmprestimos(IEstrategiaQtdEmprestimos qtdEmprestimos){
        this.qtdEmprestimos = qtdEmprestimos;
    }

    public boolean removerReserva(String codigoDoLivro){
        for(Reserva reserva: this.reservas){
            if(reserva.getCodigoLivro() == codigoDoLivro){
                this.reservas.remove(reserva);
                return true;
            }
        }
        return false;
    }
}
