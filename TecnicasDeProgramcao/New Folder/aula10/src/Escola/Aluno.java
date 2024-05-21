package Escola;

public abstract class Aluno extends Pessoa {
    protected float nota;
    
    public Aluno(String nome, String genero){
    super(nome, genero);}
    
    public Aluno(String nome, int idade, String genero){
    super(nome, idade, genero);}
    
    @Override
    public String getNome(){
    return super.nome;
    }
    
    public abstract String getNota();
    
    public void setNota(){
     this.nota=nota;}
}