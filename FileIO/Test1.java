import java.io.File;
import java.io.IOException;
public class Test1{
    public static void main(String[] args){
		try{
		File f=new File("sample.txt");
		if(f.exists()){
			System.out.println("File already exist...");
		}
		else{
			f.createNewFile();
			System.out.println("File is created successfully");
		    }
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}