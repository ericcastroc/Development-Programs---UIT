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

import java.util.Scanner;


public class UIT2408Produto {

    public static void main(String[] args){

        Produto produto = new Produto();

        Scanner input = new Scanner(System.in);



        System.out.println("Informe o Nome do produto:");
        produto.setNome(input.nextLine());

        System.out.println("Informe qual foi o preço de custo do produto:");
        produto.setPrecoCusto(input.nextDouble());

        System.out.println("Informe o o preço de venda do produto:");
        produto.setPrecoVenda(input.nextDouble());

        System.out.println(produto.imprimeDetalhe());

        input.close();
    }
    
}
