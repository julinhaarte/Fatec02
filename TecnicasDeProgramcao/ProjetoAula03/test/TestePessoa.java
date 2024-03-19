
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestePessoa {
    
@Test
public void TesteArvoreGenealogica(){
    Pessoa maria = new Pessoa("Maria");
    Pessoa isabela = new Pessoa("Isabela",maria);
    Pessoa bia = new Pessoa("Bia",isabela);
    System.out.println(bia.ArvoreGenealogica());
    assertEquals("Maria->Isabela->Bia", bia.ArvoreGenealogica());
}

   
    
}
