package MY_TEST;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThirdTest {

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
		
		assertEquals(8,langTest.second(ch, des));
	}
	//��Դ���Ĵ�����в�������
	@Test
	public void test2()
	{
		Mytest langTest=new Mytest();
		
		String ch="as123";
		String des="1";
			
		assertEquals(3,langTest.second(ch, des));
	}


}
