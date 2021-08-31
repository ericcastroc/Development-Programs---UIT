/* Crie a classe Boleto com os atributos vencimento, valor, desconto, um booleano se está pago e nome do cliente. 
Crie um construtor para que todos dados sejam passados no momento da instanciação dos objetos. 
Crie um método que retorne o valor líquido do boleto. Crie também um método pagar que altera o boleto para pago. */ 

import java.util.Scanner;

public class UIT2208Boleto {
    
    public static void main(String[] args){

        Boleto boleto = new Boleto();

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o Nome do Cliente: ");
        boleto.setNome(input.nextLine());

        System.out.println("Informe o Valor do Boleto: ");
        boleto.setValor(input.nextDouble());
            
        System.out.println("Informe a Data de Vencimento do Boleto: ");
        boleto.setVencimento(input.nextInt());

        System.out.println("Informe o Desconto: ");
        boleto.setDesconto(input.nextInt());

        System.out.println("Informe.\n1-Pago\t0-Em atraso");
        boleto.pagar(input.nextInt());

        System.out.println(boleto.imprimeDetalhe());
        boleto.resultado();

        input.close();
    }
}
