/*Criar a classe pessoa com os atributos id, nome, altura, peso. Métodos Imc e outros a sua escolha.

Criar a classe testa com o método main com o seguinte menu. 
Lembrando que os dados devem ser manipulados em arquivo texto.

Cadastrar pessoa
Mostrar dados da pessoa buscando pelo id
Mostrar pessoas acima do peso

Obs. Os métodos de mostrar deverão buscar os dados do arquivo, instanciar em uma pessoa e 
apresentar os dados pelo método toString.

Bom trabalho. */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        CadastrarPessoa cadastro = new CadastrarPessoa();
        String arquivo = "dados.txt";
        Scanner input = new Scanner(System.in);
        
        int op=0;
        do{
            System.out.println("O que deseja fazer?");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Pessoas Acima do Peso");
            op = input.nextInt();
            switch(op){
                case 0:
                    System.out.println("Tchau.");
                    break;
                case 1:
                    System.out.println("Informe o Id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Informe seu Nome: ");
                    String nome = input.nextLine();
                    System.out.println("Informe a Altura em metros: ");
                    Double altura = input.nextDouble();
                    System.out.println("Informe seu Peso: ");
                    Double peso = input.nextDouble();

                    Pessoa pessoa = new Pessoa(id, nome, altura, peso);
                    cadastro.adicionarPessoa(pessoa);
                    try {
                        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
                        bw.write(id + ";" + nome + ";" + altura + ";" + peso + "\n");
                        bw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    System.out.println("Qual id quer buscar? ");
                    int idbusca = input.nextInt();
            
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while(br.ready()){
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        if(Integer.parseInt(elemento[0])==idbusca){
                            System.out.println(elemento[1]);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
                case 3:      
                cadastro.inf();

                break;
                default:
                    System.out.println("Invalido.");
                    
            
            }
        }while(op!=0);
        input.close();
    }
    
}
