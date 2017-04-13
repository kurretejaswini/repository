package world;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest 
{
	ArrayList<Integer> al2;
	ArrayList<Integer> al1=null;
	@Before
	public void setUp()
	{
		al2=new ArrayList<Integer>();
	}
	@Test
	public void test() {
		 MergeSort ms=new  MergeSort();
		  al1=ms.mergSort(new int[] {1,5,9,3}, new int[]{6,7});
		  al2.add(1);
		  al2.add(3);
		  al2.add(5);
		  al2.add(6);
		  al2.add(7);
		  al2.add(9);
		   assertTrue(al2.equals(al2));
		 
				 
		 
	}

}
