package biblioteca.Emprestimo;

import biblioteca.livros.Exemplar;

import java.util.Date;
import java.util.Calendar;

public class Emprestimo {
    private String codigoUsuario;
    private String nomeUsuario;
    private Exemplar exemplar;

    private Date dataEmprestimo;
    private Date dataDevolucao;


    public Emprestimo(String codigoUsuario, String nomeUsuario, Exemplar exemplar, Date dataEmprestimo, int tempoEmprestimo){
        this.codigoUsuario = codigoUsuario;
        this.nomeUsuario = nomeUsuario;
        this.exemplar = exemplar;
        this.dataEmprestimo = dataEmprestimo;
        this.calculaDataDevolucao(tempoEmprestimo);
    }

    public String getCodigoUsuario(){
        return this.codigoUsuario;
    }

    public String getNomeUsuario(){
        return this.nomeUsuario;
    }

    public Exemplar getExemplar(){
        return this.exemplar;
    }

    public Date getDataEmprestimo(){
        return this.dataEmprestimo;
    }

    public Date getDataDevolucao(){
        return this.dataDevolucao;
    }

    public boolean isAtrasado(Date dataAtual){
        return dataAtual.after(this.dataDevolucao);
    }


    public void calculaDataDevolucao(int tempoDeEmprestimo){
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataEmprestimo);

        calendario.add(Calendar.DAY_OF_MONTH, tempoDeEmprestimo);

        this.dataDevolucao = calendario.getTime();

    }

}
