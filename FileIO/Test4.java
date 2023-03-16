import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
public class Test4{
    public static void main(String[] args){
		try{
		FileInputStream fis=new FileInputStream("sample.txt");
		BufferedInputStream bs=new BufferedInputStream(fis);
		int ch;
		while((ch=bs.read())!=-1){
			System.out.print((char)ch);
		    }
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}