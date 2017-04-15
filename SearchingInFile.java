package world;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
public class SearchingInFile 
{
	public String directory(String s,String directory) throws IOException
	{
		String s1="";
	 File f=new File(directory);
	 File[] listOfFiles = f.listFiles();
	 BufferedReader bufferedReader=null;
	 try
	 	{
	 for(File file : listOfFiles)
		 	{
			 if(file.isFile())
		 	{
	 bufferedReader = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(file.getAbsolutePath()))));
				 String line;
			 int lineNumber = 0;
		 while ((line = bufferedReader.readLine()) != null)   
				 	{
         		lineNumber++;
               			if(line.contains(s))
               			{
               				
 System.out.println(file.getName()+",linenumber:"+lineNumber+","+s);
     s1=s1+file.getName()+",linenumber:"+String.valueOf(lineNumber)+","+s;
               			}
				 	}
	}
		 	}
	 	}
   catch(FileNotFoundException cnfe)
       {
    	   cnfe.printStackTrace();
       }
	   finally
       {
    		if(bufferedReader!=null)
    		bufferedReader.close();
        }
    	   
  return s1;
     }
}

        


