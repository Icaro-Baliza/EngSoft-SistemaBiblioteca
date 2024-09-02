package usuarios.Aluno;

import usuarios.estrategias.qtdEmprestimos.IEstrategiaQtdEmprestimos;
import usuarios.estrategias.tempoEmprestimo.IEstrategiaTempoEmprestimo;

public class AlunoPos extends AlunoGenerico{

    public AlunoPos(String codigo, String nome, IEstrategiaTempoEmprestimo estrategiaEmprestimo, IEstrategiaQtdEmprestimos qtdEmprestimos){
        super(codigo, nome, estrategiaEmprestimo, qtdEmprestimos);
    }

}
