public class ProjetoAula03 {

   
    public static void main(String[] args) {
        Pessoa maeDoJoao = new Pessoa("Mae") ;
        Pessoa Joao=new Pessoa("joão",maeDoJoao);
        Pessoa irmaoDoJoao = new Pessoa("Jorel", maeDoJoao);
        System.out.println("Nome "+ Joao.getNome());
        Joao.setNome("João Pedro ferraz");
        System.out.println("Nome "+ Joao.getNome());
        maeDoJoao.addFilho(Joao);
        maeDoJoao.addFilho(irmaoDoJoao);
        System.out.println("Mãe do João: " + Joao.getMae().getNome());
        //System.out.println("Irmão do João: " + Joao.getMae().getListaFilho()[1].getNome());
        System.out.println("Filhos da "+maeDoJoao.getNome()+" "+maeDoJoao.filhosListados());
    }
    
}
