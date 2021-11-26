
/*2- Criar a classe professor com atributos matricula, nome, sexo, dataNascimento, dataContrato. Além dos métodos get e set, deverá conter um método que retorne a quantidade 
de anos que falta para o professor se aposentar que deverá considerar que para aposentar deve-se ter 65 anos de idade e 35 de atuação para homens e 60 anos de idade e 30 de 
atuação para mulheres. Criar o método abstrato salário que retorna quanto o professor recebe. 
 
Criar a classe professor Dedicação Exclusiva que herda de professor e recebe um salário fixo; 
 
Criar a classe professor Horista que recebe um valor por hora trabalhada; 
 
Criar a classe professor Visitante que herda de horista e tem o nome da faculdade que ele está vinculado. 
 
Criar a classe testaProfessor que contem uma coleção de professores. Insira professores de todos os tipos e percorra esta coleção mostrando 
o nome e salário de cada um deles.
*/
import java.util.Calendar;

public abstract class Professor {
    private String matricula;
    private String nome;
    private char sexo;
    private String dataNascimento;
    private String dataContrato;


    



    public Professor(String matricula, String nome, char sexo, String dataNascimento, String dataContrato) {
        setMatricula(matricula);
        setNome(nome);
        setSexo(sexo);
        setDataNascimento(dataNascimento);
        setDataContrato(dataContrato);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    public int aposentar() {
        int dataCont = Integer.parseInt(getDataContrato().substring(6, 10));
        int anoNasc = Integer.parseInt(getDataNascimento().substring(6, 10));
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        if (getSexo() == 'M') {
            if (anoAtual - anoNasc >= 65 && anoAtual - dataCont >= 35) {
                return 0;
            } else if (anoAtual - anoNasc < 65 && anoAtual - dataCont >= 35) {
                return 65 - (anoAtual - anoNasc);
            } else if (anoAtual - anoNasc >= 65 && anoAtual - dataCont < 35) {
                return 35 - (anoAtual - dataCont);
            }
        } else if (getSexo() == 'F') {
            if (anoAtual - anoNasc >= 60 && anoAtual - dataCont >= 30) {
                return 0;
            } else if (anoAtual - anoNasc < 60 && anoAtual - dataCont >= 30) {
                return 60 - (anoAtual - anoNasc);
            } else if (anoAtual - anoNasc >= 60 && anoAtual - dataCont < 30) {
                return 30 - (anoAtual - dataCont);

            }
        }
        return 65 - (anoAtual - anoNasc);
    }

    public abstract double salario();


}