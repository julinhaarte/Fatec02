
package Escola;

public abstract class Fundamental extends Aluno {
    
    public Fundamental(String nome, String genero) {
        super(nome, genero);
    }

    public Fundamental(String nome, int idade, String genero) {
        super(nome, idade, genero);
    }
    
}
