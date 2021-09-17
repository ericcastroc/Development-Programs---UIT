/* Crie a classe Time que possua o nome do time, a série que ele joga e o 
número de jogadores. As séries podem ser de A, B, C, D ouE. O números de 
jogadores é no máximo 22. Crie um construtor onde seja obrigatório inserir 
no momento da criação da instância o nome e a série do time. Faça o teste 
em outra classe cadastrando 2 times. */
import java.util.Scanner;

public class UIT1609Time {
    
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Nome do Time:");
        String nome = input.nextLine();
        System.out.println("Digite a Serie que ele joga:");
        String serie = input.nextLine();
        System.out.println("Digite o numero de Jogadores:");
        int numeroDeJogadores = input.nextInt();

        Time time1 = new Time(nome, serie);
        time1.setNumeroDeJogadores(numeroDeJogadores);

        input.nextLine();
        System.out.println("Digite o Nome do Time:");
        nome = input.nextLine();
        System.out.println("Digite a Serie que ele joga:");
        serie = input.nextLine();
        System.out.println("Digite o numero de Jogadores:");
        numeroDeJogadores = input.nextInt();

        Time time2 = new Time(nome, serie);
        time2.setNumeroDeJogadores(numeroDeJogadores);

        System.out.println(time1.imprimeDetalhe());     
        System.out.println(time2.imprimeDetalhe());

        input.close();
    }
}
