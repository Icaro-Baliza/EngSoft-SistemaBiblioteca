package biblioteca.livros;
import java.util.ArrayList;

import ObservadorLivro.Observer;
import biblioteca.Emprestimo.Reserva;

public class Livro {
    private String codigo;
    private String titulo;
    private String editora;
    private ArrayList<String> autores;
    private String edicao;
    private String anoPublicacao;

    
    private ArrayList<Exemplar> listExemplares;
    private ArrayList<Reserva> listReservas;
    private ArrayList<Observer> listObservers;

    public Livro(String codigo, String titulo, String editora, ArrayList<String> autores, String edicao, String anoPublicacao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;


        this.listExemplares = new ArrayList<>();

        this.listReservas = new ArrayList<>();

        this.listObservers = new ArrayList<>();
    }

    public String getCodigo(){
        return this.codigo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public ArrayList<String> getAutores(){
        return this.autores;
    }

    public String getanoDePublicacao() {
        return this.anoPublicacao;
    }

    public ArrayList<Exemplar> getExemplares(){
        return this.listExemplares;
    }
    
    public ArrayList<Observer> getObservers(){
        return this.listObservers;
    }

    public ArrayList<Reserva> getReservas(){
        return this.listReservas;
    }

    public void addExemplar(Exemplar novoExemplar){
        this.listExemplares.add(novoExemplar);
    }

    public int getQtdReservas(){
        return this.listReservas.size();
    }

    public int getQtdObservers(){
        return this.listObservers.size();
    } 
    
    public int getQtdExemplares(){
        return this.listExemplares.size();
    }

    public int getQtdExemplaresDisponiveis(){
        return this.getExemplaresDisponiveis().size();
    }

    public ArrayList<Exemplar> getExemplaresDisponiveis(){
        ArrayList<Exemplar> listExemplaresDisponiveis = new ArrayList<>();
        for(Exemplar exemplar: this.listExemplares){
            if(exemplar.isDisponivel()){
                listExemplaresDisponiveis.add(exemplar);
            }
        }
        return listExemplaresDisponiveis;
    }

    public ArrayList<Exemplar> getExemplaresEmprestados(){
        ArrayList<Exemplar> listExemplaresEmprestados = new ArrayList<>();
        for(Exemplar exemplar: this.listExemplares){
            if(!exemplar.isDisponivel()){
                listExemplaresEmprestados.add(exemplar);
            }
        }
        return listExemplaresEmprestados;        
    }

    public boolean removeExemplar(String codigoExemplar){
        for(Exemplar exemplar: this.listExemplares){
            if(exemplar.getCodigoExemplar() == codigoExemplar){
                this.listExemplares.remove(exemplar);
                return true;
            }
        }
        return false;
    }

    public void addReserva(Reserva novaReserva){
        this.listReservas.add(novaReserva);

        if (this.getQtdReservas()>2){
            notificarObservadores();
        }
    }

    public boolean removeReserva(String codigoUsuario){
        for(Reserva reserva: this.listReservas){
            if(reserva.getCodigoUsuario() == codigoUsuario){
                this.listReservas.remove(reserva);
                return true;
            }
        }
        return false;
    }

    public void addObserver(Observer observer){
        this.listObservers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.listObservers.remove(observer);
    }

    public void notificarObservadores(){
        for(Observer observer: this.listObservers){
            observer.update(this);
        }
    }

}
