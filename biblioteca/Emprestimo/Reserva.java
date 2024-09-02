package biblioteca.Emprestimo;

import java.util.Date;

public class Reserva {
    private String codigoLivro;
    private String tituloLivro;
    private String codigoUsuario;
    private String nomeUsuario;

    private Date dataReserva;

    public Reserva(String codigoLivro, String tituloLivro, String codigoUsuario, String nomeUsuario, Date dataAtual){
        this.codigoLivro = codigoLivro;
        this.tituloLivro = tituloLivro;
        this.codigoUsuario = codigoUsuario;
        this.nomeUsuario = nomeUsuario;
        this.dataReserva = dataAtual;
    }

    public String getCodigoLivro(){
        return this.codigoLivro;
    }

    public String getTituloLivro(){
        return this.tituloLivro;
    }

    public String getCodigoUsuario(){
        return this.codigoUsuario;
    }

    public String getNomeUsario(){
        return this.nomeUsuario;
    }

    public Date getDataReserva(){
        return this.dataReserva;
    }
}
