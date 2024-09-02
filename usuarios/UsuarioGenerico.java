package usuarios;

import biblioteca.Emprestimo.Emprestimo;
import usuarios.estrategias.tempoEmprestimo.IEstrategiaTempoEmprestimo;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioGenerico implements IUsuario{
    protected String codigo;
    protected String nome;

    protected IEstrategiaTempoEmprestimo estrategiaEmprestimo;

    protected ArrayList<Emprestimo> emprestimos;

    public UsuarioGenerico(String codigo, String nome, IEstrategiaTempoEmprestimo estrategiaEmprestimo){
        this.codigo = codigo;
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
        this.estrategiaEmprestimo = estrategiaEmprestimo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public ArrayList<Emprestimo> getEmprestimos(){
        return this.emprestimos;
    }

    public void addEmprestimo(Emprestimo novoEmprestimo){
        this.emprestimos.add(novoEmprestimo);
    }

    public boolean removerEmprestimo(String codigoExemplar){
        for(Emprestimo emprestimo: this.emprestimos){
            if(emprestimo.getExemplar().getCodigoExemplar() == codigoExemplar){
                this.emprestimos.remove(emprestimo);
                return true;
            }
        }
        return false;
    }

    public boolean isDevedor(Date dataAtual){
        for(Emprestimo emprestimo: this.emprestimos){
            if(emprestimo.isAtrasado(dataAtual)){
                return true;
            }
        }
        return false;
    }

    public int getTempoEmprestimo(){
        return this.estrategiaEmprestimo.getTempoEmprestimo();
    }

}
