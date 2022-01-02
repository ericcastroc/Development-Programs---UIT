import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = input.nextLine();
        System.out.println("Informe seu endereço");
        String endereco = input.nextLine();

        Cliente cliente = new Cliente(nome, endereco);

        int opcao=0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Ativar Usuario");
            System.out.println("2-Desativar Usuario");
            System.out.println("3-Adicionar Produto");
            System.out.println("4-Mostrar Pordutos");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    cliente.ativar();;
                    System.out.println("\n\nUsuario Ativado\n");
                    break;
                case 2:
                    cliente.desativar();
                    System.out.println("\n\nUsuario Desativado\n");
                    break;
                case 3:
                    input.nextLine();
                    System.out.println("Informe o nome do Produto:");
                    String produto = input.nextLine();
                    System.out.println("Informe o valor do Produto:");
                    double valor = input.nextDouble();

                    Produto produtos = new Produto(produto, valor);
                    cliente.adicionarProduto(produtos);
                    break;
                case 4:
                    cliente.mostraTipo();
                    break;
                default:
                    System.out.println("Opção Inválida");
                 


            }
        }while(opcao!=0);
        
        input.close();
    }
}
