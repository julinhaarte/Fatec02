public class Pessoa {

    
    //Atributos
    private String nome;
    private String cpf;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos=new Pessoa[10];
    private int qtdFilhos=0;
    private int qtdIrmaos=0;
    private Pessoa[] listaIrmaos = new Pessoa[10];
    //////////// Construtores 
    public Pessoa(String nome){
     this.nome=nome;
    }
    
    public Pessoa (String nome, Pessoa mae){
        this(nome);
        this.mae=mae;
        mae.addFilho(this);
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
    
   
    
    //método para adicionar filho
 public void addFilho(Pessoa filho){
     //devemos verificar se na lista de filhos já existe o objeto antes de adicionar ele.
    boolean encontrei = false;
     for (int i=0; i<qtdFilhos; i++){
        if (filho.equals (listaFilhos[i]))
            encontrei=true;
    }
         if (encontrei == false) {
            listaFilhos[qtdFilhos]=filho;
            qtdFilhos++;
         }
    }
 public void addIrmaos(Pessoa irmao){
     
    listaIrmaos[qtdIrmaos]=irmao;
    qtdIrmaos++;
    this.mae.addFilho(irmao);
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
