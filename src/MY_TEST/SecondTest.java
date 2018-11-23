package MY_TEST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SecondTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() 
	{
		Mytest langTest=new Mytest();
		String ch="liang li peng";
		assertEquals("lianglipeng",langTest.first(ch));
	}
	
	@Test
	public void test2() 
	{
		Mytest langTest=new Mytest();
		String ch="L i p e n g L I A N G";
		assertEquals("LipengLIANG",langTest.first(ch));
	}
}
