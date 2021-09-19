/*Questão 5 – 5 pontos - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio, excluindo o térreo, capacidade do elevador, 
e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); 
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); 
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo); 
Encapsular todos os atributos da classe (criar os métodos set e get).
 */

package Questao05;
import java.util.Scanner;
public class UIT1709Elevador {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Capacidade de pessoas no Elevador:");
        int capacidadeDoElevador = input.nextInt();
        System.out.println("Informe o total de andares no Elevador:");
        int totalDeAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeDoElevador, totalDeAndares);

        System.out.println(elevador);

        int opcao=0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Entrar uma pessoa no elevador:");
            System.out.println("2-Sair uma pessoa do elevador ");
            System.out.println("3-Subir Andar");
            System.out.println("4-Descer Andar");
            System.out.println("5-Imprimir Detalhes");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    elevador.entrar();
                    break;
                case 2:
                    elevador.sair();
                    break;
                case 3:
                    elevador.sobe();
                    break;
                case 4:
                    elevador.desce();
                    break;
                case 5:
                    System.out.println(elevador.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Opção Inválida");
            }        
        }while(opcao!=0);
        
        input.close();
    }
    
}
