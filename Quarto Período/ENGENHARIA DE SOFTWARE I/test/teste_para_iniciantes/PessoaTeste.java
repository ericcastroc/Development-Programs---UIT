package teste_para_iniciantes;


import junit.framework.TestCase;

public class PessoaTeste extends TestCase {

	
	public void testPessoa() {
		Pessoa p1 = new Pessoa();
		assertEquals("Nome Desconhecido", p1.getNome());
		assertEquals(3, p1.getMaxLivros());
	}
	
	public void testSetNome() {
		Pessoa p2 = new Pessoa();
		p2.setNome("Luciana");
		assertEquals("Luciana", p2.getNome());
	}

	public void testSetMaxLivros() {
		Pessoa p3 = new Pessoa();
		p3.setMaxLivros(10);
		assertEquals(10, p3.getMaxLivros());
	}

	public void testeToString() {
		Pessoa p4 = new Pessoa();
		p4.setNome("Ubirajara Silva");
		p4.setMaxLivros(9);
		String resultado = "Ubirajara Silva (9 livros)";
		assertEquals(resultado, p4.toString());
	}
	
}
