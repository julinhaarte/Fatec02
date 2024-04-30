
import java.util.Scanner;


public class Menu {
    
    public void Menu() {
    
    Scanner input = new Scanner(System.in);
    int A;
    int B;
    
    Calculadora contas = new Calculadora();
    
    int comando =-1;
    while (comando != 0){
        System.out.println("Escolha a opçã: \n" + "1-Somar \n" + 
                "2-Subtrair \n" + "3-Multiplicar \n"+ "4-Dividir \n" + "0-Sair");
    comando = input.nextInt();
    if (comando == 1){
        contas.soma();
    }
    
    if (comando == 2){
        contas.subtracao();
    } 
    
    if (comando == 3){
        contas.multiplicacao();
    } 
    
    if (comando == 4){
        contas.divisao();
    } 
}
    
    
}
}