package teste_para_iniciantes;

public class Livro {
	
	//Atributos
	
	private String titulo;
	private String autor;
	private Pessoa pessoa; //objeto do tipo Pessoa
	
	//Construtor
	public Livro(String string) {
		titulo = string;
		autor ="nome qualquer";
	}
	
	//Metodos
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setPessoa(Pessoa p) {
		this.pessoa = p;
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
}
