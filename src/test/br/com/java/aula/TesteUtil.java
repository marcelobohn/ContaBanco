package test.br.com.java.aula;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

import br.com.java.aula.Banco;
import br.com.java.aula.Util;

public class TesteUtil {

	@Test
	public void TestaLeConsole() {
	    String input = "teste";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    String r = Util.LeConsole();	    
	    assertTrue(r.equals("teste"));
	}
}
