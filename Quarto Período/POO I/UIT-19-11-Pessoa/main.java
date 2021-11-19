/*  1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), 
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone;

2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que cada instância da classe Fornecedor tem, 
para além dos atributos que caracterizam a classe Pessoa, os atributos LimiteCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida 
(montante da dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método ObterSaldoRestante()
 que devolve quanto ainda se pode comprar à prazo com o fornecedo. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita 
 verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa. Os métodos get e set são adequados? O valor da Dívida deve 
 ser alterado ou incrementado? Pense nestas situações neste e nos demais exercícios.

3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado tem, para além dos atributos que caracterizam a classe 
Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores e 
modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. Existem métodos para realizar aumento de salário? Por valor ou
 percentual?

4. Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem como atributos, para além dos atributos da classe Pessoa e da 
classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado calcularSalario 
(o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda de custo). Escreva um programa de teste adequado para esta classe.

5. Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como atributos, para além dos atributos da classe Pessoa e da classe 
Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do 
valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é 
equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

6. Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como atributos, para além dos atributos da classe Pessoa e da classe 
Empregado, o atributo valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado ao 
vencimento base do Vendedor). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um vendedor é equivalente ao salário de um empregado 
usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.

7. Os testes realizados em cada exercício acima consideraram salário negativo, dívidas negativas etc? Se não, refaça-os corrigindo estas inconsistências. 
Crie uma classe teste onde o usuário pode realizar alterações através de menus. Alterar vendas, modificar salários, etc.

8. Agora, com todas classes prontas e testadas, crie um programa que tenha uma coleção de empregados que deverão ser inseridos através de menu. 
O programa deverá ter opções para mostrar o calculo do salário, mostrar comissão e outros métodos que achar adequado.*/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Pessoa administrador = new Administrador("Gabriel", "Piedade", "998084435", 001, 1400.30, 11.3, 130.40);
        Pessoa fornecedor = new Fornecedor("Marcelo", "Novo Horizonte", "998078645", 4500, 5000); 
        Pessoa empregado = new Empregado("Carlos", "Nazare", "998475865", 002, 1100.00, 11.3);
        Pessoa operario = new Operario("Marcelo", "Carmo do Cajuru", "998024378", 001, 1800.00, 11.3, 128, 700);
        Pessoa vendedor = new Vendedor("Mariana", "Nova Lima", "998456897", 003, 2000, 17, 450);
        System.out.println("TESTE");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");
        System.out.println(administrador.toString());
        System.out.println(fornecedor.toString());
        System.out.println(empregado.toString());
        System.out.println(operario.toString());
        System.out.println(vendedor.toString());
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("Informe a opção");
            System.out.println("0 - Sair");
            System.out.println("1 - Teste Fornecedor");
            System.out.println("2 - Teste Empregado");
            System.out.println("3 - Teste Administrador");
            System.out.println("4 - Teste Operario");
            System.out.println("2 - Teste Vendedor");

            opcao = input.nextInt();
            switch (opcao) {
            case 0:
                System.out.println("Finalizando...");
                break;
            case 1:
                testaFornecedor(input);
                break;
            case 2:
                testaEmpregado(input);
                break;
            case 3:
                testaAdministrador(input);
                break;
            case 4:
                testaOperario(input);
                break;
            case 5:
                testaVendedor(input);
                break;
            default:
                System.out.println("Opção invalida!");
                break;
            }
        } while (opcao != 0);

        input.close();
    }

    public static void testaFornecedor(Scanner input) {

        String nome, endereco, telefone;
        double limiteCredito, valorDivida;

        input.nextLine();
        System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("Endereço:");
		endereco = input.nextLine();
		System.out.println("Telefone:");
		telefone = input.nextLine();
		System.out.println("Limite de credito:");
		limiteCredito = input.nextDouble();
		System.out.println("Valor da divida:");
		valorDivida = input.nextDouble();

        Pessoa fornecedor = new Fornecedor(nome, endereco, telefone, limiteCredito, valorDivida);
        
        System.out.println("\n");
        System.out.println(fornecedor.toString());

    }

    public static void testaEmpregado(Scanner input) {
        String nome, endereco, telefone;
        int codigoSetor;
        double salarioBase, imposto;

        input.nextLine();
        System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("Endereço:");
		endereco = input.nextLine();
		System.out.println("Telefone:");
		telefone = input.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = input.nextInt();
		System.out.println("Salario base:");
		salarioBase = input.nextDouble();
		System.out.println("Porcentagem da Taxa de imposto:");
		imposto = input.nextDouble();

        Pessoa empregado = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);

        System.out.println("\n");
        System.out.println(empregado.toString());
    }

    public static void testaAdministrador(Scanner input) {
        String nome, endereco, telefone;
        int codigoSetor;
        double salarioBase, imposto, ajudaDeCusto;

        input.nextLine();
        System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("Endereço:");
		endereco = input.nextLine();
		System.out.println("Telefone:");
		telefone = input.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = input.nextInt();
		System.out.println("Salario base:");
		salarioBase = input.nextDouble();
		System.out.println("Porcentagem da Taxa de imposto:");
		imposto = input.nextDouble();
        System.out.println("Ajuda de Custos:");
		ajudaDeCusto = input.nextDouble();

        Pessoa administrador = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, imposto, ajudaDeCusto);

        System.out.println("\n");
        System.out.println(administrador.toString());
    }

    public static void testaOperario(Scanner input) {
        String nome, endereco, telefone;
        int codigoSetor;
        double salarioBase, imposto, valorProducao, comissao;

        input.nextLine();
        System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("Endereço:");
		endereco = input.nextLine();
		System.out.println("Telefone:");
		telefone = input.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = input.nextInt();
		System.out.println("Salario base:");
		salarioBase = input.nextDouble();
		System.out.println("Porcentagem da Taxa de imposto:");
		imposto = input.nextDouble();
        System.out.println("Valor da Produção :");
		valorProducao = input.nextDouble();
        System.out.println("Comissao :");
		comissao = input.nextDouble();

        Pessoa operario = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorProducao, comissao);

        System.out.println("\n");
        System.out.println(operario.toString());
    }

    public static void testaVendedor(Scanner input) {
        String nome, endereco, telefone;
        int codigoSetor;
        double salarioBase, imposto, valorVenda;

        input.nextLine();
        System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("Endereço:");
		endereco = input.nextLine();
		System.out.println("Telefone:");
		telefone = input.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = input.nextInt();
		System.out.println("Salario base:");
		salarioBase = input.nextDouble();
		System.out.println("Porcentagem da Taxa de imposto:");
		imposto = input.nextDouble();
        System.out.println("Valor da Venda:");
		valorVenda = input.nextDouble();

        Pessoa vendedor = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, imposto, valorVenda);
        System.out.println("\n");
        System.out.println(vendedor.toString());
    }
}
