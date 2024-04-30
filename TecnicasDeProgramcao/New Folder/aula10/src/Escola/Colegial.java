
package Escola;

public abstract class Colegial extends Aluno {
    
    public Colegial(String nome, String genero) {
        super(nome, genero);
    }

    public Colegial(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
  
    @Override
    public String getNota(){
    return nota;}
}
