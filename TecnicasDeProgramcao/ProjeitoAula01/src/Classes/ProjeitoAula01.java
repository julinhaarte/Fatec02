package Classes;

/**
 *
 * @author Alunos
 */
public class ProjeitoAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pessoa pai;
    pai = new Pessoa();
    pai.nome="Robson";
    pai.qtdFilhos=2;
    pai.qtdIrmaos=3;
    System.out.println(pai.Apresentar());
    System.out.println(pai.ApresentarFilhos());
    
    Pessoa mae;
    mae = new Pessoa ();
    mae.nome ="Cleide";
    mae.qtdFilhos=2;
    mae.qtdIrmaos=5;
    mae.nomeFilhos[0]="Lilian";
    mae.nomeFilhos[1]="Julinha";
    
    System.out.println(mae.Apresentar());
    System.out.println(mae.ApresentarFilhos());
    

          
    }
    
}
