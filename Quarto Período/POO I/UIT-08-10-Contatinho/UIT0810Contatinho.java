
/*1- Entregar o exercício de contatinhos feito na sala de aula;
Descrição: Criar um arraylist de string chamado contatinhos. 
Criar um menu para: inserir contatos remover contatos pelo nome mostrar a quantidade de contatos 
listar todos contatos 

2 - Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa, 
id autoincremento e também um booleano ativo. Crie uma classe Testa que possui um arrayList de 
contatos. Crie um menu para adicionar, remover, listar, listar inativos, ativar contato, bloquear 
contato, buscar por nome, listar por cidade, limpar agenda. Obs. Listar, listar por cidade e listar 
por nome só devem exibir os ativos. */

import java.util.Scanner;
import java.util.ArrayList;

public class UIT0810Contatinho {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contatinho> agenda = new ArrayList<>();

        int op = 0;
        String nome = "";
        int id = 0;

        do {
            System.out.println("Digite o que deseja:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Listar Inativos");
            System.out.println("5 - Ativar");
            System.out.println("6 - Bloquear");
            System.out.println("7 - Buscar por nome");
            System.out.println("8 - Listar por cidade");
            System.out.println("9 - Limpar Agenda");
            op = input.nextInt();
            limpaTela();
            switch (op) {
                case 0:
                    System.out.println("Thcau");
                    break;
                case 1:
                    Contatinho contatinho = new Contatinho();
                    System.out.println("Informe o nome do contato:");
                    contatinho.setNome(input.nextLine());
                    System.out.println("Informe o telefone do contato:");
                    contatinho.setTelefone(input.nextLine());
                    System.out.println("Informe a cidade do contato:");
                    contatinho.setCidade(input.nextLine());
                    agenda.add(contatinho);
                    break;
                case 2:
                    System.out.println("Digite um nome para remover:");
                    nome = input.nextLine();
                    for (Contatinho x : agenda) {
                        if (x.getNome().equals(nome)) {
                            agenda.remove(x);
                        }
                    }
                    break;
                case 3:
                    for (Contatinho x : agenda) {
                        if (x.isAtivo()) {
                            System.out.println(x);
                        }
                    }
                    break;
                case 4:
                    for (Contatinho x : agenda) {
                        if (x.isAtivo() == false) {
                            System.out.println(x);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o id que deseja ativar:");
                    id = input.nextInt();
                    for (Contato x : agenda) {
                        if (x.getId() == id) {
                            x.ativar();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite o id que deseja ativar:");
                    id = input.nextInt();
                    for (Contato x : agenda) {
                        if (x.getId() == id) {
                            x.destaviar();
                        }
                    }
                    break;
                case 7:
                System.out.println("Qual nome deseja buscar:");
                nome = input.nextLine();
                for (Contato x : agenda) {
                    if (x.getNome().contains(nome) && x.isAtivo()) {
                        System.out.println(x);
                    }
                }

            }
        } while (op != 0);

        input.close();
    }
}
