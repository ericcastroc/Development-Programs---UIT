package teste_para_iniciantes;

import junit.framework.TestCase;
import java.util.ArrayList;

public class BibliotecaTeste extends TestCase {
	
	private Livro L1;
	private Livro L2;
	private Pessoa p1;
	private Pessoa p2;
	private Biblioteca b1;

	public void testBiblioteca() {
		Biblioteca b1 = new Biblioteca("Orozina Melo Ferreira");
		
		assertEquals("Orozina Melo Ferreira", b1.nome);
		
		assertTrue(b1.livros instanceof ArrayList);
		assertTrue(b1.pessoas instanceof ArrayList);
	}

	
	public void setUp() {
		L1 = new Livro ("Livro 1");
		L2 = new Livro ("Livro 2");
		p1 = new Pessoa();
		p2 = new Pessoa();
		p1.setNome("Rodrigo");
		p2.setNome("Bia");
		
		b1 = new Biblioteca("Teste");
	}
	
	
	public void testAddLivro() {
		//cria objeto de teste
		setUp();
		
		//Garante que o objeto está vazio
		assertEquals(0, b1.getLivros().size());
		
		//adicionar os 2 objetos livros (criados no setUp) à lista de livros
		b1.addLivro(L1);
		b1.addLivro(L2);
		
		//Garante que o objeto não esta mais vazio, apos as inclusões
		assertEquals(2, b1.getLivros().size());
		
		//testando o metodo remover
		b1.removeLivro(L1);
		assertEquals(1,b1.getLivros().size()); //com a remoção de um livro, o valor esperado para o tamanho = 1
		
		b1.removeLivro(L2);
		assertEquals(0,b1.getLivros().size()); //com a remoção de um livro, o balor esperado para o tamanho = 0
	
	}
	
	public void testAddPessoa() {
		//cria objetos de teste
		setUp();
		
		//inserindo e removendo pessoas
		assertEquals(0, b1.getPessoas().size());
		
		b1.addPessoa(p1);
		b1.addPessoa(p2);
		
		assertEquals(2, b1.getPessoas().size());
		
		b1.removePessoa(p1);
		
		assertEquals(1, b1.getPessoas().size());
		
		b1.removePessoa(p2);
		
		assertEquals(0, b1.getPessoas().size());
		
	}
	
	
}
