/* Criar um projeto de  carro (novamente), onde, quando
acelerar o carro, caso ele entre na reserva
(10% ou menos do tanque), avisar o usuário.
Criar o campo velocidade máxima, e o carro 
deverá respeitar esse valor. 
Veja que carros que tem motor mais potente
gastam mais gasolina. Lembre-se que
o carro só anda ligado e com gasolina,
que ele precisa abastecer, etc.
Você é livre para escolher os atributos do
carro, mas alguns são obrigatórios, como
apresentado anteriormente.
Ao criar o carro é preciso informar no 
construtor o modelo, capacidade do tanque,
velocidade máxima e potencia do motor(1.0,
1.4, 1.8, etc).
No método main, receba as informações
iniciais do carro e crie um menu para o
usuário interagir com o carro como...
acelerar
frear
ligar
abastecer
etc....

Na aula do dia 10, será solicitado a alguns alunos a apresentação do projeto. */ 

public class Carro2{

    private String modelo;
    private double potencia;
    private boolean ligado;
    private int capacidadeTanque;
    private double litrosNoTanque;
    private int velocidadeMaxima;
    private double velocidadeAtual;

    
    public Carro2(String modelo, double potencia, int capacidadeTanque, int velocidadeMaxima) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void ligar(){
        if(litrosNoTanque>0){
            this.ligado = true;
        }
    }

    public void desligar(){
        this.ligado = false;
    }

    public void acelerar(double quilometragem){
        if(isLigado()==true && litrosNoTanque>0){
            velocidadeAtual+=quilometragem*(quilometragem==1?potencia:1);
            litrosNoTanque-=(potencia/20)*quilometragem;
        }
            if(litrosNoTanque<capacidadeTanque*0.1 && litrosNoTanque>0){
                System.out.println("Carro na reserva.");
            }
                if(litrosNoTanque<=0){
                    litrosNoTanque=0;
                    desligar();
                }
                    if(velocidadeAtual>velocidadeMaxima){
                        velocidadeAtual=velocidadeMaxima;
                    }    
    }

    public void acelerar(){
        acelerar(1);
    }
    

    public void frear(){
        velocidadeAtual --;
    }

    public void abastecer(){
        litrosNoTanque = capacidadeTanque;
    }
    public void abastecer(double litros){
        if(isLigado()==false){
            if(litrosNoTanque+litros<=capacidadeTanque){
            this.litrosNoTanque += litros;
            }else{
                litrosNoTanque = capacidadeTanque;
           }
        }
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String imprimeDetalhe(){
        return " O carro está "+ (isLigado()?"ligado":"desligado ") +
        "\n E ele esta com " + getLitrosNoTanque() + " de combustivel  " +
        "\n Ele esta com velocidade " + getVelocidadeAtual();
    }

    public String toString() {
        return "Carro2 [capacidadeTanque=" + capacidadeTanque + ", ligado=" +(isLigado()?"ligado":"desligado ") + ", litrosNoTanque="
                + litrosNoTanque + ", modelo=" + modelo + ", potencia=" + potencia + ", velocidadeAtual="
                + velocidadeAtual + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }
    
    
    





    
}