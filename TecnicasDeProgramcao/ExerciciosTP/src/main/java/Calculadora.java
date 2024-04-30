
import java.util.Scanner;

public class Calculadora {

    //Declaração de variáveis
    int A;
    int B;
    int resultado;

    // scanner para pegar valores de entrada
    Scanner input = new Scanner(System.in);

    //Getters e Setters
    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int multiplicacao() {
        System.out.println("Insira o valor A:");
        int A = input.nextInt();
        System.out.println("Insira o valor B:");
        int B = input.nextInt();
        resultado = A * B;
        System.out.println("O resultado é: " + resultado);
        return resultado;
    }

    public int divisao() {
        System.out.println("Insira o valor A:");
        int A = input.nextInt();
        System.out.println("Insira o valor B:");
        int B = input.nextInt();

        if (B == 0) {
            System.out.println("Não pode dividir!");
        } else {
            resultado = A / B;
            System.out.println("O resultado é: " + resultado);
        }

        return resultado;
    }

    public int soma() {
        System.out.println("Insira o valor A:");
        int A = input.nextInt();
        System.out.println("Insira o valor B:");
        int B = input.nextInt();
        resultado = A + B;
        System.out.println("O resultado é: " + resultado);
        return resultado;
    }

    public int subtracao() {
        System.out.println("Insira o valor A:");
        int A = input.nextInt();
        System.out.println("Insira o valor B:");
        int B = input.nextInt();
        resultado = A - B;
        System.out.println("O resultado é: " + resultado);
        return resultado;
    }

}
