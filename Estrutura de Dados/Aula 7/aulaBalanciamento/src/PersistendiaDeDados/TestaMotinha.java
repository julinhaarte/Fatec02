
package PersistendiaDeDados;

import java.io.IOException;

public class TestaMotinha {
    public static void main(String[] args) throws IOException{
    Motocicleta motoca= new Motocicleta("Honda","CG 150",100);
    Motocicleta motoca2= new Motocicleta("Honda","CG 150",150);
        System.out.println("Velocidade Atual:"+motoca.getVelocidade());
        motoca.alterarVelocidade(1.5f);
        System.out.println("Velocidade Atual:"+motoca.getVelocidade());
        try{
        Serializador.gravar("motoca.dat", motoca);
    } catch (IOException ex){
            System.out.println("Erro Gravar:"+ex.getMessage());
    }
        try {
            motoca2 = (Motocicleta)
            Serializador.ler("motoca.dat");
        } catch (Exception ex){
            System.out.println("Erro ler:"+ex.getMessage());      
        }
    }
    }
    
