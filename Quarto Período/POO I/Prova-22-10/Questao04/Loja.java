/*Escreva uma classe Produto que contenha os atributos nome, qtdeAtual e qtdeMinima.
Esta classe deve conter, além dos métodos de acesso (get e set, nenhum parâmetro pode ser negativo), 
dois construtores, um que não passa parâmetros algum e outro que passe como parâmetros o valor dos 3 
atributos. Também deve conter o método:
- repoe(int qtde) [Este método aumenta o valor da qtdeAtual].
- toString() [Este método mostra as características do Produto].
Crie uma classe Loja que contenha os atributos nome e um arrayList de produtos. Além dos métodos de acesso, ela deve conter os seguintes métodos:
- mostraQuantidadeProdutos(); //Mostra todos produtos com as respectivas quantidades;
- mostraQuantidadeProdutos(String nome); //Mostra a quantidade de um produto específico;
- mostraProdutosAbaixoDoMinimo(); (Este exibe apenas os produtos que estão abaixo da quantidade mínima);
- totalProdutos(); (Este exibe o somatório de todos produtos da lista);
Crie uma classe Testa com um método main e um menu para interagir com a loja. 
- Faça testes e boa sorte!!!
 */

package Questao04;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private Produto produto;
    private ArrayList<Produto> Produtos = new ArrayList<>();

    public Produto getProduto() {
        return produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        Produtos = produtos;
    }

    public String mostraQuantidadeProdutos() {
        String produtoInf = "\t";

        for (Produto a : Produtos) {
            produtoInf += "\n" + a.toString();
        }
        return produtoInf;
    }

    public String mostraQuantidadeProdutos(String nome) {
        String produtoInf = "\t";

        for (Produto a : Produtos) {
            if (a.getNome().equals(nome)) {
                produtoInf += "\n" + a.toString();
            }
        }
        return produtoInf;
    }

    public String mostraProdutosAbaixoDoMinimo() {
        String produtoInf = "\t";

        for (Produto a : Produtos) {
            if (a.getQtdeAtual() < a.getQtdeMinima()) {
                produtoInf += "\n" + a.toString();
            }
        }
        return produtoInf;
    }

    public int totalProdutos() {
        int produtoInf = 0;

        for (Produto a : Produtos) {

            produtoInf += a.getQtdeAtual();

        }
        return produtoInf;
    }

    public void adicionarProduto(Produto produto) {
        Produtos.add(produto);
    }

}
