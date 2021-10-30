/*Criar a classe pessoa com os atributos id, nome, altura, peso. Métodos Imc e outros a sua escolha.

Criar a classe testa com o método main com o seguinte menu. 
Lembrando que os dados devem ser manipulados em arquivo texto.

Cadastrar pessoa
Mostrar dados da pessoa buscando pelo id
Mostrar pessoas acima do peso

Obs. Os métodos de mostrar deverão buscar os dados do arquivo, instanciar em uma pessoa e 
apresentar os dados pelo método toString.

Bom trabalho. */

import java.util.ArrayList;

public class CadastrarPessoa {

    private Pessoa pessoa;
    private ArrayList<Pessoa> Pessoas = new ArrayList<>();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public ArrayList<Pessoa> getPessoas() {
        return Pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        Pessoas = pessoas;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        Pessoas.add(pessoa);
    }

    public void inf(){
        for(Pessoa p : Pessoas){
            if(p.calcularImc()>=25){
                System.out.println(p.toString());
            }
        }
    }

}

