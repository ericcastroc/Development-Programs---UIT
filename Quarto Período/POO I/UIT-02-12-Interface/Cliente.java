/*Crie a classe Cliente que herda de Pessoa e possui as propriedades: ativo e uma lista de produtos. Crie métodos como adiciona produto, etc. */

import java.util.ArrayList;

public class Cliente extends Pessoa{

    private boolean ativo;
    private Produto produto;
    private ArrayList<Produto> Produtos = new ArrayList<>();


    public Cliente(String nome, String endereco) {
        super(nome, endereco);
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar(){
        this.ativo = true;
    }

    public void desativar(){
        this.ativo = false;
    }

    public Produto getProduto() {
        return produto;
    }

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        Produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        if(isAtivo()==true){
        Produtos.add(produto);
        }
    }

    @Override
    public void mostraTipo() {
        for(Produto p : Produtos){
            System.out.println(p.toString());
        }
          
    }

    

    

    
    
}
