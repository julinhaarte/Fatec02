public class principal {

    public static void main(String[] args) {
        PilhaVetor pilhaA = new PilhaVetor(4);
        
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        System.out.println(pilhaA.empilhar("Z"));
                 
        /*System.out.println("Pilha cheia?:"+pilhaA.verificaPilhaCheia());
        System.out.println("Desempilhar:"+pilhaA.desempilha());
        System.out.println("Desempilhar:"+pilhaA.desempilha());
        System.out.println("Desemprilhar:"+pilhaA.desempilha());
        System.out.println("Desemprilhar:"+pilhaA.desempilha());
        System.out.println("Pilha vazia?:"+pilhaA.verificaPilhaVazia());
        System.out.println("Desemprilhar:"+pilhaA.desempilha());*/
    }
    
}
