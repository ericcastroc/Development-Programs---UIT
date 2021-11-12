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
    Crie um método dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie de relatório informando os dados do mamifero 
    (incluindo os dados do Animal e mais o alimento).

4)Crie uma classe TestarAnimais possua um método main para testar as classes criadas.
    1-Crie um objeto camelo do tipo Mamífero e atribua os seguintes valores para seus atributos:  Nome: Camelo  Comprimento: 150 cm  Patas: 4  Cor: Amarelo  Ambiente: Terra  Velocidade: 2.0 m/s
    2-Crie um objeto tubarao do tipo Peixe e atribua os seguintes valores para seus atributos  Nome: Tubarão  Comprimento: 300 cm  Patas: 0  Cor: Cinzento  Ambiente: Mar  Velocidade: 1.5 m/s  Caracteristica: Barbatanas e cauda
    3-Crie um objeto ursocanada do tipo Mamifero e atribua os seguintes valores para seus atributos:  Nome: Urso-do-canadá  Comprimento: 180 cm  Patas: 4  Cor: Vermelho  Ambiente: Terra  Velocidade: 0.5 m/s  Alimento: Mel
    4-Chame os método para imprimir os dados de cada um dos objetos criados.
    
5)Crie na classe animal o método emitirSom() que retorna uma string com o som do animal. Este método deve ser sobreescrito em cada animal que herda desta classe. 
*/

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia, String som, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia, som);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String emitirSom(){
        return "Som:" +getSom(); 
    }
    
    public String dadosMamifero(){
        return  "Nome:" +getNome() +
                "\nComprimento:" + getComprimento() +
                "\nNumero de Patas: "+ getNumPatas() +
                "\nCor: " + getCor() +
                "\nAmbiente:"+ getAmbiente() +
                "\nVelocidade Media:"+ getVelocidadeMedia() +
                "\nAlimento:" +getAlimento();
    }
    
}
