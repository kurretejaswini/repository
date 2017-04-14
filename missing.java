package world;

import java.util.ArrayList;

public class missing {
	
	public String miss(int a[]){
		String p="";
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int j = a[0];
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		    j++;
		    }
		}
		
		
		
		for(int r : arr)
		{
		     p=p+String.valueOf(r);
		}
		return p;

	}

	

}
