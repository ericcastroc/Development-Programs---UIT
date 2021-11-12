package teste_para_iniciantes;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(LivroTeste.class);
		suite.addTestSuite(PessoaTeste.class);
		suite.addTestSuite(BibliotecaTeste.class);
		//$JUnit-END$
		return suite;
	}

}
