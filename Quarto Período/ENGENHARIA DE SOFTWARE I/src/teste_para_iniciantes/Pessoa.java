package teste_para_iniciantes;

public class Pessoa {
	//Atributos 
	
	private String nome;
	private int maxLivros;
	
	//Construtor
	
	public Pessoa() {
		nome = "Nome Desconhecido";
		maxLivros = 3;
	}
	
	//Metodos 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String outroNome) {
		nome = outroNome;
	}
	
	public int getMaxLivros() {
		return maxLivros;
	}
	
	public void setMaxLivros(int outroValor) {
		maxLivros = outroValor;
	}
	
	public String toString() {
		return this.getNome() + " (" + this.getMaxLivros() + " livros)";
	}
}
