package world;


import static org.junit.Assert.*;

import org.junit.Test;

public class primefactorTest {

	@Test
	public void test() {
		primefactor pf=new primefactor();
		String result=pf.prime(25);
		assertEquals("55",result);
	}
	}


