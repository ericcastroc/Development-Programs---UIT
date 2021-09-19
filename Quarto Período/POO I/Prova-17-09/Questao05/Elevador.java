/*Questão 5 – 5 pontos - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio, excluindo o térreo, capacidade do elevador, 
e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço); 
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele); 
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo); 
Encapsular todos os atributos da classe (criar os métodos set e get).
 */

package Questao05;

public class Elevador {

    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int pessoasElevador;

    public Elevador(int capacidadeDoElevador, int totalDeAndares) {
        setCapacidadeDoElevador(capacidadeDoElevador);
        setTotalDeAndares(totalDeAndares);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        if (totalDeAndares > 0){
            this.totalDeAndares = totalDeAndares;
        }
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        if (capacidadeDoElevador > 0){
            this.capacidadeDoElevador = capacidadeDoElevador;
        }
    }

    public int getPessoasElevador() {
        return pessoasElevador;
    }

    public void setPessoasElevador(int pessoasElevador) {
        this.pessoasElevador = pessoasElevador;
    }

    public void entrar() {
        if (pessoasElevador < capacidadeDoElevador) {
            pessoasElevador++;
        }
    }

    public void sair() {
        if (pessoasElevador > 0) {
            pessoasElevador--;
        }
    }

    public void sobe() {
        if (andarAtual < totalDeAndares) {
            andarAtual++;
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public String imprimeDetalhe() {
        return "Pessoas no elevador: " + getPessoasElevador() + "\nAndar Atual: " + getAndarAtual();
    }

    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", capacidadeDoElevador=" + capacidadeDoElevador
                + ", pessoasElevador=" + pessoasElevador + ", totalDeAndares=" + totalDeAndares + "]";
    }

}
