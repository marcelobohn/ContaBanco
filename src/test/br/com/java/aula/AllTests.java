package test.br.com.java.aula;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TesteConta.class, 
	TesteCorrentista.class })
public class AllTests {

}
