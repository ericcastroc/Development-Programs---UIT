import java.util.Scanner;

/* Criar uma classe celular com os seguintes
 campos: modelo, nivelBateria, 
 ligado (tipo boolean) e som.
 O usuário pode carregar o celular,
 aumentar e diminuir o som e jogar, ao 
 jogar ele poderá escolher o jogo e a
 bateria deverá gastar quando jogar.
O jogo deverá ser um par ou impar onde 
o usuário escolher (par ou impar) e 
o sistema gera um número aleatorio e diz
se ganhou ou perdeu.
 O usuário somente poderá controlar o som
 e jogar se o celular estiver ligado.
 Criar uma classe TestaCelular e criar 
 um menu para o usuário interagir.

Na aula do dia 10, alguns alunos deverão apresentar os projetos.  */

/* Modifique a classe celular e altere o jogo para poder jogar Pedra, Papel e Tesoura. 
Também deverá ser criado um campo Id celular que deverá ser incrementado automaticamente e também um método estático mostraQtdeCelulares() 
que retorna quantos celulares estão instanciados! */

public class UIT0309Celular {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Modelo do Telefone: ");
        String modelo = input.nextLine();

        Celular celular = new Celular(modelo);

        System.out.println("Informe o Modelo do Telefone: ");
        modelo = input.nextLine();

        Celular celular2 = new Celular(modelo);

        System.out.println("Informe o Modelo do Telefone: ");
         modelo = input.nextLine();

        Celular celular3 = new Celular(modelo);
       
        int op = 0;

        do {
            System.out.println("Digite a opção a seguir: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Carregar");
            System.out.println("4 - Carregar Total");
            System.out.println("5 - Aumentar Volume");
            System.out.println("6 - Abaixar Volume");
            System.out.println("7 - Jogar Impar ou Par");
            System.out.println("8 - Jogar Jogo da Velha");
            System.out.println("9 - Imprimir Detalhes");
            System.out.println("10 - Mostrar Quantidade de Celulares");

            op = input.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Ate mais.");
                    break;
                case 1:
                    celular.ligar();
                    break;
                case 2:
                    celular.desligar();
                    break;
                case 3:
                    celular.carregar();
                    break;
                case 4:
                    celular.carregarTotal();
                    break;
                case 5:
                    celular.aumentarSom();
                    break;
                case 6:
                    celular.abaixarSom();
                    break;
                case 7:
                    System.out.println(
                            "Informe o numero desejado e logo em seguida Informe\n0 para Par  \n1 Para impar\n\n True - Venceu\n False - Perdeu");
                    System.out.println(celular.jogarParImpar(input.nextInt(), input.nextInt()));
                    break;
                case 8:
                    System.out.println("Infore \n0-Pedra\n1-Papel\n2-Tesoura");
                    System.out.println(celular.jogarPeraPapelTesoura(input.nextInt()));
                    break;
                case 9:
                    System.out.println(celular.imprimeDetalhe());
                    break;
                case 10:
                System.out.println(celular.qtdCelular());
                    break;
                default:
                    System.out.println("Número inválido.");
            }

        } while (op != 0);

        input.close();
    }
}
