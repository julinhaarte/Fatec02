/*
    
    */
public class PilhaVetor {
    //Atributos são variáveis globais
    int registraTopo=0;
    String[] vetorPilha;
    
    //Construtor
    public PilhaVetor(int tamanho){
        registraTopo=0;
        vetorPilha= new String[tamanho];
    }
        
    //Métodos
    public String empilhar(String entrada){
        if(verificaPilhaCheia()==false){
        vetorPilha[registraTopo]=entrada;
        registraTopo++;}
        
        return "A pilha já está cheia";
        
    }
    
    public String desempilha(){
    if (verificaPilhaVazia()==false){
    registraTopo--;
    return vetorPilha[registraTopo];
    }
    return "A pilha já está vazia";
    }
    
    public boolean verificaPilhaCheia(){
        if (vetorPilha.length==registraTopo)
        return true;
        else
        return false;
    }
    
     public boolean verificaPilhaVazia(){
        if (registraTopo==0)
        return true;
        else
        return false;}
   
}
