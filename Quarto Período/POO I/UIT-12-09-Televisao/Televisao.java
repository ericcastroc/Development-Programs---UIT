/* Crie uma classe Televisao com métodos que podem controlar o volume e trocar os canais da televisão. A TV só funciona ligada e deve ter limites de volume e canais. 
Os canais ao chegar no último volta para o primeiro. Crie os seguintes controles: aumentar ou diminuir a potência do volume de som em uma unidade de cada vez; 
aumentar e diminuir o número do canal em uma unidade trocar para um canal indicado ou subir um canal caso não seja informado o canal; consultar o valor do volume de som e o 
canal selecionado. Crie dois construtores para a TV, um que recebe apenas a marcad da TV e outro que recebe a marca, quantidade de canais e volume máximo. 
Crie o método toString que mostrará a marca da TV, o volume e o canal atual. Crie menu para interagir com a TV. Utilize métodos Get e Set. */ 

public class Televisao {
    private int volumeMaximo;
    private int quantidadeCanais;
    private String marca;
    private boolean ligada;
    private int volume;
    private int canal;
    
    
    
    public Televisao(String marca) {
        this.marca = marca;
    }

    

    public Televisao(String marca, int quantidadeCanais, int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
        this.quantidadeCanais = quantidadeCanais;
        this.marca = marca;
    }



    public String getMarca() {
        return marca;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }
    
    public int getVolume() {
        return volume;
    }

    public void aumentarVolume(){
        if(ligada==true && volume>=0 && volume<volumeMaximo){
            volume++;
        }else{
            volume=volumeMaximo;
        }
    }

    public void abaixarVolume(){
        if(ligada==true && volume>0 && volume<=volumeMaximo){
            volume--;
        }
    }
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(ligada==true && canal>0 && canal<=quantidadeCanais){
        this.canal = canal;
        }
    }

    public void aumentarCanal(){
        if(ligada==true && canal>=0 && canal<quantidadeCanais){
            canal++;
        }else if(canal>=quantidadeCanais){
            canal=0;
        }
    }

    public void abaixarCanal(){
        if(ligada==true && canal>0 && canal<quantidadeCanais){
            canal--;
        }else if(canal==0){
            canal=quantidadeCanais;
        }
    }

    

    public int getVolumeMaximo() {
        return volumeMaximo;
    }



    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }



    public int getQuantidadeCanais() {
        return quantidadeCanais;
    }



    public void setQuantidadeCanais(int quantidadeCanais) {
        this.quantidadeCanais = quantidadeCanais;
    }



    public String imprimeDetalhe(){
        return  " O a teleevisão está "+ (isLigada()?"ligado":"desligado ") +
                "\n Volume: " + getVolume() + 
                "\n Canal: " + getCanal();
    }



    public String toString() {
        return "Televisao [canal=" + canal + ", marca=" + marca + ", volume=" + volume + "]";
    }
    
    

}
