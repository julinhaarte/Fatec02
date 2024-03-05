public class Pessoa {

    public String getCpf() {
        return cpf;
    }

    public String getGenero() {
        return genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pessoa getMae() {
        return mae;
    }

    
    public Pessoa getPai() {
        return pai;
    
       
    }
     public Pessoa[] getListaFilhos(){
     return listaFilhos;
        }
    //Atributos
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos=new Pessoa[10];
    private int qtdFilhos=0;
    //////////// Construtores 
    public Pessoa(String nome){
     this.nome=nome;
    }
    
    public Pessoa (String nome, Pessoa mae){
        this(nome);
        this.mae=mae;
    }
    
    public Pessoa (String nome, Pessoa mae, Pessoa pai){
        //chama o construtor anterior que contém as infos
        this(nome, mae);
        this.pai=pai;
    }
    //Metodos
    // Metodos Get //
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public Pessoa[] getListaFilho(){
        return listaFilhos;
    }
    
   
    
    //método para adicionar filho
 public void addFilho(Pessoa filho){
    listaFilhos[qtdFilhos]=filho;
    qtdFilhos++;
    
    }
 
public String filhosListados (){
//este método retorn auma string com todos os filhos concatenados.
    String filhos="";
    for (int i = 0; i < qtdFilhos; i++) {
    filhos=filhos + listaFilhos[i].getNome();
    if (i<qtdFilhos-1)filhos+= ", ";
    else filhos+= ".";
    }
    

    return filhos;
    }


}
