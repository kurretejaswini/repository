package world;

import java.util.ArrayList;

public class swapping {
	public ArrayList<Integer> swappingElements(int a, int b)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		a=a+b;
		b=a-b;
		a=a-b;
		ar.add(a);
		ar.add(b);
		return ar;
	}
	}

