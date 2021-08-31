/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, sexo, peso e altura. 
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular o imc da pessoa e outro método que retorne string se está abaixo, acima ou no peso ideal. 
Faça o teste com duas pessoas passando os valores por get e set. */
import java.util.Scanner;

public class UIT2708ImcPessoa {
    
    public static void main(String[] args){

        ImcPessoa pessoa = new ImcPessoa();

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu Nome:");
        pessoa.setNome(input.nextLine());
        System.out.println("Informe o seu sexo:\t M - Masculino\t F - Feminino");
        pessoa.setSexo(input.next().charAt(0));
        System.out.println("Informe o seu Peso:");
        pessoa.setPeso(input.nextDouble());
        System.out.println("Informe Sua altura em Centimetros:");
        pessoa.setAltura(input.nextDouble());

        System.out.println(pessoa.imprimeDetalhe());
        System.out.println(pessoa.pesoIdeal());
        input.close();
    }
}
