import java.io.File;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//Tyson Lawrence


public class BackEnd {

	private int count;
	private boolean buttonPressed;
	
	public boolean isButtonPressed() {
		return buttonPressed;
	}

	public int getCount() {
		return count;
	}

	public BackEnd(int x)
	{this.count=count;
	 this.buttonPressed=buttonPressed;
	 count=x;
	 updateCount(x);
	 editFile("testcsv.txt",x);	
	}
    
	
	private static void editFile(String filename,int count)
	{Path pathtoFile=Paths.get(filename);
	 try(BufferedWriter bw=Files.newBufferedWriter(pathtoFile, StandardCharsets.US_ASCII))
	   { Integer countstring= new Integer(count);
		 bw.write(countstring.toString()+",");
	   }
	  catch (IOException ioe)
	 {ioe.printStackTrace();}
	
	}
	
	public int updateCount(int count)
	{if (buttonPressed)
	 {count++;}
	else
	 {count=count+0;}
	return count;
	}	
	
	private static List<String> readScores(String filename)
	{List<String>Scores=new ArrayList<>();
	Path pathToFile=Paths.get(filename);
	try (BufferedReader br=Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
	 
	 {String line=br.readLine();
	  while (line!=null)
	   {String[]scoreString=line.split(",");
	    String name=new String(scoreString[0]);
	    Integer score= new Integer(scoreString[1]);
	    Scores.add(name+","+score.toString());
	    line=br.readLine();
	   }
	 }
	  
	    catch (IOException ioe)
		{ioe.printStackTrace();
			
		}
	return Scores;
	}   
	 
		
	
		
	

   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

