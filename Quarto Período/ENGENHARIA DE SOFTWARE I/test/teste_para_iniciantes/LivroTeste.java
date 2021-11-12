package teste_para_iniciantes;

import junit.framework.TestCase;

public class LivroTeste extends TestCase {

	public void testLivro() {
		Livro L1 = new Livro("Java: Como programar");
		assertEquals("Java: Como programar", L1.getTitulo());
		assertEquals("nome qualquer", L1.getAutor());
		
	}

	public void testSetTitulo() {
		Livro L2 = new Livro ("Java: Como programar");
		L2.setTitulo("UX Design");
		assertEquals("UX Design", L2.getTitulo());
	}

	public void testSetAutor() {
		Livro L3 = new Livro("Java: Como programar");
		L3.setAutor("Deitel & Deitel");
		assertEquals("Deitel & Deitel", L3.getAutor());
	}
	
	public void testeGetPessoa() {
		Livro L4 = new Livro("A grande virada");
		Pessoa p1 = new Pessoa();
		p1.setNome("Baltazar da Rocha");
		
		//metodo que indica que o livro foi emprestado para esta pessoa
		L4.setPessoa(p1);
		
		//recuperar o nome da pessoa que esta com o livro 
		String quemPegouLivro = L4.getPessoa().getNome();
		assertEquals("Baltazar da Rocha", quemPegouLivro);
		
		
	}
}
