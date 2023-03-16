import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Test2{
    public static void main(String[] args){
		try{        // writing to a file
		FileWriter fw=new FileWriter("sample.txt",true);
		fw.write("Honesty is a good policy.");
		fw.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}