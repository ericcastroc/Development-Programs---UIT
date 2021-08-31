/*Crie a classe Eleitor com os atributos idade, sexo, nome e numero do título. 
Faça um método que retorne se a pessoa é Obrigada, Desobrigada ou impedida de votar. Crie outra classe para testar.*/ 

import java.util.Scanner;

public class UIT2208Eleitor {
    
    public static void main(String[] args){
        
    Eleitor eleitor = new Eleitor();

    Scanner input = new Scanner(System.in);

    System.out.println("Informe o seu Nome:");
    eleitor.setNome(input.nextLine());

    System.out.println("Informe o seu sexo:");
    eleitor.setSexo(input.nextLine());

    System.out.println("Informe a sua idade:");
    eleitor.setIdade(input.nextInt());

    System.out.println("Informe o numero do titulo de eleitor:");
    eleitor.setNumeroTitulo(input.nextInt());

    System.out.println(eleitor.imprimeDetalhe());
    eleitor.Teste();

    input.close();
    }    
}
