
public class Funcionario extends Pessoa {
    
//declaração de variáreis
private String cargo;
private float salarioBase;

//métodos
public Funcionario (String nome){
    super(nome);
}

public Funcionario (String nome, String cargo){
    this(nome);
    this.cargo=cargo;
}

public Funcionario (String nome, String cargo, float salarioBase){
    this(nome, cargo);
    this.salarioBase = salarioBase;
}


public float calculaSalario() {
    return salarioBase;
}

//sets e geters
 public String getCargo(){
 return cargo;
 }
 
 public float getSalario(){
 return salarioBase;
 }
 
 
 /*fim da classe*/
}

