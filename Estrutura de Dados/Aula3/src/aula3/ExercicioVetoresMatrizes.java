
package aula3;
public class ExercicioVetoresMatrizes {
//Exercício 3: Crie um método que  receba como parâmetro um vetor com números binários com 
//8 posições calcule e retorne o valor em decimal.
  
    public int converterBinarioDecimal(int[] entrada){
        int[] decimal=new int[]{128,64,32,16,8,4,2,1};
        double[] decimalAuto= new double[8];
        int soma=0;
            for(int pot=7;pot>=0;pot--){
            decimalAuto[pot] = Math.pow(2, pot);
            System.out.print(decimalAuto[pot]+"\t");
                    
            soma= soma + (decimal [pot]*entrada[pot]);      
                       
            }
            System.out.println("\n ----ENTRADA----");
            for (int i=0; i<8;i++){      
                System.out.print(entrada[i] + "\t");
            
            }
        System.out.println("Resposta:"+ soma);          
        return soma;
    }
}
