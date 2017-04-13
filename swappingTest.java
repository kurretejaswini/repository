package world;

import static org.junit.Assert.*;
import world.swapping;
import java.util.ArrayList;

import org.junit.Test;

public class swappingTest {

	@Test
	public void test() {
		swapping sp=new swapping();
		ArrayList<Integer> result=sp.swappingElements(5,3);
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(3);
		ar2.add(5);
		assertTrue(ar2.equals(result));
	}

}
