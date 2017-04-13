package world;

import java.util.HashSet;

public class ArrayDuplicates {
public HashSet<Integer>RemoveDuplicates(int[] arr)
{
	HashSet<Integer> al=new HashSet<Integer>();
	
	for(int i=0;i<arr.length;i++)
		al.add(arr[i]);
	
	return al;	
}
}



