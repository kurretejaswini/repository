package world;

import static org.junit.Assert.*;

import org.junit.Test;

public class removingduplicatesTest {

	@Test
	public void test() {
		removingduplicates rd=new removingduplicates();
		String result=rd.remov("latha");
		assertEquals("lath",result);
		
		}
}


