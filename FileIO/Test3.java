import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Test3{
    public static void main(String[] args){
		try{        // writing to a file
		Scanner sc=new Scanner(new File("sample.txt"));
		while(sc.hasNextLine()){
			String line=sc.nextLine();
			System.out.println(line);
		}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}