package fabricas;

import usuarios.Aluno.AlunoGraduacao;
import usuarios.Aluno.AlunoPos;
import usuarios.Professor.Professor;
import usuarios.estrategias.qtdEmprestimos.EstrategiaQtdEmprestimosGraduacao;
import usuarios.estrategias.qtdEmprestimos.EstrategiaQtdEmprestimosPos;
import usuarios.estrategias.tempoEmprestimo.EstrategiaTempoEmprestimoAlunoGraduacao;
import usuarios.estrategias.tempoEmprestimo.EstrategiaTempoEmprestimoAlunoPos;
import usuarios.estrategias.tempoEmprestimo.EstrategiaTempoEmprestimoProfessor;

public class FabricaUsuarios {
    public static AlunoGraduacao criarAlunoGraduacao(String codigo, String nome){
        EstrategiaTempoEmprestimoAlunoGraduacao estrategiaTempoEmprestimo = new EstrategiaTempoEmprestimoAlunoGraduacao();

        EstrategiaQtdEmprestimosGraduacao qtdEmprestimos = new EstrategiaQtdEmprestimosGraduacao();


        return new AlunoGraduacao(codigo, nome, estrategiaTempoEmprestimo, qtdEmprestimos);
    }

    public static AlunoPos criarAlunoPos(String codigo, String nome){

        EstrategiaTempoEmprestimoAlunoPos estrategiaTempoEmprestimo = new EstrategiaTempoEmprestimoAlunoPos();

        EstrategiaQtdEmprestimosPos qtdEmprestimos = new EstrategiaQtdEmprestimosPos();

        return new AlunoPos(codigo, nome, estrategiaTempoEmprestimo, qtdEmprestimos);
    }

    public static Professor criaProfessor(String codigo, String nome){
        EstrategiaTempoEmprestimoProfessor estrategiaTempo = new EstrategiaTempoEmprestimoProfessor();
        return new Professor(codigo, nome, estrategiaTempo);
    }


}
