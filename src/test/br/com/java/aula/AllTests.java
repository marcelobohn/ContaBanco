package test.br.com.java.aula;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteConta.class, TesteCorrentista.class, TesteBanco.class, TesteUtil.class })
public class AllTests {

}
