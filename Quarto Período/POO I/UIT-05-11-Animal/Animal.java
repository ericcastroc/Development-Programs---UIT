/*
1)Crie uma classe Animal que obedeça à seguinte descrição: 
    Possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), ambiente (String) e velocidade média (float) 
    Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos e atribua-os aos seus respectivos atributos. 
    Crie os métodos get e set para cada um dos atributos. 
    Sobreescreve o metodo toString(), que, quando chamado, imprime na tela uma espécie de relatório informando os dados do animal.

2)Crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição:  possua um atributo caracteristica(String) 
    Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e 
    atribua-os aos seus respectivos atributos. 
    Crie ainda os métodos get e set para o atributo caracteristica. 
    Crie um método dadosPeixe sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do peixe 
    (incluindo os dados do Animal e mais a característica).

3)Crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição:  possua um atributo alimento(String) 
    Crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos. 
    Crie ainda os métodos get e set para o atributo alimento. 
    Crie um método dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).

4)Crie uma classe TestarAnimais possua um método main para testar as classes criadas.
    1-Crie um objeto camelo do tipo Mamífero e atribua os seguintes valores para seus atributos:  Nome: Camelo  Comprimento: 150 cm  Patas: 4  Cor: Amarelo  Ambiente: Terra  Velocidade: 2.0 m/s
    2-Crie um objeto tubarao do tipo Peixe e atribua os seguintes valores para seus atributos  Nome: Tubarão  Comprimento: 300 cm  Patas: 0  Cor: Cinzento  Ambiente: Mar  Velocidade: 1.5 m/s  Caracteristica: Barbatanas e cauda
    3-Crie um objeto ursocanada do tipo Mamifero e atribua os seguintes valores para seus atributos:  Nome: Urso-do-canadá  Comprimento: 180 cm  Patas: 4  Cor: Vermelho  Ambiente: Terra  Velocidade: 0.5 m/s  Alimento: Mel
    4-Chame os método para imprimir os dados de cada um dos objetos criados.

5)Crie na classe animal o método emitirSom() que retorna uma string com o som do animal. Este método deve ser sobreescrito em cada animal que herda desta classe. 
*/

public class Animal {

    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;
    private String som;
    


    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String som) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
        this.som = som;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }


    public String emitirSom(){
        return "Som:" +getSom(); 
    }

    @Override
    public String toString() {
        return "Animal [ambiente=" + ambiente + ", comprimento=" + comprimento + ", cor=" + cor + ", nome=" + nome
                + ", numPatas=" + numPatas + ", velocidadeMedia=" + velocidadeMedia + "]";
    } 

    

}