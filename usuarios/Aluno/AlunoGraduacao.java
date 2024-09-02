package usuarios.Aluno;

import usuarios.estrategias.qtdEmprestimos.IEstrategiaQtdEmprestimos;
import usuarios.estrategias.tempoEmprestimo.IEstrategiaTempoEmprestimo;

public class AlunoGraduacao extends AlunoGenerico{

    public AlunoGraduacao(String codigo, String nome, IEstrategiaTempoEmprestimo estrategiaEmprestimo, IEstrategiaQtdEmprestimos qtdEmprestimos){
        super(codigo, nome, estrategiaEmprestimo, qtdEmprestimos);
    }

}
