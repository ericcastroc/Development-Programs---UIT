/*Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da RAM, número de processadores e fabricante. 
Crie métodos de acesso público e reimplemente o método toString() da classe. Crie um construtor para passar todos os atributos durante a criação do objeto. 

Crie o atributo booleano ligado e um método para ligar e desligar o computador. Todo computador quando for criado deve estar desligado. 
Crie o método estadoComputador que retorna se ele está ligado ou desligado.

Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores que irá receber os dados do computador pelo usuário. 
Depois imprima os dados dos computadores que possuem mais que 512Mb de Ram usando o método toString.

Se conseguir fazer o cadastro por menu é muito bom. Boa sorte.*/

import java.util.Scanner;

public class UIT0110Computador {
    static int qtdRamPermitida = 512;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de computadores que voce vai cadastrar:");
        int numero = input.nextInt();

        Computador[] computador = new Computador[numero];

        for (int i = 0; i < computador.length; i++) {
            System.out.println("Informe o tamanho do HD do " + (i + 1) + " Computador em GB:");
            int tamanhoHd = input.nextInt();
            System.out.println("Informe o tamanho da Ram do " + (i + 1) + " Computador em MB:");
            int tamanhoRam = input.nextInt();
            System.out.println("Informe o numero de processadores que o " + (i + 1) + " Computador tem:");
            int numProcessadores = input.nextInt();
            input.nextLine();
            System.out.println("Informe o nome do fabricante do " + (i + 1) + " Computador:");
            String fabricante = input.nextLine();

            computador[i] = new Computador(tamanhoHd, tamanhoRam, numProcessadores, fabricante);
        }

        for (int i = 0; i < computador.length; i++) {
            if (computador[i].getTamanhoRam() >= qtdRamPermitida) {
                System.out.println(computador[i].toString());
            }
        }

        int opcao = 0;
        System.out.println("Informe qual computador quer exibir:");
        int num = input.nextInt() - 1;
        do {

            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println(("1-Mudar de Computador:"));
            System.out.println("2-Ligar");
            System.out.println("3-Desligar");
            System.out.println("4-Estado");
            System.out.println("5-Informaçoes");
            opcao = input.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    for (int i = 0; i < computador.length; i++) {
                        System.out.println("Computadores Disponiveis:" + (i + 1) + "º" + computador[i].toString());
                    }
                    System.out.println("Informe qual computador acessar");
                    num = input.nextInt() - 1;
                    break;
                case 2:
                    computador[num].ligar();
                    break;
                case 3:
                    computador[num].desligar();
                case 4:
                    System.out.println(computador[num].estadoComputador());
                    break;
                case 5:
                    System.out.println(computador[num].toString());
                    break;
                default:
            }
        } while (opcao != 0);
        input.close();
    }

}
