/*Criar a classe pessoa com os atributos id, nome, altura, peso. Métodos Imc e outros a sua escolha.

Criar a classe testa com o método main com o seguinte menu. 
Lembrando que os dados devem ser manipulados em arquivo texto.

Cadastrar pessoa
Mostrar dados da pessoa buscando pelo id
Mostrar pessoas acima do peso

Obs. Os métodos de mostrar deverão buscar os dados do arquivo, instanciar em uma pessoa e 
apresentar os dados pelo método toString.

Bom trabalho. */

public class Pessoa {

    private int id;
    private String nome;
    private double altura;
    private double peso;

    

    public Pessoa(int id, String nome, double altura, double peso) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularImc(){
        double imc;
        imc=peso/(altura*altura); 
        return imc;
    }

    @Override
    public String toString() {
        return "Pessoa [ id=" + id + ", altura=" + altura +", nome=" + nome + ", peso=" + peso + "]";
    }

    
}
