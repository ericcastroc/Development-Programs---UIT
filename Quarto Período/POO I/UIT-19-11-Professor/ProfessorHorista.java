/*Criar a classe professor Horista que recebe um valor por hora trabalhada;  */
public class ProfessorHorista extends Professor {

    private double horas;

    
    public ProfessorHorista(String matricula, String nome, char sexo, String dataNascimento, String dataContrato, double horas) {
        super(matricula, nome, sexo, dataNascimento, dataContrato);
        setHoras(horas);
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public double salario() {
        return (getHoras()*75) +1100;
        
    }

    @Override
    public String toString() {
        return "\nNome:" + getNome() + 
               "\nSalario:" + salario();
    }
}
