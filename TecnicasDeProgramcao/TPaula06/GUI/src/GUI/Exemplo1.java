package GUI;

import javax.swing.JFrame;

public class Exemplo1 {
    private JFrame janela;
    
    public Exemplo1(){
    janela = new JFrame("Minha Janela"); 
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setSize(400,300);
    janela.setVisible(true);
    
    }
    
    public static void main(String[] args){
        System.out.println("Método principal");
        
    }
}
