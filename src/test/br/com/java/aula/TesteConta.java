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
	public void DadosConta() {
		assertEquals("Marcelo", conta.GetTitular());
		assertEquals(0, conta.GetSaldo(), 0);
	}
	
	@Test
	public void CreditoConta() {
		conta.Credito(100);
		assertEquals(100, conta.GetSaldo(), 0);
	}

}
