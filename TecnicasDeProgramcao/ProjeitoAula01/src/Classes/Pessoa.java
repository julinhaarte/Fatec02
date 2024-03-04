package Classes;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da classe//
    private String nome;
    private int qtdFilhos, qtdIrmaos;
    private String[] nomeFilhos= new String[20];
    private String cpf;
    
    /* METODO CONSTRUTOR*/
    public Pessoa(String nome){
        this.nome= "Sr." + nome;
    }
    
    public Pessoa(String nome, String cpf) {
        this(nome); /*chama o construtor*/
        this.cpf = cpf;
    }
    
    
    /********** METODO SETTER********/
    public void setCpf(String cpf){
        if (this.cpf==null)
       /*veriica se o cpf é nulo*/
        this.cpf=cpf;
 
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setQtdFilhos(){
        this.qtdFilhos=qtdFilhos;
    }
    
    public int getQtdFilhos(){
        return this.qtdFilhos;
    }
    
    public void setQtdIrmaos(){
        this.qtdIrmaos=qtdIrmaos;
    }
    
    public int getQtdIrmaos(){
        return this.qtdIrmaos;
    }
    
    public void setNomeFilhos(){
        this.nomeFilhos=nomeFilhos;
    }
    
    public String[] getNomeFilhos(){
        return this.nomeFilhos;
    }
    
    public void setNome(){
        this.nome=nome;
    }   
    public String getNome(){
    return this.nome;
    
    
    }
    
    //Método "Apresentar", remponde com o Nome concatenado com a quantidade de filhos.
    //
   public String Apresentar(){
     return nome + " possuí " + qtdFilhos + " filhos!";  
   }
   
   //Método "ApresentarFilhos", responde com o nome dos filhos.//
   public String ApresentarFilhos(){
       String resposta="Meus filhos são ";
       int qtdFilhosAux=0;
       for (int i=0;i<20;i++) {
           
           if (nomeFilhos[i]!=null){
               qtdFilhosAux++;
               resposta=resposta+nomeFilhos[i]+",";
           }
           if (qtdFilhosAux>0) {
               return resposta + "QTD Filhos:" + qtdFilhosAux;
        
           }
           else 
               return "Não tem filhos";
              
           
           
       }
       
       return resposta + "Quantidade de filhos: " + qtdFilhosAux;
   }
}

