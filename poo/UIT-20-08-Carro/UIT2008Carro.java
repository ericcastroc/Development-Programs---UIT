import java.util.Scanner;

public class UIT2008Carro{

    public static void main(String[] args){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a capacidade do tanque do Seu primeiro carro: ");
        carro1.setCapacidadeTanque(input.nextDouble());

        System.out.println("Informe a velocidade total que seu primeiro carro pode chegar: ");
        carro1.setVelocidade(input.nextDouble());

        System.out.println("Informe a capacidade do tanque do seu segundo carro: ");
        carro2.setCapacidadeTanque(input.nextDouble());

        System.out.println("Informe a velocidade total que seu segundo carro pode chegar: ");
        carro2.setVelocidade(input.nextDouble());
        
        carro1.Ligar();
        carro2.Desligado();
        carro1.abastecer(45);
        carro2.abastecer(45);
        System.out.println(carro1.imprimeDetalhe());
        System.out.println(carro2.imprimeDetalhe());
        //carro1.acelerar();
        //carro2.acelerar();
        System.out.println(carro1.imprimeDetalhe());
        System.out.println(carro2.imprimeDetalhe());
        //carro2.acelerar();
        //carro2.acelerar();
        System.out.println(carro1.imprimeDetalhe());
        System.out.println(carro2.imprimeDetalhe());

        input.close();
    }
}