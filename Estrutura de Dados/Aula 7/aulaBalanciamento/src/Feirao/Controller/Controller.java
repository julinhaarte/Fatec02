
package Feirao.Controller;

import Feirao.Model.*;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    private List<Veiculos> listaVeiculo;
    private List<Pessoa> listaPessoa;
    
    public Controller(){
    listaPessoa = new ArrayList<Pessoa>();
    listaVeiculo = new ArrayList<Veiculos>();}
    
    public void cadastrarPessoa(String nome, String telefone, String cpf){
     listaPessoa.add(new Pessoa(nome, telefone, cpf));   
    }
}
