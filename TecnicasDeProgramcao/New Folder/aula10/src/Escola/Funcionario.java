package Escola;

public abstract class Funcionario extends Pessoa {
    
    public Funcionario(String nome, String genero){
    super(nome,genero);}
    
    public Funcionario(String nome, int idade, String genero){
    super(nome,idade,genero);}
    
    
    
    @Override
    public String getNome(){
        if (super.genero.equals("FEMININO")){
            return "Sra. "+super.nome;}
        else{
            return "Sr. "+super.nome;}
    }
    
}
