import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class BackEnd {

	private int count;
	
	public int getCount() {
		return count;
	}

	public BackEnd(int x)
	{this.count=count;
	 count=x;
	 editFile("testcsv.txt",x);	
	}
    
	
	private static File editFile(String filename,int count)
	{Path pathtoFile=Paths.get(filename);
	 try(BufferedWriter bw=Files.newBufferedWriter(pathtoFile, StandardCharsets.US_ASCII))
	   { Integer countstring= new Integer(count);
		 String line=bw.write(countstring.toString()+",");
		 
	   }
	}
	

   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
