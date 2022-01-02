/*Crie uma classe produto que possui os atributos(propriedades): nome, valor. Implemente os métodos getters e setters. */

public class Produto{
    
    private String nome;
    private double valor;


    public Produto(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + "]";
    } 
    
}