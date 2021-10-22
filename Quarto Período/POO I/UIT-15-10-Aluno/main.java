import java.util.Scanner;

/* Crie uma classe aluno com atributos e métodos a sua escolha, mas que um deles seja a nota do aluno 
no semestre e outro seja o sexo do aluno, que somente poderá ser Masculino ou Feminino 
(Você deverá utilizar obrigatoriamente tipos enumerados). Deverá ter também uma classe sala que 
possui atributos e métodos a sua escolha mas um deles deve ser uma coleção de alunos.

Crie uma classe de testes que deverá conter um menu para trabalhar com salas e alunos. 
Adicionando, removendo, retornando o melhor aluno por exemplo, etc.
Veja que o método de incluir aluno, mostrar, etc, deve estar em sala e não em testa. */

public class main {
    

    public static void main(String[] args){

        Sala sala = new Sala();
        Scanner input = new Scanner(System.in);


        int opcao = 0;
        do{
            System.out.println("Digite o que deseja:");
            System.out.println("0-Sair");
            System.out.println("1-Adicionar Aluno");
            System.out.println("2-Remover Aluno");
            System.out.println("3-Melhor Aluno");
            System.out.println("4-Todos os Alunos");
            opcao = input.nextInt();
            switch (opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    input.nextLine();
                    System.out.println("Nome:");
                    String nome = input.nextLine();
                    System.out.println("Idade:");
                    int idade = input.nextInt();
                    System.out.println("Matricula:");
                    int matricula = input.nextInt();
                    System.out.println("Nota:");
                    double nota = input.nextDouble();
                    System.out.println("Sexo:");
                    String sexo = input.nextLine();
                    Aluno aluno = new Aluno(nome, idade, matricula, nota, sexo);

                    sala.adicionarAluno(aluno);
                    break;
                    case 2:

                        System.out.println("Informe a Matricula do aluno: ");
                        int opc = input.nextInt();
                        for(Aluno )

                    break;
                case 4:
                    System.out.println(sala.exibirAlunos()); 
                    break;
            }
        }while (opcao != 0);

        
        input.close();
    }
    
}
