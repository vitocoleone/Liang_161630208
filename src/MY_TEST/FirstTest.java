package MY_TEST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {

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
		
		String ch="as dddd123";
		String des="1";
		
		assertEquals(1,langTest.main(ch, des));
	}
	//针对代码的错误进行测试用例
	@Test
	public void test2()
	{
		Mytest langTest=new Mytest();
		
		String ch="as123";
		String des="1";
			
		assertEquals(1,langTest.main(ch, des));
	}


}
