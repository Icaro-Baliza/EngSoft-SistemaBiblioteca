public class Professor implements Usuario{
    private String codigo;
    private String nome;

    public Professor(String codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }

}
