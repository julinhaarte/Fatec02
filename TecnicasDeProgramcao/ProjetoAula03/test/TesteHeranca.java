

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteHeranca {
    
    
  
    public void testeFuncionario(){
        
        float salario=2500.f;
              
        Funcionario f1= new Funcionario("José","Tio da Limpeza", salario);
        System.out.println("Nome:"+ f1.getNome()+" Cargo: " +f1.getCargo() + " Salário: " + f1.calculaSalario());
        //assertEquals(salario, f1.calculaSalario(),0);
        
    }
   
    public void testeAluno(){        
        Aluno a1= new Aluno("Maria");
               
        for(int i=0; i<10; i++){
            a1.addNota(i);
        }
        System.out.println("Média: " + a1.calculaMedia());
       // assertEquals(4.5f,a1.calculaMedia(),0);
    }
    
}