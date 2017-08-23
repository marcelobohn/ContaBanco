package test.br.com.java.aula;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.java.aula.Conta;

public class TesteConta {

	private Conta conta;
	
	@Before
	public void before() {
		conta = new Conta("Marcelo", "2-2", "123-4");
	}

	@Test
	public void test() {
		assertEquals(conta.GetTitular(), "Marcelo");
		assertEquals(conta.GetSaldo(), 0, 0);
	}

}
