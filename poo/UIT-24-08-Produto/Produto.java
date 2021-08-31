/*Crie uma classe Produto para representar um produto do mundo real. Sua classe
deverá conter os seguintes atributos e métodos:
Um campo de dados privado do tipo String chamado nome, que representará o nome do
produto.
Um campo de dados privado do tipo double chamado precoCusto, que guardará o preço
de custo do produto.
Um campo de dados privado do tipo double chamado precoVenda, que guardará o preço
de venda do produto.
Um campo de dados privado do tipo double chamado margemLucro, que guardará a
margem de lucro do produto.
Métodos públicos get() e set() para os atributos acima. Modifique o método
setPrecoVenda() para que o preço de venda não seja inferior ao preço de compra. Caso
isso aconteça, exiba uma mensagem alertando o usuário.
Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do
produto.
Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de
lucro como percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe
Produto, peça para o usuário informar os preços de custo e de venda e exiba a margem
de lucro em moeda e em percentual. */
import java.text.DecimalFormat;

public class Produto {

    DecimalFormat formatador = new DecimalFormat("0.00");

    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        if(precoCusto>0){
        this.precoCusto = precoCusto;
        }
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        if(precoVenda>= precoCusto){
        this.precoVenda = precoVenda;
        }
    }
    public double getMargemLucro() {
        return margemLucro;
    }
    public double margemLucro(){
        double lucro;
        lucro = precoVenda - precoCusto;
        return margemLucro = lucro/precoVenda;
    }

    public double getMargemLucroPorcentagem(){
        return margemLucro * 100;
    }


    public String imprimeDetalhe(){
        return "Produto: " + getNome() +
               "\nPreço venda:" + getPrecoVenda() +
               "\nPreco Custo:" + getPrecoCusto() +
               "Margem de Lucro:" + formatador.format(margemLucro()) +
               "\nMargem de Lucro Porcentagem: " + formatador.format(getMargemLucroPorcentagem())+ "%";
                
    }
}
