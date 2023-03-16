import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Test2{
    public static void main(String[] arg)// throws FileNotFoundException
	{
		System.out.println("Welcome.....");
		PrintWriter pw=new PrintWriter("xyz.txt");
		pw.print("Hello");
		System.out.println("program for throws keyword...");
		pw.close();
		
	}
}