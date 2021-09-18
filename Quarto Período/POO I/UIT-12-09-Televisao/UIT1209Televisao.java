/* Crie uma classe Televisao com métodos que podem controlar o volume e trocar os canais da televisão. A TV só funciona ligada e deve ter limites de volume e canais. 
Os canais ao chegar no último volta para o primeiro. Crie os seguintes controles: aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; 
aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado ou subir um canal caso não seja informado o canal; consultar o valor do volume de som e o 
canal selecionado. Crie dois construtores para a TV, um que recebe apenas a marcad da TV e outro que recebe a marca, quantidade de canais e volume máximo. 
Crie o método toString que mostrará a marca da TV, o volume e o canal atual. Crie menu para interagir com a TV. Utilize métodos Get e Set. */ 

import java.util.Scanner;

public class UIT1209Televisao {
   
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Marca da Televisão:");
        String marca = input.nextLine();
        System.out.println("Informe a Quantidade Maxia de canais:");
        int quantidadeCanais = input.nextInt();
        System.out.println("Informe o Volume Maximo da Televisão:");
        int volumeMaximo= input.nextInt();

        Televisao televisao = new Televisao(marca, quantidadeCanais, volumeMaximo);

        System.out.println(televisao);

        int opcao=0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Ligar");
            System.out.println("2-Desligar");
            System.out.println("3-Informar canal desejado");
            System.out.println("4-Up Mudar Canal");
            System.out.println("5-Down Mudar Canal");
            System.out.println("6-Aumentar Volume ");
            System.out.println("7-Abaixar Volume");
            System.out.println("8-Imprimir Detalhe");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    televisao.ligar();
                    break;
                case 2:
                    televisao.desligar();
                    break;
                case 3:
                    System.out.println("Informe o canal Desejado:");
                    televisao.setCanal(input.nextInt());
                    break;
                case 4:
                    televisao.aumentarCanal();
                    break;
                case 5:
                    televisao.abaixarCanal();;
                    break;
                case 6:
                    televisao.aumentarVolume();
                    break;
                case 7:
                    televisao.abaixarVolume();
                    break;
                case 8:
                    System.out.println(televisao.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Opção Inválida");
            }        
        }while(opcao!=0);
        
        input.close();
    }
}
