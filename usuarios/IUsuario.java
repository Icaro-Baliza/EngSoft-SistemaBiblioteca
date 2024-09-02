package usuarios;

import biblioteca.Emprestimo.Emprestimo;

import java.util.ArrayList;
import java.util.Date;

public interface IUsuario {
    public String getNome();
    public void setNome(String novoNome);
    public String getCodigo();

    public ArrayList<Emprestimo> getEmprestimos();

    public void addEmprestimo(Emprestimo novoEmprestimo);
    public boolean removerEmprestimo(String codigoExemplar);

    public boolean isDevedor(Date dataAtual);

    public int getTempoEmprestimo();
}