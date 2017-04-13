package world;

public class removingduplicates {
 public String remov(String s){
			int l=0;
	if(s!=null)
			 l=s.length();
char ch;
		String ans="";
for(int i=0;i<l;i++)
			{
	ch=s.charAt(i);
			if(ch!=' ')
				ans=ans+ch;
s=s.replace(ch,' ');
			}
		
return ans;
		}
}


