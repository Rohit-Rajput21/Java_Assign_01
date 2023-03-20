import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Example3{
    public static void main(String[] args){
		File  file = new File("myfile.txt"); 
		try(FileReader fileReader = new FileReader(file);                       // try with resouce allocation 
		    BufferedReader bufferedReader = new BufferedReader(fileReader);){   // It is automatically called the close method			
		    if(!file.exists()){                                                  // we dont use to finally block to close the resources.                
			    file.createNewFile();
			}
			String line = bufferedReader.readLine();
			while(line!=null){
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File does not exists :"+file.getName());
		}
		catch(IOException e){
			System.out.println("Problem in reading file :"+file.getName());
		}
	}
}