/* Crie a classe mochila que possui os atributos nome, 
quantidadeItensAtual, quantidadeItensMaxima, pesoAtual, pesoMaximo. 
Criar um construtor onde é necessário passar o nome da mochila e o peso e 
quantidade de itens que ela suporta. Deverá existir um método inserir itens 
onde é passado o peso do item que está sendo inserido. Também deverá ter
um método que retorna a situação da atual da mochila. Criar uma classe de 
teste e testar tentando inserir vários itens na mochila.*/ 

import java.util.Scanner;

public class UIT1309Mochila {
    
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Nome da Mochila:");
        String nome = input.nextLine();
        System.out.println("Digite a Quantidade de tens maxima:");
        int quantidadeItensMaxima = input.nextInt();
        System.out.println("Digite o Peso maximo da mochila:");
        double pesoMaximo  = input.nextDouble();

        Mochila mochila = new Mochila(nome, quantidadeItensMaxima, pesoMaximo);

        System.out.println(mochila);

        int opcao=0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Inserir");
            System.out.println("2-Imprimir Detalhe");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    System.out.println("Informe o Peso do Item:");
                    mochila.inserir(input.nextDouble());
                    break;
                case 2:
                    System.out.println(mochila.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Opção Inválida");
                 

            }
        }while(opcao!=0);

        input.close();
    }
}
