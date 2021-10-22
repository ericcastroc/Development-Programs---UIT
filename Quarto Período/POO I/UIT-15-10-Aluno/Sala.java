/* Crie uma classe aluno com atributos e métodos a sua escolha, mas que um deles seja a nota do aluno 
no semestre e outro seja o sexo do aluno, que somente poderá ser Masculino ou Feminino 
(Você deverá utilizar obrigatoriamente tipos enumerados). Deverá ter também uma classe sala que 
possui atributos e métodos a sua escolha mas um deles deve ser uma coleção de alunos.

Crie uma classe de testes que deverá conter um menu para trabalhar com salas e alunos. 
Adicionando, removendo, retornando o melhor aluno por exemplo, etc.
Veja que o método de incluir aluno, mostrar, etc, deve estar em sala e não em testa. */
import java.util.ArrayList;
public class Sala {
    private Aluno aluno;
    private int qtdAlunos;

    ArrayList<Aluno> Alunos = new ArrayList<>();

    public ArrayList<Aluno> getAlunos() {
        return Alunos;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void adicionarAluno(Aluno aluno){
        Alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        
        Alunos.remove(aluno.getMatricula());
    }
    
    public String exibirAlunos() {
        String alunosInf = "\t";
    
 
          for (Aluno a : Alunos) {
            alunosInf += "\n" + a.toString();
          }
         
        return alunosInf;
      }
}
