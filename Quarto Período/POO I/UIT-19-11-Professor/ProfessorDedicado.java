/*Criar a classe professor Dedicação Exclusiva que herda de professor e recebe um salário fixo; */

public class ProfessorDedicado extends Professor {

    
    public ProfessorDedicado(String matricula, String nome, char sexo, String dataNascimento, String dataContrato) {
        super(matricula, nome, sexo, dataNascimento, dataContrato);
    }
    

    @Override
    public double salario() {
        return 1100;
    }
    
    @Override
    public String toString() {
        return "\nNome:" + getNome() + 
               "\nSalario:" + salario();
    }

}
