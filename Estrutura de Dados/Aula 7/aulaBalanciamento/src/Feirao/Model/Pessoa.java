package Feirao.Model;




public class Pessoa {
    //Atributos
    protected String nome;
    private int idade;
    private String genero;
    public String telefone;
    public String cpf;
    
    /**
     *
     * @param nome
     * @param genero
     * @param cpf
     */
    public Pessoa (String nome, String cpf){
        this.nome=nome;
      
        this.cpf=cpf;
    }
    public Pessoa(String nome, String telefone, String cpf){
        this.nome=nome;
        this.telefone=telefone;
        this.cpf=cpf;
        
    }
    // Métodos abstratos deverão ser implementados nas
    // classes filhas.
    public String getNome(){
        return this.nome;}
    
    public String getGenero(){
        return this.genero;
    }
    public int getIdade(){
        return this.idade;
    }
}
