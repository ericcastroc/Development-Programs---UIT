/*Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da RAM, número de processadores e fabricante. 
Crie métodos de acesso público e reimplemente o método toString() da classe. Crie um construtor para passar todos os atributos durante a criação do objeto. 

Crie o atributo booleano ligado e um método para ligar e desligar o computador. Todo computador quando for criado deve estar desligado. 
Crie o método estadoComputador que retorna se ele está ligado ou desligado.

Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores que irá receber os dados do computador pelo usuário. 
Depois imprima os dados dos computadores que possuem mais que 512Mb de Ram usando o método toString.

Se conseguir fazer o cadastro por menu é muito bom. Boa sorte.*/

public class Computador {

    private int tamanhoHd;
    private int tamanhoRam;
    private int numProcessadores;
    private String fabricante;
    private boolean ligado;

    public Computador(int tamanhoHd, int tamanhoRam, int numProcessadores, String fabricante) {
        this.tamanhoHd = tamanhoHd;
        this.tamanhoRam = tamanhoRam;
        this.numProcessadores = numProcessadores;
        this.fabricante = fabricante;

    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public int getTamanhoHd() {
        return tamanhoHd;
    }

    public int getTamanhoRam() {
        return tamanhoRam;
    }

    public int getNumProcessadores() {
        return numProcessadores;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String toString() {
        return "Computador [Fabricante=" + fabricante + ", Numero de Processadores=" + numProcessadores + ", Tamanho do HD="
                + tamanhoHd + ", Tamanho da Memoria Ram=" + tamanhoRam + "]";
    }

    public String estadoComputador(){
        if(ligado){
        return "Computador Ligado.";
        }else{
            return "Computadro Desligado.";
        }
    }
    
}
