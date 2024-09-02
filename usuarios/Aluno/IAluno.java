package usuarios.Aluno;

import biblioteca.Emprestimo.Reserva;
import usuarios.estrategias.qtdEmprestimos.IEstrategiaQtdEmprestimos;

import java.util.ArrayList;


public interface IAluno {
    public ArrayList<Reserva> getReservas();

    public void addReserva(Reserva novaReserva);
    public boolean removerReserva(String codigoDoLivro);
    public void setQtdEmprestimos(IEstrategiaQtdEmprestimos qtdEmprestimos);
}
