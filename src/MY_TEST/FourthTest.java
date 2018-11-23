package MY_TEST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FourthTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() 
	{
		Mytest langTest=new Mytest();
		String ch="L i p e n g L I A N G";
		assertEquals("È«²¿Ð¡Ð´",langTest.third(ch));
	}

}
