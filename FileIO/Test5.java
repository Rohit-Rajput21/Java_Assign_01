import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
public class Test5{
    public static void main(String[] args){
		try{
		FileOutputStream fis=new FileOutputStream("sample.txt");
		BufferedOutputStream bs=new BufferedOutputStream(fis);
		String s="\n Be positive ";
		byte b[]=s.getBytes();
		bs.write(b);
		bs.close();
		fis.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}