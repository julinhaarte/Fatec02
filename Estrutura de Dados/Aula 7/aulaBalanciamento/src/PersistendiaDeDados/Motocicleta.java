
package PersistendiaDeDados;

import java.io.Serializable;


public class Motocicleta implements Serializable {
    // Atributos
    private String marca, modelo;
    private float velocidade;

    public float getVelocidade() {
        return velocidade;
    }
    
    //Construtor
    public Motocicleta (String marca, String modelo, int vel){
    this.marca=marca;
    this.modelo=modelo;
    this.velocidade=vel;
    }
    
    public float alterarVelocidade(float fatorAceleracao){
    velocidade=velocidade*fatorAceleracao;
    return velocidade;
    }
    
    public float parar(){
    velocidade=0;
    return velocidade;
    }
}
