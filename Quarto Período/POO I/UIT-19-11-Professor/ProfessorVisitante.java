/*Criar a classe professor Visitante que herda de horista e tem o nome da faculdade que ele está vinculado. */
public class ProfessorVisitante extends ProfessorHorista {

    
    public String nomeFaculdade;

    

    public String getNomeFaculdade() {
        return nomeFaculdade;
    }

    public void setNomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }

    public ProfessorVisitante(String matricula, String nome, char sexo, String dataNascimento, String dataContrato,
            double horas, String nomeFaculdade) {
        super(matricula, nome, sexo, dataNascimento, dataContrato, horas);
        setNomeFaculdade(nomeFaculdade);
    }

    @Override
    public double salario() {

        return super.salario();
    }

    @Override
    public String toString() {
        return "\nNome:" + getNome() + 
               "\nSalario:" + salario() +
               "\nFaculdade:" + getNomeFaculdade();
    }
    
    
}

