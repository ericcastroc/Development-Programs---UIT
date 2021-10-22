/*1- Entregar o exercício de contatinhos feito na sala de aula;
Descrição: Criar um arraylist de string chamado contatinhos. 
Criar um menu para: inserir contatos remover contatos pelo nome mostrar a quantidade de contatos 
listar todos contatos 

2 - Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade da pessoa, 
id autoincremento e também um booleano ativo. Crie uma classe Testa que possui um arrayList de 
contatos. Crie um menu para adicionar, remover, listar, listar inativos, ativar contato, bloquear 
contato, buscar por nome, listar por cidade, limpar agenda. Obs. Listar, listar por cidade e listar 
por nome só devem exibir os ativos. */

public class Contatinho {

    private int id;
    private String nome;
    private String telefone;
    private String cidade;
    private boolean ativo;
    private static int cont = 0;

    public Contatinho() {
        this.id = cont++;
        this.ativar();
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public static int getCont() {
        return cont;
    }

    public String toStringPequeno(){
        return id=" + id + ", nome= + "nome";
    }
    @Override
    public String toString() {
        return "Contatinho [ativo=" + ativo + ", cidade=" + cidade + ", id=" + id + ", nome=" + nome + ", telefone="
                + telefone + "]";
    }

    
}
