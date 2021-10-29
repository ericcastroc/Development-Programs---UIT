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

public class Produto {

    private String nome;
    private int qtdeAtual;
    private int qtdeMinima;
    private int id = 0;
    private static int count = 1;

    public Produto(String nome, int qtdeMinima, int qtdeAtual) {
        this.nome = nome;
        this.qtdeAtual = qtdeAtual;
        this.qtdeMinima = qtdeMinima;
        id = +count;
        count++;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeAtual() {
        return qtdeAtual;
    }

    public void setQtdeAtual(int qtdeAtual) {
        if (qtdeAtual > 0) {
            this.qtdeAtual = qtdeAtual;
        }
    }

    public int getQtdeMinima() {
        return qtdeMinima;
    }

    public void setQtdeMinima(int qtdeMinima) {
        if (qtdeMinima > 0) {
            this.qtdeMinima = qtdeMinima;
        }
    }

    public void repoe(int qtde) {
        qtdeAtual += qtde;
    }

    @Override
    public String toString() {
        return "Produto [Id= " + id + ", Nome=" + nome + ", Quantidade Atual=" + qtdeAtual + ", Quantidade Minima="
                + qtdeMinima + "]";
    }

}
