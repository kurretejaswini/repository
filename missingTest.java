package world;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class missingTest {

	@Test
	public void test() {
		missing m=new missing();
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
	
			
				String result=m.miss(new int[]{1,2,4,6,8,9,10});
				arr.add(3);
				arr.add(5);
				arr.add(7);
				
				assertEquals("357",result);
				
				
			}
}