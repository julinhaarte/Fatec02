/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class ExercicioVetoresMatrizes {
//Exercício 3: Crie um método que  receba como parâmetro um vetor com números binários com 
//8 posições calcule e retorne o valor em decimal.
  
    public int converterBinarioDecimal(int[] entrada){
        int[] decimal=new int[]{128,64,32,16,8,4,2,1};
        double[] decimalAuto= new double[8];
            for(int pot=0;pot<8;pot++){
            decimalAuto[pot] = Math.pow(2, pot);
            System.out.print(decimalAuto);
                    
                  
                  
                  
            }
                  
                  
        return 0;
    }
    
    
}
