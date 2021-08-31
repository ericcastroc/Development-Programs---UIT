/* – Crie a classe Trabalhador com os atributos matrícula, nome e salário. Crie uma outra classe
com o método main e peça ao usuário para cadastrar 3 trabalhadores. Lembre-se que ninguém
pode ganhar menos que um salário mínimo. */

import java.util.Scanner;

public class UIT2208Trabalhador{

    public static void main(String[] args){

        Trabalhador trabalhador01 = new Trabalhador();
        Trabalhador trabalhador02 = new Trabalhador();
        Trabalhador trabalhador03 = new Trabalhador();

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do Primeiro funcionario: ");
        trabalhador01.setNome(input.nextLine());
 
        System.out.println("Informe a matricula do primeiro funcionario: ");
        trabalhador01.setMatricula(input.nextInt());
        
        System.out.println("Informe o salario do Primeiro funcionario: ");
        trabalhador01.setSalario(input.nextDouble());
        input.nextLine();

        System.out.println("Informe o nome do Segundo funcionario: ");
        trabalhador02.setNome(input.nextLine());

        System.out.println("Informe a matricula do Segundo funcionario: ");
        trabalhador02.setMatricula(input.nextInt());

        System.out.println("Informe o salario do Segundo funcionario: ");
        trabalhador02.setSalario(input.nextDouble());
        input.nextLine();

        System.out.println("Informe o nome do Terceiro funcionario: ");
        trabalhador03.setNome(input.nextLine());

        System.out.println("Informe a matricula do Terceiro funcionario: ");
        trabalhador03.setMatricula(input.nextInt());

        System.out.println("Informe o salario do Terceiro funcionario: ");
        trabalhador03.setSalario(input.nextDouble());

        System.out.println(trabalhador01.imprimeDetalhe());
        System.out.println(trabalhador02.imprimeDetalhe());
        System.out.println(trabalhador03.imprimeDetalhe());

        input.close();
    }
}