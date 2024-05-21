
public class Aluno extends Pessoa{
    private float[] notas;
    private int indice=0;
//métodos
public Aluno (String nome){
super(nome);
}    

public Aluno (String nome, float[] notas){
    this(nome);
    this.notas = new float[10];
}

public float calculaMedia(){

return 0;
}

// add notas
public void addNota(float nota) {
   notas[indice] = nota;
   indice++;
}
       
   

// geters e seters
public float[] getNotas(){
 return notas;
 }
 
 public void setNotas(){
 this.notas=notas;
 }
//fim da clase
}
