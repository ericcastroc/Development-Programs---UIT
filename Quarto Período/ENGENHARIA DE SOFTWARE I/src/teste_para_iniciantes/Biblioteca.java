package teste_para_iniciantes;

import java.util.ArrayList;

public class Biblioteca {
	
	//Atributos 
	
	String nome;
	ArrayList<Livro> livros;
	ArrayList<Pessoa> pessoas;
	private Livro L1;
	private Livro L2;
	private Pessoa p1;
	private Pessoa p2;
	private Biblioteca b1;
	
	//Construtor
	public Biblioteca(String nome) {
		this.nome = nome;
		livros = new ArrayList<Livro>();
		pessoas = new ArrayList<Pessoa>();
		
		
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	

	
	public void addLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void removeLivro(Livro livro) {
		this.livros.remove(livro);
	}
	
	public void addPessoa(Pessoa p) {
		this.pessoas.add(p);
	}
	
	public void removePessoa(Pessoa p) {
		this.pessoas.remove(p);
	}
}
