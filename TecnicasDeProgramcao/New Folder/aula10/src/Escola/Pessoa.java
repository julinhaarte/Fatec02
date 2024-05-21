package Escola;


public abstract class Pessoa {
    //Declatação de variáveisbb
    String nome;
    public int idade;
    public String genero;
    
    public Pessoa (String nome,String genero){
    this.nome=nome;
    this.genero=genero;
    }
    
    public Pessoa(String nome, int idade, String genero){
    this(nome, genero); //Chamando o construtor anterior.
    this.idade=idade;
    }
    //Métodos abstratos deverão ser implimentados nas classes filhas
    public abstract String getNome();
    
    public String getGenero(){
     return this.genero;
    }
    
    public int getIdade(){
    return idade;
    }
    
    public void setNome(){
    this.nome=nome;
    }
    
    public void setIdade(){
    this.idade=idade;
    }
    
    public void setGenero(){
    this.genero=genero;
    }
}
