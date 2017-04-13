package world;
import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Before;
import org.junit.Test;

public class ArrayDuplicatesTest {
	HashSet<Integer> hs2;
	HashSet<Integer> hs1=null;
	@Before
	public void setUp()
	{
		hs2=new HashSet<Integer>();
	}
	@Test
	public void test() {
		ArrayDuplicates ad=new ArrayDuplicates();
		hs1=ad.RemoveDuplicates(new int[]{1,2,3,3,5});
		hs2.add(1);
		hs2.add(2);
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		assertTrue(hs1.equals(hs2));
	}

}
