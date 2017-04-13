package world;


	public class primefactor {
		public String prime(int n){
			
			String s="";
			int i=2;
			while(n>1)
			  {
			   if(n%i == 0)
			    {
			     
			      s=s+String.valueOf(i);
			     n=n/i;
			    }
			   else
			    i++;
			  }
			return s;
			
		}

}
