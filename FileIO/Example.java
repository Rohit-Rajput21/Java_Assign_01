import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Example{
    public static void main(String[] args){
		File file=null;
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try{
		    file = new File("myfile.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			fileReader = new FileReader(file);
		    bufferedReader = new BufferedReader(fileReader);
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
		finally{
			try{
			    bufferedReader.close();
				fileReader.close();
			}catch(IOException e){
				System.out.println("Problem in closing file :"+file.getName());
			}catch(NullPointerException e){
				System.out.println("Problem in closing file :"+file.getName());
			}
		}
	}
}