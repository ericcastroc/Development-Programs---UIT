/*Escreva um código em Java que apresente a classe Pessoa, com atributos nome,
endereço e telefone e, o método imprimir (Imprime todos os dados da pessoa). O
método imprimir deve mostrar na tela os valores de todos os atributos. Não esqueça de
adicionar os métodos Get,s e Set's. Crie a classe TestaPessoa, instancie 2 pessoas e teste
os métodos. Veja que cada pessoa possui seus próprios atributos. */ 

import java.util.Scanner;

public class UIT2408Pessoa {
    
    public static void main(String[] args){

        Pessoa pessoa01 = new Pessoa();
        Pessoa pessoa02 = new Pessoa();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o nome do Primeiro Aluno:");
        pessoa01.setNome(input.nextLine());

        System.out.println("Informe o Endereço do Primeiro Aluno:");
        pessoa01.setEndereco(input.nextLine());

        System.out.println("Informe o numero de Telefone do Primeiro Aluno:");
        pessoa01.setTelefone(input.nextLine());

        System.out.println("Informe o nome do Segundo Aluno:");
        pessoa02.setNome(input.nextLine());

        System.out.println("Informe o Endereço do Segundo Aluno:");
        pessoa02.setEndereco(input.nextLine());

        System.out.println("Informe o numero de Telefone do Segundo Aluno:");
        pessoa02.setTelefone(input.nextLine());

        System.out.println(pessoa01.imprimeDetalhe());
        System.out.println(pessoa02.imprimeDetalhe());
    
        input.close();
    }
}
