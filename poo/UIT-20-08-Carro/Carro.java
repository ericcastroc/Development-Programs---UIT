public class Carro{
    private boolean ligado;
    private double capacidadeTanque;
    private double combustivel;
    private double velocidade;

    public boolean isLigado() {
        return ligado;
    }
    public void Ligar(){
        ligado = true;
    }

    public void Desligado(){
        ligado = false;
    }

    public double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double valor) {
        if(valor>0 && valor<=290)
        this.capacidadeTanque = valor;
    }

    public double getCombustivel() {
        return combustivel;
    }
    
    public void abastecer(double litros){
        if(litros>= capacidadeTanque)
        this.combustivel = litros;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double valor) {
        if(valor>0 && valor<=508.73)
        this.velocidade = valor;
    }

    public void acelerar(){
        this.velocidade+=20;
        this.combustivel--;
        
    }

    String estado(){
        if(ligado==true){
            return "Ligado";
        }else{
            return "Desligado";
        }
    }

    public String imprimeDetalhe(){
        return"\nEstado do Carro: " + estado() + 
               "\nCapacidade do Tanque: " + getCapacidadeTanque() + 
               "\nCombustivel do Carro: " + getCombustivel() + 
               "\nVelocidade Total do Carro: " + getVelocidade();

    }
    
}