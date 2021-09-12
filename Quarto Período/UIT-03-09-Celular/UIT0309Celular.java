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

public class UIT0309Celular {
    
    public static void main(String[] args){

        Celular celular = new Celular(); 

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Modelo do Telefone: ");
        celular.setModelo(input.nextLine());

       
        int op=0;
        
        do{
            System.out.println("Digite a opção a seguir: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Carregar");
            System.out.println("4 - Carregar Total");
            System.out.println("5 - Aumentar Volume");
            System.out.println("6 - Abaixar Volume");
            System.out.println("7 - Jogar");
            System.out.println("8 - Imprimir Detalhes");
            
            op = input.nextInt();
            
            switch(op){
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
                    celular.jogar();
                    break;
                case 8:
                    System.out.println(celular.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Número inválido.");
            }
            
            
        }while(op!=0);
        
        
       
        input.close();  
    }  
}

