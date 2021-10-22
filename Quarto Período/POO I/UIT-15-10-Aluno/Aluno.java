/* Crie uma classe aluno com atributos e métodos a sua escolha, mas que um deles seja a nota do aluno 
no semestre e outro seja o sexo do aluno, que somente poderá ser Masculino ou Feminino 
(Você deverá utilizar obrigatoriamente tipos enumerados). Deverá ter também uma classe sala que 
possui atributos e métodos a sua escolha mas um deles deve ser uma coleção de alunos.

Crie uma classe de testes que deverá conter um menu para trabalhar com salas e alunos. 
Adicionando, removendo, retornando o melhor aluno por exemplo, etc.
Veja que o método de incluir aluno, mostrar, etc, deve estar em sala e não em testa. */

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private double nota;
    private String sexo;

    public Aluno(String nome, int idade, int matricula, double nota, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.nota = nota;
        this.sexo = sexo;
    }

    public Aluno(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }


    public String toString() {
        return "Alunos  [idade=" + idade + ", matricula=" + matricula + ", nome=" + nome + ", nota=" + nota + ", sexo="
                + sexo + "]";
    }
    
        
}
