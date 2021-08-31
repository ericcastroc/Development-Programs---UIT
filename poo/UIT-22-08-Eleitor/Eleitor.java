/*Crie a classe Eleitor com os atributos idade, sexo, nome e numero do título. 
Faça um método que retorne se a pessoa é Obrigada, Desobrigada ou impedida de votar. Crie outra classe para testar.*/ 

public class Eleitor {

    private int idade;
    private String sexo;
    private String nome;
    private int numeroTitulo;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(idade>0 && idade < 100)
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroTitulo() {
        return numeroTitulo;
    }
    public void setNumeroTitulo(int numeroTitulo) {
        this.numeroTitulo = numeroTitulo;
    }

    public  void Teste(){
        if(idade<18 || idade>70){
            System.out.println("Voce não e obrigado a Votar.");
        }else if(idade>=18 && idade<=70 && numeroTitulo>0){
            System.out.println("Voce e obrigado a Votar.");
        }else if(numeroTitulo<=0){
            System.out.println("Voce esta impedido de votar.");
        }
    }

    public String imprimeDetalhe(){
        return "\n\nNome:" + getNome() +
               "\nSexo:" + getSexo() +
               "\nIdade:" + getIdade() +
               "\nTitulo de Eleitor:" + getNumeroTitulo();
            }
}


