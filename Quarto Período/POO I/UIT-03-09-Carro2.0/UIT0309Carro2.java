/* Criar um projeto de  carro (novamente), onde, quando
acelerar o carro, caso ele entre na reserva
(10% ou menos do tanque), avisar o usuário.
Criar o campo velocidade máxima, e o carro 
deverá respeitar esse valor. 
Veja que carros que tem motor mais potente
gastam mais gasolina. Lembre-se que
o carro só anda ligado e com gasolina,
que ele precisa abastecer, etc.
Você é livre para escolher os atributos do
carro, mas alguns são obrigatórios, como
apresentado anteriormente.
Ao criar o carro é preciso informar no 
construtor o modelo, capacidade do tanque,
velocidade máxima e potencia do motor(1.0,
1.4, 1.8, etc).
No método main, receba as informações
iniciais do carro e crie um menu para o
usuário interagir com o carro como...
acelerar
frear
ligar
abastecer
etc....

Na aula do dia 10, será solicitado a alguns alunos a apresentação do projeto. */ 

import java.util.Scanner;

public class UIT0309Carro2{
    
    public static void main(String[] args){
        
        


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o modelo do Carro:");
        String modelo = input.nextLine();
        System.out.println("Digite a potencia Carro:");
        double potencia = input.nextDouble();
        System.out.println("Digite a capacidade do Tanque:");
        int capacidadeTanque = input.nextInt();
        System.out.println("Digite a velocidade maxima do Carro");
        int velocidadeMaxima = input.nextInt();

        Carro2 carro = new Carro2(modelo, potencia, capacidadeTanque, velocidadeMaxima);

        System.out.println(carro);

        int opcao=0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Ligar");
            System.out.println("2-Desligar");
            System.out.println("3-Acelerar");
            System.out.println("4-Frear");
            System.out.println("5-Abastecer");
            System.out.println("6-Completar Tanque");
            System.out.println("7- Acelerar KM/HR");
            System.out.println("8-Imprimir Detalhe");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.desligar();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.frear();
                    break;
                case 5:
                    System.out.println("Quantos litros que abastecer?");
                    carro.abastecer(input.nextDouble());
                    break;
                case 6:
                    carro.abastecer();
                break;
                case 7:
                    System.out.println("Quantos quilometros por hora quer acelerar:");
                    carro.acelerar(input.nextDouble());
                    break;
                case 8:
                    System.out.println(carro.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Opção Inválida");
                 


            }
        }while(opcao!=0);
        
        input.close();

    } 

}
