/* Criar uma classe celular com os seguintes
 campos: modelo, nivelBateria, 
 ligado (tipo boolean) e som.
 O usuário pode carregar o celular,
 aumentar e diminuir o som e jogar, ao 
 jogar ele poderá escolher o jogo e a
 bateria deverá gastar quando jogar.
O jogo deverá ser um par ou impar onde 
o usuário escolher (par ou impar) e 
o sistema gera um número aleatorio e diz
se ganhou ou perdeu.
 O usuário somente poderá controlar o som
 e jogar se o celular estiver ligado.
 Criar uma classe TestaCelular e criar 
 um menu para o usuário interagir.

Na aula do dia 10, alguns alunos deverão apresentar os projetos.  */

import java.util.Random;
import java.util.Scanner;

public class Celular {

    private String modelo;
    private int nivelBateria;
    private boolean ligado;
    private int som;

    Scanner input = new Scanner(System.in);

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria > 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        if (getNivelBateria() <= 0) {
            System.out.println("!!!Telefone Sem Bateria!!!");
            return;
        }
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public int getSom() {
        return som;
    }

    public void setSom(int som) {
        if (som > 0 && som <= 100) {
            this.som = som;
        }
    }

    public void aumentarSom() {
        if (getNivelBateria() <= 0 || isLigado() == false) {
            return;
        }
        som += 20;
    }

    public void abaixarSom() {
        if (getNivelBateria() <= 0 || isLigado() == false) {
            return;
        }
        som -= 20;
    }

    public void carregar() {
        nivelBateria += 10;
    }

    public void carregarTotal() {
        nivelBateria = 100;
    }

    public void usoBateria() {
        nivelBateria -= 20;
    }

    String celularEstado() {
        if (ligado == true) {
            return "Ligado";
        } else {
            return "Desligado";
        }
    }

    // usuario passa o numero 0 para par e 1 para impar
    public boolean jogar(int num, int parImpar) {
        if (ligado) {
            Random aleatorio = new Random();
            int numPc = (aleatorio.nextInt()) % 2;
            int soma = numPc + num;
            if (soma % 2 == parImpar) {
                return true;
            } else {
                return false;
            }
        } return false;
    }

    public String imprimeDetalhe() {
        return "\n\tEspecificações" + "\nModelo: " + getModelo() + "\nNível da bateria: " + nivelBateria + "%"
                + "\nNivel do som: " + getSom() + "%" + "\nCelular " + celularEstado() + "\n";

    }
}
