package Classes;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da classe//
    String nome;
    int qtdFilhos, qtdIrmaos;
    String[] nomeFilhos= new String[20];
    
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

