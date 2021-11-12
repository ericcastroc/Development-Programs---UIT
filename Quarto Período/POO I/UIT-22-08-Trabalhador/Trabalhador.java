/* – Crie a classe Trabalhador com os atributos matrícula, nome e salário. Crie uma outra classe
com o método main e peça ao usuário para cadastrar 3 trabalhadores. Lembre-se que ninguém
pode ganhar menos que um salário mínimo. */
 
public class Trabalhador{
    private int matricula;
    private String nome;
    private double salario;
    
    


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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario>= 1100){
        this.salario = salario;
        }
    }
    
    public String imprimeDetalhe(){
        return "Nome:" + getNome() +
               "\tMatricula:" + getMatricula() +
               "\tSalario:" + getSalario();

    }
    

}